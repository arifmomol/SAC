package com.ik.sac.activity.pekerjaan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.activity.absensi_lembur.AbsensiLemburActivity;
import com.ik.sac.activity.absensi_riwayat.AbsensiRiwayatActivity;
import com.ik.sac.activity.pekerjaan_riwayat.PekerjaanRiwayatActivity;
import com.ik.sac.activity.pekerjaan_scan.PekerjaanScanActivity;
import com.ik.sac.utils.Tools;

public class PekerjaanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#349E02"));

        LinearLayout btn_pekerjaan_rutin = findViewById(R.id.btn_pekerjaan_rutin);
        btn_pekerjaan_rutin.setOnClickListener(v -> {
            Intent i = new Intent(PekerjaanActivity.this, PekerjaanScanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_pekerjaan_riwayat = findViewById(R.id.btn_pekerjaan_riwayat);
        btn_pekerjaan_riwayat.setOnClickListener(v -> {
            Intent i = new Intent(PekerjaanActivity.this, PekerjaanRiwayatActivity.class);
            startActivity(i);
        });

        LinearLayout btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(v -> {
            finish();
        });

    }

}