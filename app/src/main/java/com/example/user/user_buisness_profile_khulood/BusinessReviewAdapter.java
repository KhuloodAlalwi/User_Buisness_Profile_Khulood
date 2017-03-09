package com.example.user.user_buisness_profile_khulood;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import static com.example.user.user_buisness_profile_khulood.R.id.editUserComment;
import static com.example.user.user_buisness_profile_khulood.R.id.imagePlaceImageUserReview;
import static com.example.user.user_buisness_profile_khulood.R.id.ratingUserRating;
import static com.example.user.user_buisness_profile_khulood.R.id.textPlaceNameUserReview;
import static com.example.user.user_buisness_profile_khulood.R.id.textPlaceDescUserReview;


/**
 * Created by USER on 3/7/2017.
 */

public class BusinessReviewAdapter extends RecyclerView.Adapter<BusinessReviewAdapter.ViewHolder> {
    //...7... Define the list items java
    private List<BusinessReviewListItem> listItems;
    private Context context;

    //..8..GEnerate constructore

    public BusinessReviewAdapter(List<BusinessReviewListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }


    //1..3.. press Alt+Enter to implement methods


    //this method will be called whnerver viewholder is created
    //..4.. return viewHolder : first create view (v) and use inflater to call list item xml

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.business_review_list_item, parent, false);

        return new ViewHolder(v);

    }




    @Override
    //this methods will be called whenever onCreate is called
    //and will Bind data to ViewHolder class means will show data to recyclerView
    public void onBindViewHolder(final ViewHolder holder, int position) {
        //..10..get list item from object in step 7
        BusinessReviewListItem listItem = listItems.get(position); //position of userBoomarklistItem
        holder.imageViewPlaceImageUserReview.setImageResource(listItem.getPlaceImageUserReview());
        holder.textViewPlaceNameUserReview.setText(listItem.getPlaceNameUserReview());
        holder.textViewPlaceDescUserReview.setText(listItem.getPlaceDescUserReview());
        holder.editTextUserComment.setText(listItem.getEditTextUserComment());
        holder.ratingBarUserRating.setRating(listItem.getRatingBarUserRating());
        holder.buttonViewOptionsUserReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //creating a popup menu
                PopupMenu popup = new PopupMenu(context, holder.buttonViewOptionsUserReview);
                //inflating menu from xml resource
                popup.inflate(R.menu.user_review_options_menu);
                //adding click listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.userReviewView:
                                //handle menu1 click
                                break;
                            case R.id.userReviewEdit:
                                //handle menu2 click
                                break;
                            // case R.id.menu3:
                            //handle menu3 click
                            //   break;
                        }
                        return false;
                    }
                });
                //displaying the popup
                popup.show();

            }
        });



    }

    @Override

    public int getItemCount() {
        // ..9.. return size of recyclerView items

        return listItems.size();
    }


    //...2... make another class for viewholder

    public class ViewHolder extends RecyclerView.ViewHolder {

        //..5.. Define Views in xml file

        public ImageView imageViewPlaceImageUserReview;
        public TextView textViewPlaceNameUserReview;
        public TextView textViewPlaceDescUserReview;
        public EditText editTextUserComment;
        public RatingBar ratingBarUserRating;
        public TextView buttonViewOptionsUserReview;


        // Press Alt+enter to creat constructor

        public ViewHolder(View itemView) {
            super(itemView);
            imageViewPlaceImageUserReview = (ImageView) itemView.findViewById(imagePlaceImageUserReview);
            textViewPlaceNameUserReview = (TextView) itemView.findViewById(textPlaceNameUserReview);
            textViewPlaceDescUserReview = (TextView) itemView.findViewById(textPlaceDescUserReview);
            editTextUserComment = (EditText) itemView.findViewById(editUserComment);
            ratingBarUserRating = (RatingBar) itemView.findViewById(ratingUserRating);
            buttonViewOptionsUserReview = (TextView) itemView.findViewById(R.id.textViewOptionsUserReview);


        }




    }


}
