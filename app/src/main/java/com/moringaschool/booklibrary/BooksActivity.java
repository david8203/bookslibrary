package com.moringaschool.booklibrary;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BooksActivity {
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
        }
    }

}

