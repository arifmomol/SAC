package com.ik.sac.activity.dashboard;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi.AbsensiActivity;
import com.ik.sac.activity.insidentil.InsidentilActivity;
import com.ik.sac.activity.login.LoginActivity;
import com.ik.sac.activity.pekerjaan.PekerjaanActivity;
import com.ik.sac.activity.pengawasan.PengawasanActivity;
import com.ik.sac.activity.penilaian.PenilaianActivity;
import com.ik.sac.activity.profil.ProfilActivity;
import com.ik.sac.utils.Tools;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Tools.setSystemBarColorInt(this, Color.parseColor("#ab9400"));

        LinearLayout btn_profil = findViewById(R.id.btn_profil);
        btn_profil.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, ProfilActivity.class);
            startActivity(i);
        });

        LinearLayout btn_absensi = findViewById(R.id.btn_absensi);
        btn_absensi.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, AbsensiActivity.class);
            startActivity(i);
        });

        LinearLayout btn_pekerjaan = findViewById(R.id.btn_pekerjaan);
        btn_pekerjaan.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, PekerjaanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_pengawasan = findViewById(R.id.btn_pengawasan);
        btn_pengawasan.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, PengawasanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_insidentil = findViewById(R.id.btn_insidentil);
        btn_insidentil.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, InsidentilActivity.class);
            startActivity(i);
        });

        LinearLayout btn_penilaian = findViewById(R.id.btn_penilaian);
        btn_penilaian.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, PenilaianActivity.class);
            startActivity(i);
        });

        LinearLayout btn_logout = findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        });

    }

}