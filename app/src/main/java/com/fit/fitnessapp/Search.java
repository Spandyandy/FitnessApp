package com.fit.fitnessapp;

import android.os.AsyncTask;
import android.util.ArrayMap;
import android.util.Log;

import org.json.JSONArray;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

/**
 * Created by Andy Kim on 2016-11-12.
 */

public class Search {
    String query;
    String[] apiParams;

    public Search(String query, String[] params) {
        this.query = query;
        apiParams = params;
    }

    public String getData() throws IOException {
        AsyncTaskRunner runner = new AsyncTaskRunner();
        runner.execute("https://scarl.sewanee.edu/");
        return null;
    }

    private class AsyncTaskRunner extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            Document doc = null;
            try {
                doc = Jsoup.connect(strings[0]).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return doc.toString();
        }
    }
}