package com.example.bhavika.rcs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BookingActivity extends AppCompatActivity {

    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        btnDate=(Button)findViewById(R.id.btnDate);


        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDateDialog();
            }
        });
    }

    public void openDateDialog() {
           DateDialog dateDialog=new DateDialog();
           dateDialog.show(getSupportFragmentManager(),"date Dialog");



    }
}
