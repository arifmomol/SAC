package com.ik.sac.activity.absensi_perlengkapan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_deskripsi.AbsensiDeskripsiActivity;
import com.ik.sac.activity.absensi_scan.AbsensiScanActivity;
import com.ik.sac.utils.Tools;

public class AbsensiPerlengkapanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_perlengkapan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiPerlengkapanActivity.this, AbsensiDeskripsiActivity.class);
            startActivity(i);
        });


    }

}