package com.ik.sac.activity.pekerjaan_riwayat_detail;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pekerjaan_riwayat_laporan.PekerjaanRiwayatLaporanActivity;
import com.ik.sac.utils.Tools;

public class PekerjaanRiwayatDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan_riwayat_detail);
        Tools.setSystemBarColorInt(this, Color.parseColor("#349E02"));

        LinearLayout btn_detail_laporan = findViewById(R.id.btn_detail_laporan);
        btn_detail_laporan.setOnClickListener(v -> {
            Intent i = new Intent(PekerjaanRiwayatDetailActivity.this, PekerjaanRiwayatLaporanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(v -> {
            finish();
        });

    }

}