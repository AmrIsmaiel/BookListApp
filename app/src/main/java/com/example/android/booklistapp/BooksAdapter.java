package com.example.android.booklistapp;

/**
 * Created by CRIZMA-PC&LAPTOP on 25/07/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class BooksAdapter extends ArrayAdapter<Book> {

    public BooksAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        final Book book = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(book.getTitle());

        TextView authorTxt = (TextView) view.findViewById(R.id.authorA);
        authorTxt.setText(book.getAuthor());

        return view;
    }
}
