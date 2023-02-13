package com.ik.sac.activity.pengawasan_laporan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.dashboard.DashboardActivity;
import com.ik.sac.activity.pengawasan_deskripsi.PengawasanDeskripsiActivity;
import com.ik.sac.utils.Tools;

public class PengawasanLaporanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengawasan_laporan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#93013F"));

        LinearLayout btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanLaporanActivity.this, DashboardActivity.class);
            startActivity(i);
            finish();
        });

    }

}