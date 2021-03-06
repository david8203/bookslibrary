package com.moringaschool.booklibrary;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BooksActivity extends AppCompatActivity {
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    private String[] books = new String[] {"Scientific", "Nature","Programming", "Mathematics","Romance","Horror","Investigation and crimes" ,"kids","adventure","historic","Mystery","Games","Sports","Inspiration","wealth","Religion","sci-fi","law"};
    private String[] titles = new String[] {"learn biology", "what about hiking", "learn java", "Matrixes","how we met","its night","who did it","lets play","visit sunderland","great Egypt","who killed sarah","Chess","learn the rules","michael jordan","who is jack ma","the Bible","welcome to space ","know your rights"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        ButterKnife.bind(this);

        MyBooksArrayAdapter adapter = new MyBooksArrayAdapter(this, android.R.layout.simple_list_item_1, books, titles);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String book = ((TextView)view).getText().toString();
                Log.v("BooksActivity", "In the onItemClickListener!");
                Toast.makeText(BooksActivity.this, book, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the books available hope you enjoy them: " + location);
        Log.d("BooksActivity", "In the onCreate method!");

    }

}

