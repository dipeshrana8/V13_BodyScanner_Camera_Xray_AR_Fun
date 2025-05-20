package com.ultrascan.bodyvision.ar.spalsh;

import android.content.Intent;
import android.os.Bundle;

import com.ultrascan.bodyvision.ar.R;
import com.ultrascan.bodyvision.ar.databinding.ActivityBodyPartDetailBinding;

public class BodyPartDetailActivity extends BaseActivity {

    private ActivityBodyPartDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBodyPartDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.toolbarLayout.headerTitle.setText("Explore Body Part");
        binding.toolbarLayout.btnBack.setOnClickListener(v -> onBackPressed());
        Intent intent = getIntent();

        int image = intent.getIntExtra("image", R.mipmap.ic_launcher);
        String description = intent.getStringExtra("description");
        String title = intent.getStringExtra("title");

        binding.imgBodyPart.setImageResource(image);
        binding.txtDescription.setText(description);
        binding.txtTitle.setText(title);

    }

    @Override
    public void onBackPressed() {
        myBackActivity();
    }
}