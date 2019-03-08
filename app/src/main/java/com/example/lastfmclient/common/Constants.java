package com.example.lastfmclient.common;

public class Constants {
    //API
    public static final String API_KEY = "21cf49ba8f7ffb0688f3b104516bab82";
    public static final String BASE_URL = "https://ws.audioscrobbler.com/2.0/";
    public static final String QUERY_ALBUM_SEARCH = "album.search";
    public static final String QUERY_ALBUM_GET_INFO = "album.getInfo";
    public static final String RESULT_FORMAT = "json";
    public static final int RESULTS_PER_PAGE = 30;
    public static final int CACHE_SIZE = 5 * 1024 * 1024; //5 MB
    public static final int API_TIMEOUT = 30;

    public static final String KEY_ALBUM_NAME = "album_name";
    public static final String KEY_ALBUM_ARTIST = "album_artist";

}
