package com.example.myproject;

public class DatabaseContract {
    private DatabaseContract() {}

    public static class ArticleEntry {
        public static final String TABLE_NAME = "articles";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_CONTENT = "content";

        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_TITLE + " TEXT NOT NULL, " +
                        COLUMN_CONTENT + " TEXT NOT NULL)";

        public static final String DELETE_TABLE =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
   }
}