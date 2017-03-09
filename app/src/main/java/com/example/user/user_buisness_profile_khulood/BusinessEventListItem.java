package com.example.user.user_buisness_profile_khulood;

/**
 * Created by USER on 3/10/2017.
 */

public class BusinessEventListItem {

    private int placeImageUserLikes;
    private String placeNameUserLikes;
    private String placeDescUserLikes;
    private int likeImageUser;
    private int bookmarkImageUser;
    private int ratingbarBusiness;

    public BusinessEventListItem(int placeImageUserLikes, String placeNameUserLikes, String placeDescUserLikes, int likeImageUser, int bookmarkImageUser, int ratingbarBusiness) {
        this.placeImageUserLikes = placeImageUserLikes;
        this.placeNameUserLikes = placeNameUserLikes;
        this.placeDescUserLikes = placeDescUserLikes;
        this.likeImageUser = likeImageUser;
        this.bookmarkImageUser = bookmarkImageUser;
        this.ratingbarBusiness = ratingbarBusiness;
    }

    public int getPlaceImageUserLikes() {
        return placeImageUserLikes;
    }

    public void setPlaceImageUserLikes(int placeImageUserLikes) {
        this.placeImageUserLikes = placeImageUserLikes;
    }

    public String getPlaceNameUserLikes() {
        return placeNameUserLikes;
    }

    public void setPlaceNameUserLikes(String placeNameUserLikes) {
        this.placeNameUserLikes = placeNameUserLikes;
    }

    public String getPlaceDescUserLikes() {
        return placeDescUserLikes;
    }

    public void setPlaceDescUserLikes(String placeDescUserLikes) {
        this.placeDescUserLikes = placeDescUserLikes;
    }

    public int getLikeImageUser() {
        return likeImageUser;
    }

    public void setLikeImageUser(int likeImageUser) {
        this.likeImageUser = likeImageUser;
    }

    public int getBookmarkImageUser() {
        return bookmarkImageUser;
    }

    public void setBookmarkImageUser(int bookmarkImageUser) {
        this.bookmarkImageUser = bookmarkImageUser;
    }

    public int getRatingbarBusiness() {
        return ratingbarBusiness;
    }

    public void setRatingbarBusiness(int ratingbarBusiness) {
        this.ratingbarBusiness = ratingbarBusiness;
    }
}
