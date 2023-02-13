package com.ik.sac.activity.pekerjaan_scan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pekerjaan_jenis.PekerjaanJenisActivity;
import com.ik.sac.utils.Tools;

public class PekerjaanScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan_scan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#349E02"));

        LinearLayout btn_scan = findViewById(R.id.btn_scan);
        btn_scan.setOnClickListener(v -> {
            Intent i = new Intent(PekerjaanScanActivity.this, PekerjaanJenisActivity.class);
            startActivity(i);
        });

    }

}