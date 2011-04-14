package com.example;

import java.util.List;

/**
 * @author Glenn Bech
 */
interface FeedSource {

    List<RSSItem> getFeed();

}
