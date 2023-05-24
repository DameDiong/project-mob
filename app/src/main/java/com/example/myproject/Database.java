package com.example.myproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "blog.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Code pour créer la table
        String createTableQuery = "CREATE TABLE " + com.example.myproject.DatabaseContract.ArticleEntry.TABLE_NAME +
                " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                com.example.myproject.DatabaseContract.ArticleEntry.COLUMN_TITLE + " TEXT NOT NULL, " +
                com.example.myproject.DatabaseContract.ArticleEntry.COLUMN_CONTENT + " TEXT NOT NULL)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Code pour mettre à jour la base de données si nécessaire
        String deleteTableQuery = "DROP TABLE IF EXISTS " + com.example.myproject.DatabaseContract.ArticleEntry.TABLE_NAME;
        db.execSQL(deleteTableQuery);
        onCreate(db);
    }
}