package com.ik.sac.activity.pengawasan_foto;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pengawasan_deskripsi.PengawasanDeskripsiActivity;
import com.ik.sac.activity.pengawasan_scan.PengawasanScanActivity;
import com.ik.sac.utils.Tools;

public class PengawasanFotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengawasan_foto);
        Tools.setSystemBarColorInt(this, Color.parseColor("#93013F"));

        LinearLayout btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanFotoActivity.this, PengawasanDeskripsiActivity.class);
            startActivity(i);
        });

    }

}