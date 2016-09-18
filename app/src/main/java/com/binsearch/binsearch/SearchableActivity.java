package com.binsearch.binsearch;


import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SearchableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void handleIntent(Intent intent){
        if(Intent.ACTION_SEARCH.equals(
                intent.getAction())){
            String query = intent.getStringExtra(
                    SearchManager.QUERY);

        }
    }
}
