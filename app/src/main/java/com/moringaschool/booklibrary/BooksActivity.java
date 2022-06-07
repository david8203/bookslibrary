package com.moringaschool.booklibrary;

import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;

public class BooksActivity {
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    private String[] books = new String[] {"Scientific", "Nature","Programming", "Mathematics","Romance","Horror","Investigation and crimes" ,"kids","adventure","historic","Mystery","Games","Sports","Inspiration","wealth","Religion","sci-fi","law"};
    private String[] titles = new String[] {"learn biology", "what about hiking", "learn java", "Matrixes","how we met","its night","who did it","lets play","visit sunderland","great Egypt","who killed sarah","Chess","learn the rules","michael jordan","who is jack ma","the Bible","welcome to space ","know your rights"};
}
