package com.ik.sac.activity.penilaian;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.activity.absensi_lembur.AbsensiLemburActivity;
import com.ik.sac.activity.absensi_riwayat.AbsensiRiwayatActivity;
import com.ik.sac.activity.penilaian_detail.PenilaianDetailActivity;
import com.ik.sac.utils.Tools;

public class PenilaianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penilaian_riwayat);
        Tools.setSystemBarColorInt(this, Color.parseColor("#C92400"));

        LinearLayout btn_penilaian_detail = findViewById(R.id.btn_penilaian_detail);
        btn_penilaian_detail.setOnClickListener(v -> {
            Intent i = new Intent(PenilaianActivity.this, PenilaianDetailActivity.class);
            startActivity(i);
        });

        LinearLayout btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(v -> {
            finish();
        });

    }

}