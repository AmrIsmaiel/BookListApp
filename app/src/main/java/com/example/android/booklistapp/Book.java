package com.example.android.booklistapp;

/**
 * Created by CRIZMA-PC&LAPTOP on 25/07/2017.
 */

import android.os.Parcel;
import android.os.Parcelable;


public class Book implements Parcelable {

    private String author;
    private String title;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    private Book(Parcel in) {
        author = in.readString();
        title = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(author);
        parcel.writeString(title);
    }
}
