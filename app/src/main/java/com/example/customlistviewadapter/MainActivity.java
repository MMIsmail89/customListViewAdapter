package com.example.customlistviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.customlistviewadapter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //
//        ProductAdapter_binding adapter = new ProductAdapter_binding(this, ApplicationClass.carsStore);
        ProductAdapter adapter = new ProductAdapter(this, ApplicationClass.carsStore);

        binding.mainLvProductList.setAdapter(adapter);
    }
}