package com.example.user.user_buisness_profile_khulood;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 3/5/2017.
 */

public class BusinessLikesAdapter extends RecyclerView.Adapter<BusinessLikesAdapter.ViewHolder> {
    private List<BusinessLikesListItem> listItems;
    private Context context;

    public BusinessLikesAdapter(List<BusinessLikesListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.business_likes_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        BusinessLikesListItem listItem = listItems.get(position);
        holder.imageViewPlaceImageUserLikes.setImageResource(listItem.getPlaceImageUserLikes());
        holder.textViewPlaceNameUserLikes.setText(listItem.getPlaceNameUserLikes());
        holder.textViewPlaceDescUserLikes.setText(listItem.getPlaceDescUserLikes());
        holder.imageViewLikeImageUserLikes.setImageResource(listItem.getLikeImageUser());
        holder.buttonViewOptionUserLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //creating a popup menu
                PopupMenu popup = new PopupMenu(context, holder.buttonViewOptionUserLikes);
                //inflating menu from xml resource
                popup.inflate(R.menu.user_likes_options_menu);
                //adding click listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.userLikesView:
                                //handle menu1 click
                                break;
                            case R.id.userLikesUnlike:
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
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewPlaceImageUserLikes;
        public TextView textViewPlaceNameUserLikes;
        public TextView textViewPlaceDescUserLikes;
        public ImageView imageViewLikeImageUserLikes;
        public TextView buttonViewOptionUserLikes;




        /* alt+enter to creat constructor*/
        public ViewHolder(View itemView) {
            super(itemView);
            imageViewPlaceImageUserLikes = (ImageView) itemView.findViewById(R.id.imageViewPlaceImageUserLikes);
            textViewPlaceNameUserLikes = (TextView) itemView.findViewById(R.id.textViewPlaceNameUserLikes);
            textViewPlaceDescUserLikes = (TextView) itemView.findViewById(R.id.textViewPlaceDescUserLikes);
            imageViewLikeImageUserLikes = (ImageView) itemView.findViewById(R.id.imageViewLikeImageUserLikes);
            buttonViewOptionUserLikes = (TextView) itemView.findViewById(R.id.textViewOptionsUserLikes);


        }
    }



}

