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
 * Created by USER on 3/6/2017.
 */

// ...1...we need to make another class for view holder so we will extend viewHolder for this Adapter
public class BusinessBookmarkAdapter extends RecyclerView.Adapter<BusinessBookmarkAdapter.ViewHolder> {
    //...7... Define the list items java
    private List<BusinessBookmarkListItem> listItems;
    private Context context;

    //..8..GEnerate constructore

    public BusinessBookmarkAdapter(List<BusinessBookmarkListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }


    //1..3.. press Alt+Enter to implement methods


        //this method will be called whnerver viewholder is created
        //..4.. return viewHolder : first create view (v) and use inflater to call list item xml

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.business_bookmark_list_item, parent, false);
        return new ViewHolder(v);
    }



    @Override
    //this methods will be called whenever onCreate is called
    //and will Bind data to ViewHolder class means will show data to recyclerView
    public void onBindViewHolder(final ViewHolder holder, int position) {
        //..10..get list item from object in step 7
        BusinessBookmarkListItem listItem = listItems.get(position); //position of userBoomarklistItem
        holder.imageViewPlaceImageUserBookmark.setImageResource(listItem.getPlaceImageUserBookmark());
        holder.textViewPlaceNameUserBookmark.setText(listItem.getPlaceNameUserBookmark());
                                holder.textViewPlaceDescUserBookmark.setText(listItem.getPlaceDescUserBookmark());
                                holder.imageViewBookmarkImageUser.setImageResource(listItem.getBookmarkImageUser());
                                holder.buttonViewOptionsUserBookmark.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        //creating a popup menu
                                        PopupMenu popup = new PopupMenu(context, holder.buttonViewOptionsUserBookmark);
                                        //inflating menu from xml resource
                                        popup.inflate(R.menu.user_bookmark_options_menu);
                                        //adding click listener
                                        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                            @Override
                                            public boolean onMenuItemClick(MenuItem item) {
                                                switch (item.getItemId()) {
                                                    case R.id.userBookmarkView:
                                //handle menu1 click
                                break;
                            case R.id.userBookmarkRemove:
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
        public ImageView imageViewPlaceImageUserBookmark;
        public TextView textViewPlaceNameUserBookmark;
        public TextView textViewPlaceDescUserBookmark;
        public ImageView imageViewBookmarkImageUser;
        public TextView buttonViewOptionsUserBookmark;
        // Press Alt+enter to creat constructor
        public ViewHolder(View itemView) {
            super(itemView);

            //..6.. get view in 5 from xml
            imageViewPlaceImageUserBookmark = (ImageView) itemView.findViewById(R.id.imageViewPlaceImageUserBookmark);
            textViewPlaceNameUserBookmark = (TextView) itemView.findViewById(R.id.textViewPlaceNameUserBookmark);
            textViewPlaceDescUserBookmark = (TextView) itemView.findViewById(R.id.textViewPlaceDescUserBookmark);
            imageViewBookmarkImageUser = (ImageView) itemView.findViewById(R.id.imageViewBookmarkImageUser);
            buttonViewOptionsUserBookmark = (TextView) itemView.findViewById(R.id.textViewOptionsUserBookmark);


        }

    }
}

