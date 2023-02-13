package com.ik.sac.activity.absensi_jamker;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi.AbsensiActivity;
import com.ik.sac.activity.absensi_scan.AbsensiScanActivity;
import com.ik.sac.utils.Tools;

public class AbsensiJamkerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_jamker);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_absen = findViewById(R.id.btn_absen_masuk);
        btn_absen.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiJamkerActivity.this, AbsensiScanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_absen_pulang = findViewById(R.id.btn_absen_pulang);
        btn_absen_pulang.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiJamkerActivity.this, AbsensiScanActivity.class);
            startActivity(i);
        });

    }

}