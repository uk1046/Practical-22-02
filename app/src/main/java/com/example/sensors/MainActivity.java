package com.example.sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    private SensorManager s1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.view1);
        s1=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
                List<Sensor> l1= s1.getSensorList(Sensor.TYPE_ALL);
                StringBuilder sb= new StringBuilder();
                for(Sensor s2: l1){
                    sb.append(s2.getName()+"\n");
                    t1.setText(sb);
                }
    }
}