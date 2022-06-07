package com.moringaschool.booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.findBooksButton) Button mFindBooksButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindBooksButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == mFindBooksButton) {
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, BooksActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}