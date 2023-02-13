package com.ik.sac.activity.absensi_lembur_add;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_lembur.AbsensiLemburActivity;
import com.ik.sac.activity.dashboard.DashboardActivity;
import com.ik.sac.utils.Tools;

public class AbsensiLemburAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_lembur_add);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(v -> {
            finish();
        });

    }

}