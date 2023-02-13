package com.ik.sac.activity.absensi_riwayat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi.AbsensiActivity;
import com.ik.sac.activity.absensi_jamker.AbsensiJamkerActivity;
import com.ik.sac.utils.Tools;

public class AbsensiRiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_riwayat);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(v -> {
            finish();
        });

    }

}