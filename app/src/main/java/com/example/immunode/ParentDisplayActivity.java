package com.example.immunode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ParentDisplayActivity extends AppCompatActivity {
    TextView fatherNameDB, fatherAgeDB, fatherMobileDB, motherNameDB, motherAgeDB, motherMobileDB;
    Button editButton;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_display);

        fatherNameDB = findViewById(R.id.editFatherName);
        fatherAgeDB = findViewById(R.id.editFatherAge);
        fatherMobileDB = findViewById(R.id.editFatherMobile);
        motherNameDB = findViewById(R.id.editMotherName);
        motherAgeDB = findViewById(R.id.editMotherAge);
        motherMobileDB = findViewById(R.id.editMotherMobile);
        editButton = findViewById(R.id.saveButton);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("parentDetails");

                String fatherName = fatherNameDB.getText().toString();
                String fatherAge = fatherAgeDB.getText().toString();
                String fatherMobile = fatherMobileDB.getText().toString();
                String motherName = motherNameDB.getText().toString();
                String motherAge = motherAgeDB.getText().toString();
                String motherMobile = motherMobileDB.getText().toString();

                ParentHelperClass helperClass = new ParentHelperClass(fatherName, fatherMobile, fatherAge,motherName, motherMobile, motherAge);
                reference.child(fatherName).setValue(helperClass);

                Intent intent = new Intent(ParentDisplayActivity.this, ParentActivity.class);
                startActivity(intent);
            }
        });

    }
}
