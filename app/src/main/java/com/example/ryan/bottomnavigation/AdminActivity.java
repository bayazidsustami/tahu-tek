package com.example.ryan.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ryan.bottomnavigation.admin.Bahans.BahanFragment;
import com.example.ryan.bottomnavigation.admin.Laporans.LaporanFragment;
import com.example.ryan.bottomnavigation.admin.Regist.RegistrasiFragment;
import com.example.ryan.bottomnavigation.admin.TopUps.TopupFragment;
import com.example.ryan.bottomnavigation.session.SessionManager;

public class AdminActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {

    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        sessionManager = new SessionManager(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //-----------------bottomnavview----------------------------------------------

        //kita set default nya Home Fragment
        loadFragment(new RegistrasiFragment());

        //inisialisasi ButtomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);

        //beri listener pada saat item/menu buttomNavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_logout) {
//            // Handle the camera action
//            Intent intent = new Intent(AdminActivity.this, LoginActivity.class);
//            startActivity(intent);
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }

    //------------------bottomnavigationview---------------------------
    //method untuk load fragment yang sesuai

    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
            return true;
        }

        return false;
    }

    //method listener untuk logika pemilihan
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        Fragment fragment = null;

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_logout) {
            // Handle the camera action
            Intent intent = new Intent(AdminActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        switch (item.getItemId()){
            case R.id.registrasi_menu:
                fragment = new RegistrasiFragment();
                break;
            case R.id.topup_menu:
                fragment = new TopupFragment();
                break;
            case R.id.bahan_menu:
                fragment = new BahanFragment();
                break;
            case R.id.laporan_menu:
                fragment = new LaporanFragment();
                break;
        }

        return loadFragment(fragment);
    }
}
