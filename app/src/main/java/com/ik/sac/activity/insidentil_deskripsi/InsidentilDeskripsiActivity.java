package com.ik.sac.activity.insidentil_deskripsi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.insidentil_foto.InsidentilFotoActivity;
import com.ik.sac.activity.insidentil_laporan.InsidentilLaporanActivity;
import com.ik.sac.utils.Tools;

public class InsidentilDeskripsiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidentil_deskripsi);
        Tools.setSystemBarColorInt(this, Color.parseColor("#430077"));

        LinearLayout btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilDeskripsiActivity.this, InsidentilLaporanActivity.class);
            startActivity(i);
        });

    }

}