package com.ik.sac.activity.absensi_foto;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.absensi_deskripsi.AbsensiDeskripsiActivity;
import com.ik.sac.activity.dashboard.DashboardActivity;
import com.ik.sac.utils.Tools;

public class AbsensiFotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi_fotodiri);
        Tools.setSystemBarColorInt(this, Color.parseColor("#0490BF"));

        LinearLayout btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(v -> {
            Intent i = new Intent(AbsensiFotoActivity.this, DashboardActivity.class);
            startActivity(i);
            finish();
        });

    }

}