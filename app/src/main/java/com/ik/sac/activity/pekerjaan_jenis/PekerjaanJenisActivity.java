package com.ik.sac.activity.pekerjaan_jenis;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pekerjaan_foto.PekerjaanFotoActivity;
import com.ik.sac.utils.Tools;

public class PekerjaanJenisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan_jenis);
        Tools.setSystemBarColorInt(this, Color.parseColor("#349E02"));

        LinearLayout btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> {
            Intent i = new Intent(PekerjaanJenisActivity.this, PekerjaanFotoActivity.class);
            startActivity(i);
        });

    }

}