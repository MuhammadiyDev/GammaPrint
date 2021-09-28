package uz.alphacom.gammaprint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView navigationTitle;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationTitle = (TextView)findViewById(R.id.navigation_title);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        navigationTitle.setText("Home");
                        break;
                    case R.id.navigation_dashboard:
                        navigationTitle.setText("Dashboard");
                        break;
                    case R.id.navigation_search:
                        navigationTitle.setText("Search");
                        break;
                    case R.id.navigation_notifications:
                        navigationTitle.setText("Notifications");
                        break;
                    case R.id.navigation_account:
                        navigationTitle.setText("Account");
                        break;
                }
                return false;
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}