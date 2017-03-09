package com.example.user.user_buisness_profile_khulood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;
import static com.example.user.user_buisness_profile_khulood.R.id.imageButtonUserBookmark;
import static com.example.user.user_buisness_profile_khulood.R.id.imageButtonUserLikes;
import static com.example.user.user_buisness_profile_khulood.R.id.imageButtonUserReviews;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);


        // initiate view's
        ImageButton imageButtonUserCat = (ImageButton)findViewById(R.id.imageButtonUserCat);
        ImageButton imageButtonUserReviews = (ImageButton)findViewById(R.id.imageButtonUserReviews);
        ImageButton imageButtonUserLikes = (ImageButton)findViewById(R.id.imageButtonUserLikes);
        ImageButton imageButtonUserBookmark = (ImageButton)findViewById(R.id.imageButtonUserBookmark);

// perform click event on button's

        imageButtonUserCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whenClick = new Intent(UserProfile.this, UserLikesMainActivity.class);
                startActivity(whenClick);
            }
        });

        imageButtonUserReviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whenClick = new Intent(UserProfile.this,UserReviewMainActivity.class);
                startActivity(whenClick);
            }
        });

        imageButtonUserLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whenClick = new Intent(UserProfile.this,UserLikesMainActivity.class);
                startActivity(whenClick);
            }
        });

        imageButtonUserBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whenClick = new Intent(UserProfile.this,UserBookmarkMainActivity.class);
                startActivity(whenClick);
            }
        });


    }

}


