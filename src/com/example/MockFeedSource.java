package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Glenn Bech
 */
class MockFeedSource implements FeedSource {

    public List<RSSItem> getFeed() {

        RSSItem item;
        final List<RSSItem> items = new ArrayList<RSSItem>();
        item = new RSSItem("Android Workshop er gøy", "http://www.ap.no");
        items.add(item);
        item = new RSSItem("Android Workshop er gøy 2", "http://www.ap.no");
        items.add(item);
        item = new RSSItem("Android Workshop er gøy3", "http://www.ap.no");
        items.add(item);
        return items;

    }
}
