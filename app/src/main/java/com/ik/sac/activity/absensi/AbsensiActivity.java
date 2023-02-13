package com.ik.sac.activity.absensi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.activity.absensi_lembur.AbsensiLemburActivity;
import com.ik.sac.activity.absensi_riwayat.AbsensiRiwayatActivity;
import com.ik.sac.activity.login.LoginActivity;
import com.ik.sac.utils.Tools;

public class AbsensiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_absen = findViewById(R.id.btn_absen);
        btn_absen.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiActivity.this, AbsensiJamkerActivity.class);
            startActivity(i);
        });

        LinearLayout btn_lembur = findViewById(R.id.btn_lembur);
        btn_lembur.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiActivity.this, AbsensiLemburActivity.class);
            startActivity(i);
        });

        LinearLayout btn_riwayat = findViewById(R.id.btn_riwayat);
        btn_riwayat.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiActivity.this, AbsensiRiwayatActivity.class);
            startActivity(i);
        });

        LinearLayout btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(v -> {
            finish();
        });

    }

}