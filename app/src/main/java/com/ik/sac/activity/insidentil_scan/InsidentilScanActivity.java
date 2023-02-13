package com.ik.sac.activity.insidentil_scan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.insidentil.InsidentilActivity;
import com.ik.sac.activity.insidentil_foto.InsidentilFotoActivity;
import com.ik.sac.utils.Tools;

public class InsidentilScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidentil_scan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#430077"));

        LinearLayout btn_scan = findViewById(R.id.btn_scan);
        btn_scan.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilScanActivity.this, InsidentilFotoActivity.class);
            startActivity(i);
        });

        LinearLayout btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilScanActivity.this, InsidentilFotoActivity.class);
            startActivity(i);
        });

    }

}