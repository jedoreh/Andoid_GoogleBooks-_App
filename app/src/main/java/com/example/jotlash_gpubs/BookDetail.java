package com.example.jotlash_gpubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.jotlash_gpubs.databinding.ActivityBookDetailBinding;

public class BookDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        Book book = getIntent().getParcelableExtra("Book");
        ActivityBookDetailBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_book_detail);
        binding.setBook(book);
    }
}