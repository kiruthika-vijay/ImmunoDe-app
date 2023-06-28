package com.example.immunode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SmsActivity extends AppCompatActivity {
    CardView vaccineCard, parentCard, childCard, trackCard, smsCard, complaintCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_home:
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_remainder:
                    startActivity(new Intent(getApplicationContext(), RemainderActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_settings:
                    startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_notification:
                    startActivity(new Intent(getApplicationContext(), NotificationActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;

        });
        EditText smsNo = findViewById(R.id.smsNo);
        Button btn = findViewById(R.id.submit_sms);
        btn.setOnClickListener(new View.OnClickListener() {
            String smsNumber = smsNo.getText().toString();

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               Uri uri = Uri.parse("smsto:9840091253");
               Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
               startActivity(intent);
            }
        });
    }
}
