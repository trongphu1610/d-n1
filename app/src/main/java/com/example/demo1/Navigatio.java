package com.example.demo1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.demo1.ui.GirlWallpaper;
import com.example.demo1.ui.LuffyWallpaper;
import com.example.demo1.ui.NarutoWallpaper;
import com.example.demo1.ui.NaturaWallpaper;
import com.example.demo1.ui.art_wallpaper;
import com.example.demo1.ui.ducati_category;

import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class Navigatio extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigatio);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigatio, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void artt(View view) {
        Intent intent = new Intent(this, ducati_category.class);
        startActivity(intent);
        finish();
    }




    private void Exit() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Thoát");
        builder.setMessage("Bạn có muốn thoát không?");
        builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();



    }

    public void aaa(MenuItem item) {
        Exit();
    }
    public void bbb(MenuItem item){
        switch (item.getItemId()){
        case R.id.nav_send:
        Intent intent=new Intent(Navigatio.this,LoginActivity.class);
        intent.putExtra("data",false);
        startActivity(intent);

        finish();
        break;
    }}


    public void ducati(View view) {
        Intent intent = new Intent(this, art_wallpaper.class);
        startActivity(intent);
        }

    public void luffy(View view) {
        Intent intent = new Intent(this, LuffyWallpaper.class);
        startActivity(intent);

    }

    public void natura(View view) {
        Intent intent = new Intent(this, NaturaWallpaper.class);
        startActivity(intent);

    }

    public void naruto(View view) {
        Intent intent = new Intent(this, NarutoWallpaper.class);
        startActivity(intent);

    }

    public void girl(View view) {
        Intent intent = new Intent(this, GirlWallpaper.class);
        startActivity(intent);

    }
}


