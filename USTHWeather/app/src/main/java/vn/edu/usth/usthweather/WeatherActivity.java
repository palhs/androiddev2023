package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class WeatherActivity extends AppCompatActivity {
    public static ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("WeatherActivity", "OnCreate");


        ViewPager viewPager = findViewById(R.id.viewPager);
        WeatherPagerAdapter adapter = new WeatherPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Initialize your TabLayout
        TabLayout tabLayout = findViewById(R.id.tab);
        arrayList.add("Hanoi,Vietna");
        arrayList.add("Duoc roi day,123");

        // Link the TabLayout with the ViewPager
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("WeatherActivity","OnStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("WeatherActivity","OnPause");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("WeatherActivity","OnResume");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i("WeatherActivity","OnStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity","OnDestroy");
    }
}


