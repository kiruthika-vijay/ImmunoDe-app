package com.example.immunode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ParentActivity extends AppCompatActivity {
    TextView fatherNameDB, fatherMobileDB, fatherAgeDB, motherNameDB, motherMobileDB, motherAgeDB;
    Button editButton;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        editButton = findViewById(R.id.editButton);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(ParentActivity.this, ParentDisplayActivity.class);
                startActivity(intent);
            }
        });

    }
}
