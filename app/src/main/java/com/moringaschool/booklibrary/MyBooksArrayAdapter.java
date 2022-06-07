package com.moringaschool.booklibrary;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyBooksArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mBooks;
    private String[] mTitles;

    public MyBooksArrayAdapter( Context mContext, int resource, String[] mBooks, String[] mTitles) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mBooks = mBooks;
        this.mTitles = mTitles;
    }
    @Override
    public Object getItem(int position) {
        String books = mBooks[position];
        String title = mTitles[position];
        return String.format("%s \nYou should read this perhaps and leave a comment behind: %s", books, title);
    }
    @Override
    public int getCount() {
        return mBooks.length;
    }
}
