package com.ik.sac.activity.profil_edit;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.activity.absensi_lembur.AbsensiLemburActivity;
import com.ik.sac.activity.absensi_riwayat.AbsensiRiwayatActivity;
import com.ik.sac.activity.dashboard.DashboardActivity;
import com.ik.sac.utils.Tools;

public class ProfilEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_edit);
        Tools.setSystemBarColorInt(this, Color.parseColor("#ab9400"));

        LinearLayout btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(v -> {
            finish();
        });

    }

}