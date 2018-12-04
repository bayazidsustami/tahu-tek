package com.example.ryan.bottomnavigation;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.ryan.bottomnavigation.Mitra.MitraActivity;
import com.example.ryan.bottomnavigation.session.SessionManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button btnLogin;
    ProgressBar loading;
    SessionManager sessionManager;

    private static String URL_LOGIN = "http://insanet.esy.es/login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sessionManager = new SessionManager(this);
        sessionManager.checkLogin();

        loading = findViewById(R.id.loading);

        email = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mEmail = email.getText().toString().trim();
                String mPass = password.getText().toString().trim();

                if (!mEmail.isEmpty() || !mPass.isEmpty()) {
                    login(mEmail, mPass);
                } else {
                    email.setError("masukkan email");
                    password.setError("masukkan password");
                }

            }
        });
    }

    private void login(final String email, final String password){
        loading.setVisibility(View.VISIBLE);
        btnLogin.setVisibility(View.GONE);

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String success = jsonObject.getString("success");

                            JSONArray jsonArray = jsonObject.getJSONArray("login");

                            if(success.equals("1")){
                                loading.setVisibility(View.GONE);
                                btnLogin.setVisibility(View.VISIBLE);

                                for (int i=0; i<jsonArray.length(); i++ ){
                                    JSONObject object = jsonArray.getJSONObject(i);

                                    String nama = object.getString("nama").trim();
                                    String email = object.getString("email").trim();
                                    String user = object.getString("jenis_user").trim();

                                    sessionManager.createSession(nama, email);

                                   if (user.equals("Admin")){
                                       Intent admin = new Intent(LoginActivity.this, AdminActivity.class);
                                       startActivity(admin);
                                   } else if (user.equals("Mitra")){
                                       Intent mitra = new Intent(LoginActivity.this, MitraActivity.class);
                                       startActivity(mitra);
                                   } else {
                                       Toast.makeText(LoginActivity.this, "account incorrect", Toast.LENGTH_LONG).show();
                                   }
                                }
                            }
                        } catch (JSONException e) {
                            loading.setVisibility(View.GONE);
                            btnLogin.setVisibility(View.VISIBLE);

                            e.printStackTrace();
                            Toast.makeText(LoginActivity.this,"Error login"+e.toString(), Toast.LENGTH_LONG).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        loading.setVisibility(View.GONE);
                        btnLogin.setVisibility(View.VISIBLE);

                        Toast.makeText(LoginActivity.this,"Error Request"+error.toString(), Toast.LENGTH_LONG).show();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                params.put("email", email);
                params.put("password", password);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
