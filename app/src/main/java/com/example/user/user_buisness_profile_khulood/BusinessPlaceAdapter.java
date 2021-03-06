package com.example.user.user_buisness_profile_khulood;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import static com.example.user.user_buisness_profile_khulood.R.id.ratingBar;
import static com.example.user.user_buisness_profile_khulood.R.id.ratingUserRating;

/**
 * Created by USER on 3/10/2017.
 */

public class BusinessPlaceAdapter extends RecyclerView.Adapter<BusinessPlaceAdapter.ViewHolder> {
    private List<BusinessPlaceListItem> listItems;
    private Context context;

    public BusinessPlaceAdapter(List<BusinessPlaceListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public BusinessPlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.business_place_list_item, parent, false);
        return new BusinessPlaceAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final BusinessPlaceAdapter.ViewHolder holder, int position) {

        BusinessPlaceListItem listItem = listItems.get(position);
        holder.imageViewPlaceImageUserLikes.setImageResource(listItem.getPlaceImageUserLikes());
        holder.textViewPlaceNameUserLikes.setText(listItem.getPlaceNameUserLikes());
        holder.textViewPlaceDescUserLikes.setText(listItem.getPlaceDescUserLikes());
        holder.imageViewLikeImageUserLikes.setImageResource(listItem.getLikeImageUser());
        holder.imageViewBookmark.setImageResource(listItem.getBookmarkImageUser());
        holder.ratingbar.setRating(listItem.getRatingbarBusiness());
        holder.buttonViewOptionUserLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //creating a popup menu
                PopupMenu popup = new PopupMenu(context, holder.buttonViewOptionUserLikes);
                //inflating menu from xml resource
                popup.inflate(R.menu.business_event_options_menu);
                //adding click listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.BsPlaceView:
                                //handle menu1 click
                                break;
                            case R.id.BsPlaceEdit:
                                //handle menu2 click
                                break;
                            case R.id.BsPlaceDelete:
                            //handle menu3 click
                                 break;
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
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewPlaceImageUserLikes;
        public TextView textViewPlaceNameUserLikes;
        public TextView textViewPlaceDescUserLikes;
        public ImageView imageViewLikeImageUserLikes;
        public ImageView imageViewBookmark;
        public RatingBar ratingbar;
        public TextView buttonViewOptionUserLikes;




        /* alt+enter to creat constructor*/
        public ViewHolder(View itemView) {
            super(itemView);
            imageViewPlaceImageUserLikes = (ImageView) itemView.findViewById(R.id.imageViewPlaceImageUserLikes);
            textViewPlaceNameUserLikes = (TextView) itemView.findViewById(R.id.textViewPlaceNameUserLikes);
            textViewPlaceDescUserLikes = (TextView) itemView.findViewById(R.id.textViewPlaceDescUserLikes);
            imageViewLikeImageUserLikes = (ImageView) itemView.findViewById(R.id.imageViewLikeImageUserLikes);
            imageViewBookmark=(ImageView)itemView.findViewById(R.id.imageViewBookmarkImageUser);
            ratingbar = (RatingBar) itemView.findViewById(ratingBar);

            buttonViewOptionUserLikes = (TextView) itemView.findViewById(R.id.textViewOptionsUserLikes);


        }
    }



}

