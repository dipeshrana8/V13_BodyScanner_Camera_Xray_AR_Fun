package com.ultrascan.bodyvision.ar.spalsh;

import android.content.Intent;
import android.os.Bundle;

import com.ultrascan.bodyvision.ar.R;
import com.ultrascan.bodyvision.ar.databinding.ActivityExploreBinding;

public class BodyScanerActivity extends BaseActivity {

    ActivityExploreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExploreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.txtDescription.setText("Body 3D Scanner");

        binding.imgChange.setImageResource(R.drawable.img_body_back);

        binding.btnNext.setOnClickListener(v -> {

            Intent intent = new Intent(BodyScanerActivity.this, CameraScannerActivity.class);
            startActivity(intent);
        });


    }

    @Override
    public void onBackPressed() {
        myBackActivity();
    }
}