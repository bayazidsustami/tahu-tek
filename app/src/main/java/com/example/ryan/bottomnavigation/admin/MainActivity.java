package com.example.ryan.bottomnavigation.admin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;

import com.example.ryan.bottomnavigation.R;
import com.example.ryan.bottomnavigation.admin.Bahans.BahanFragment;
import com.example.ryan.bottomnavigation.admin.Laporans.LaporanFragment;
import com.example.ryan.bottomnavigation.admin.Regist.RegistrasiFragment;
import com.example.ryan.bottomnavigation.admin.TopUps.TopupFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("");
        actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);

        mDrawerLayout = findViewById(R.id.drawer_id);

        NavigationView navigationView = findViewById(R.id.drawer_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                        menuItem.setChecked(true);

                        mDrawerLayout.closeDrawers();

                        return true;
                    }
                }
        );
        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

                    }

                    @Override
                    public void onDrawerOpened(@NonNull View drawerView) {

                    }

                    @Override
                    public void onDrawerClosed(@NonNull View drawerView) {

                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {

                    }
                }
        );

        //kita set default nya Home Fragment
        loadFragment(new RegistrasiFragment());

        //inisialisasi ButtomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);

        //beri listener pada saat item/menu buttomNavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //method untuk load fragment yang sesuai
    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
            return true;
        }

        return false;
    }

    //method listener untuk logika pemilihan
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        Fragment fragment = null;

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
