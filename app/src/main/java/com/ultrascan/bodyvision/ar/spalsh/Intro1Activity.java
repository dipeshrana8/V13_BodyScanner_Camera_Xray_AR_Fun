package com.ultrascan.bodyvision.ar.spalsh;

import android.content.Intent;
import android.os.Bundle;

import com.ultrascan.bodyvision.ar.databinding.ActivityExploreBinding;

public class Intro1Activity extends BaseActivity {

    ActivityExploreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExploreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnNext.setOnClickListener(v -> {

            Intent intent = new Intent(Intro1Activity.this, CountryActivity.class);
            startActivity(intent);
        });


    }

    @Override
    public void onBackPressed() {
        myBackActivity();
    }
}