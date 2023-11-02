package com.example.accidentdetection.Firebase;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import com.example.accidentdetection.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); // Set the content view to the layout XML

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu); // Inflate the menu defined in menu.xml
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.main) {
            // Handle the "Home" menu item click
            showToast("Home Clicked");
            openMainActivity();
            return true;
        } else if (id == R.id.ProfileAct) {
            // Handle the "Profile" menu item click
            showToast("Profile Clicked");
            openProfileActivity();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void openMainActivity() {
        startActivity(new Intent(this, LoginActivity.class));
    }

    private void openProfileActivity() {
        Intent intent = new Intent(this, ProfileDetailsActivity.class);
        startActivity(intent);
    }
}
