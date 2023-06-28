package com.example.immunode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChildDisplayActivity extends AppCompatActivity {
    TextView childNameDB, childAgeDB, childDOBDB, childHospitalDB;
    Button editButton;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_display);

        childNameDB = findViewById(R.id.editChildName);
        childAgeDB = findViewById(R.id.editChildAge);
        childDOBDB = findViewById(R.id.editChildDOB);
        childHospitalDB = findViewById(R.id.editChildHospital);
        editButton = findViewById(R.id.saveButton);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("childDetails");

                String childName = childNameDB.getText().toString();
                String childAge = childAgeDB.getText().toString();
                String childDOB = childDOBDB.getText().toString();
                String childHospital = childHospitalDB.getText().toString();

                ChildHelperClass helperClass = new ChildHelperClass(childName, childAge, childDOB, childHospital);
                reference.child(childName).setValue(helperClass);

                Intent intent = new Intent(ChildDisplayActivity.this, ChildActivity.class);
                startActivity(intent);
            }
        });

    }
}
