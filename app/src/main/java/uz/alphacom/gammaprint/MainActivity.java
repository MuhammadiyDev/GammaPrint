package uz.alphacom.gammaprint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView navigationTitle;
    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationTitle = (TextView)findViewById(R.id.navigation_title);
        toolbar = (Toolbar) findViewById(R.id.main_page_toolbar);

        toolbar.setTitle("Gamma Shop");

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        navigationTitle.setText("Home");
                        break;
                    case R.id.navigation_categories:
                        navigationTitle.setText("Categories");
                        break;
                    case R.id.navigation_news:
                        navigationTitle.setText("News");
                        break;
                    case R.id.navigation_account:
                        navigationTitle.setText("Account");
                        break;
                }
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}