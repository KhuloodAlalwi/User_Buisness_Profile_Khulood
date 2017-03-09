package com.example.user.user_buisness_profile_khulood;

/**
 * Created by USER on 3/6/2017.
 */

public class UserBookmarkListItem {

    private int placeImageUserBookmark;
    private String placeNameUserBookmark;
    private String placeDescUserBookmark;
    private int BookmarkImageUser;

    public UserBookmarkListItem(int placeImageUserBookmark, String placeNameUserBookmark, String placeDescUserBookmark, int bookmarkImageUser) {
        this.placeImageUserBookmark = placeImageUserBookmark;
        this.placeNameUserBookmark = placeNameUserBookmark;
        this.placeDescUserBookmark = placeDescUserBookmark;
        BookmarkImageUser = bookmarkImageUser;
    }

    public int getPlaceImageUserBookmark() {
        return placeImageUserBookmark;
    }

    public void setPlaceImageUserBookmark(int placeImageUserBookmark) {
        this.placeImageUserBookmark = placeImageUserBookmark;
    }

    public String getPlaceNameUserBookmark() {
        return placeNameUserBookmark;
    }

    public void setPlaceNameUserBookmark(String placeNameUserBookmark) {
        this.placeNameUserBookmark = placeNameUserBookmark;
    }

    public String getPlaceDescUserBookmark() {
        return placeDescUserBookmark;
    }

    public void setPlaceDescUserBookmark(String placeDescUserBookmark) {
        this.placeDescUserBookmark = placeDescUserBookmark;
    }

    public int getBookmarkImageUser() {
        return BookmarkImageUser;
    }

    public void setBookmarkImageUser(int bookmarkImageUser) {
        BookmarkImageUser = bookmarkImageUser;
    }
}
