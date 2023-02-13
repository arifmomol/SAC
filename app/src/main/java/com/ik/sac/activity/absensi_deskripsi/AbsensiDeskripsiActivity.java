package com.ik.sac.activity.absensi_deskripsi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_foto.AbsensiFotoActivity;
import com.ik.sac.activity.absensi_perlengkapan.AbsensiPerlengkapanActivity;
import com.ik.sac.utils.Tools;

public class AbsensiDeskripsiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_deskripsi);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiDeskripsiActivity.this, AbsensiFotoActivity.class);
            startActivity(i);
        });

    }

}