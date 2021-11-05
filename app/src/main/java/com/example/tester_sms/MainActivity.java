package com.example.tester_sms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;
    String minima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b2 = findViewById(R.id.cansel);
        b1 = findViewById(R.id.send);
        //b1.setEnabled(false);
        if(checkPermission(Manifest.permission.SEND_SMS))
        {
            b1.setEnabled(true);
        }else
        {
            ActivityCompat.requestPermissions(this,new String []{Manifest.permission.SEND_SMS}
                    ,SEND_SMS_PERMISSION_REQUEST_CODE);
        }



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone_num = "13033";
                String sms = minima;



                if(checkPermission(Manifest.permission.SEND_SMS)  )
                {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phone_num,null,sms,null,null);
                    Toast.makeText(MainActivity.this, "Μήνυμα εστάλη!", Toast.LENGTH_SHORT).show();

                }else
                {
                    Toast.makeText(MainActivity.this, "Άκυρη άδεια", Toast.LENGTH_SHORT).show();
                }

            }
        });




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                minima = " ";
                Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();

            }
        });


    }


    public void one_press(View view)
    {
        minima = "1 ΚΩΝΣΤΑΝΤΙΝΟΣ Γ.ΠΑΠΑΞΕΝΙΔΗΣ ΑΓ.ΠΑΝΤΕΛΕΗΜΟΝΟΣ 33";
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);

    }

    public void two_press(View view)
    {
        minima = "2 ΚΩΝΣΤΑΝΤΙΝΟΣ Γ.ΠΑΠΑΞΕΝΙΔΗΣ ΑΓ.ΠΑΝΤΕΛΕΗΜΟΝΟΣ 33";
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);

    }

    public void three_press(View view)
    {
        minima = "3 ΚΩΝΣΤΑΝΤΙΝΟΣ Γ.ΠΑΠΑΞΕΝΙΔΗΣ ΑΓ.ΠΑΝΤΕΛΕΗΜΟΝΟΣ 33";
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);

    }

    public void four_press(View view)
    {
        minima = "4 ΚΩΝΣΤΑΝΤΙΝΟΣ Γ.ΠΑΠΑΞΕΝΙΔΗΣ ΑΓ.ΠΑΝΤΕΛΕΗΜΟΝΟΣ 33";
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);

    }

    public void five_press(View view)
    {
        minima = "5 ΚΩΝΣΤΑΝΤΙΝΟΣ Γ.ΠΑΠΑΞΕΝΙΔΗΣ ΑΓ.ΠΑΝΤΕΛΕΗΜΟΝΟΣ 33";
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);

    }

    public void six_press(View view)
    {

        minima = "6 ΚΩΝΣΤΑΝΤΙΝΟΣ Γ.ΠΑΠΑΞΕΝΙΔΗΣ ΑΓ.ΠΑΝΤΕΛΕΗΜΟΝΟΣ 33";
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
    }




    public boolean checkPermission(String permission)
    {
        int check = ContextCompat.checkSelfPermission(this,permission);
        return  (check== PackageManager.PERMISSION_GRANTED);
    }


}