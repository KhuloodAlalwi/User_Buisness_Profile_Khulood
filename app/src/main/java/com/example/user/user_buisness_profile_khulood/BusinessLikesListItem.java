package com.example.user.user_buisness_profile_khulood;

/**
 * Created by USER on 3/5/2017.
 */

public class BusinessLikesListItem {
    private int placeImageUserLikes;
    private String placeNameUserLikes;
    private String placeDescUserLikes;
    private int likeImageUser;

    public BusinessLikesListItem(int placeImageUserLikes, String placeNameUserLikes, String placeDescUserLikes, int likeImageUser) {
        this.placeImageUserLikes = placeImageUserLikes;
        this.placeNameUserLikes = placeNameUserLikes;
        this.placeDescUserLikes = placeDescUserLikes;
        this.likeImageUser = likeImageUser;
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
}

