package com.ik.sac.activity.profil;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.activity.absensi_lembur.AbsensiLemburActivity;
import com.ik.sac.activity.absensi_riwayat.AbsensiRiwayatActivity;
import com.ik.sac.activity.profil_edit.ProfilEditActivity;
import com.ik.sac.utils.Tools;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Tools.setSystemBarColorInt(this, Color.parseColor("#ab9400"));

        LinearLayout btn_edit_profil = findViewById(R.id.btn_edit_profil);
        btn_edit_profil.setOnClickListener(v -> {
            Intent i = new Intent(ProfilActivity.this, ProfilEditActivity.class);
            startActivity(i);
        });

        LinearLayout btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(v -> {
            finish();
        });

    }

}