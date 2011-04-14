package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class RSSActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView rssItemList = (ListView) findViewById(R.id.rssListview);
        FeedSource feedSource = new HttpFeedSource();
        RSSItemAdapter adapter = new RSSItemAdapter(this, R.layout.rssitem, feedSource.getFeed());
        rssItemList.setAdapter(adapter);
    }
}
