package com.ik.sac.activity.pengawasan_scan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pengawasan.PengawasanActivity;
import com.ik.sac.activity.pengawasan_foto.PengawasanFotoActivity;
import com.ik.sac.utils.Tools;

public class PengawasanScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengawasan_scan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#93013F"));

        LinearLayout btn_scan = findViewById(R.id.btn_scan);
        btn_scan.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanScanActivity.this, PengawasanFotoActivity.class);
            startActivity(i);
        });

    }

}