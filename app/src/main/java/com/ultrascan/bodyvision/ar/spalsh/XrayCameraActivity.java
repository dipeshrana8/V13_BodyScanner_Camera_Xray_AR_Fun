package com.ultrascan.bodyvision.ar.spalsh;

import android.content.Intent;
import android.os.Bundle;

import com.ultrascan.bodyvision.ar.R;
import com.ultrascan.bodyvision.ar.databinding.ActivityExploreBinding;

public class XrayCameraActivity extends BaseActivity {

    ActivityExploreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExploreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtDescription.setText("Body Xray Camera");
        binding.imgChange.setImageResource(R.drawable.img_xray_camera);


        binding.btnNext.setOnClickListener(v -> {

            Intent intent = new Intent(XrayCameraActivity.this, HomeActivity.class);
            startActivity(intent);
        });


    }

    @Override
    public void onBackPressed() {
        myBackActivity();
    }
}