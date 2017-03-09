package com.example.user.user_buisness_profile_khulood;

/**
 * Created by USER on 3/7/2017.
 */

public class UserReviewListItem {

    private int placeImageUserReview;
    private String placeNameUserReview;
    private String placeDescUserReview;
    private String editTextUserComment;
    private int ratingBarUserRating;

    public UserReviewListItem(int placeImageUserReview, String placeNameUserReview, String placeDescUserReview, String editTextUserComment, int ratingBarUserRating) {
        this.placeImageUserReview = placeImageUserReview;
        this.placeNameUserReview = placeNameUserReview;
        this.placeDescUserReview = placeDescUserReview;
        this.editTextUserComment = editTextUserComment;
        this.ratingBarUserRating = ratingBarUserRating;
    }



    public int getPlaceImageUserReview() {
        return placeImageUserReview;
    }

    public void setPlaceImageUserReview(int placeImageUserReview) {
        this.placeImageUserReview = placeImageUserReview;
    }

    public String getPlaceNameUserReview() {
        return placeNameUserReview;
    }

    public void setPlaceNameUserReview(String placeNameUserReview) {
        this.placeNameUserReview = placeNameUserReview;
    }

    public String getPlaceDescUserReview() {
        return placeDescUserReview;
    }

    public void setPlaceDescUserReview(String placeDescUserReview) {
        this.placeDescUserReview = placeDescUserReview;
    }

    public String getEditTextUserComment() {
        return editTextUserComment;
    }

    public void setEditTextUserComment(String editTextUserComment) {
        this.editTextUserComment = editTextUserComment;
    }

    public int getRatingBarUserRating() {
        return ratingBarUserRating;
    }

    public void setRatingBarUserRating(int ratingBarUserRating) {
        this.ratingBarUserRating = ratingBarUserRating;
    }
}


