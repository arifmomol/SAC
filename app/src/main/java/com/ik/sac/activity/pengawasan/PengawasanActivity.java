package com.ik.sac.activity.pengawasan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pekerjaan_riwayat.PekerjaanRiwayatActivity;
import com.ik.sac.activity.pekerjaan_scan.PekerjaanScanActivity;
import com.ik.sac.activity.pengawasan_laporan.PengawasanLaporanActivity;
import com.ik.sac.activity.pengawasan_riwayat.PengawasanRiwayatActivity;
import com.ik.sac.activity.pengawasan_scan.PengawasanScanActivity;
import com.ik.sac.utils.Tools;

public class PengawasanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengawasan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#93013F"));

        LinearLayout btn_pengawasan = findViewById(R.id.btn_pengawasan);
        btn_pengawasan.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanActivity.this, PengawasanScanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_pengawasan_riwayat = findViewById(R.id.btn_pengawasan_riwayat);
        btn_pengawasan_riwayat.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanActivity.this, PengawasanRiwayatActivity.class);
            startActivity(i);
        });

        LinearLayout btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(v -> {
            finish();
        });

    }

}