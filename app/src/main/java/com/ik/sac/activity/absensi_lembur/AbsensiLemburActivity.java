package com.ik.sac.activity.absensi_lembur;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi.AbsensiActivity;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.activity.absensi_lembur_add.AbsensiLemburAddActivity;
import com.ik.sac.utils.Tools;

public class AbsensiLemburActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_lembur);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_absen = findViewById(R.id.btn_back);
        btn_absen.setOnClickListener(v -> {
            finish();
        });

        LinearLayout btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiLemburActivity.this, AbsensiLemburAddActivity.class);
            startActivity(i);
        });

    }

}