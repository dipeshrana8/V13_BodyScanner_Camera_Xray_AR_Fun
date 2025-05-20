package com.ultrascan.bodyvision.ar.spalsh;

import android.os.Bundle;
import android.view.View;

import com.ultrascan.bodyvision.ar.databinding.ActivityHumanSpeciesBinding;

public class HumanSpeciesActivity extends BaseActivity {


    ActivityHumanSpeciesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHumanSpeciesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarLayout.headerTitle.setText("Human Species");
        binding.toolbarLayout.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myBackActivity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        myBackActivity();
    }
}