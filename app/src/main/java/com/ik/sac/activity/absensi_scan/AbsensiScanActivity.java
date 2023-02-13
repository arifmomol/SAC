package com.ik.sac.activity.absensi_scan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.activity.absensi_perlengkapan.AbsensiPerlengkapanActivity;
import com.ik.sac.utils.Tools;

public class AbsensiScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_scan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_scan = findViewById(R.id.btn_scan);
        btn_scan.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiScanActivity.this, AbsensiPerlengkapanActivity.class);
            startActivity(i);
        });


    }

}