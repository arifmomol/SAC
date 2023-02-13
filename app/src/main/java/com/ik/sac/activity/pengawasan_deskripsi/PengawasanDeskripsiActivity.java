package com.ik.sac.activity.pengawasan_deskripsi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pekerjaan_riwayat.PekerjaanRiwayatActivity;
import com.ik.sac.activity.pekerjaan_scan.PekerjaanScanActivity;
import com.ik.sac.activity.pengawasan_foto.PengawasanFotoActivity;
import com.ik.sac.activity.pengawasan_laporan.PengawasanLaporanActivity;
import com.ik.sac.activity.pengawasan_scan.PengawasanScanActivity;
import com.ik.sac.utils.Tools;

public class PengawasanDeskripsiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengawasan_deskripsi);
        Tools.setSystemBarColorInt(this, Color.parseColor("#93013F"));

        LinearLayout btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanDeskripsiActivity.this, PengawasanLaporanActivity.class);
            startActivity(i);
        });

    }

}