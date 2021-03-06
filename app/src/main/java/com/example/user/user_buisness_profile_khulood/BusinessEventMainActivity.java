package com.example.user.user_buisness_profile_khulood;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BusinessEventMainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<BusinessEventListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_event_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

            /* every item of  recycler view has a fixed size*/
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

            /* we put data we want to store inside the list item*/
        listItems = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            BusinessEventListItem listItem = new BusinessEventListItem(
                    R.drawable.target,
                    "Place Name" + i + 1,
                    "Place description",

                    R.drawable.bookmark,
                    R.drawable.heart,
                    R.attr.ratingBarStyleSmall


            );

            listItems.add(listItem);

        }


        adapter = new BusinessEventAdapter(listItems, this);

        recyclerView.setAdapter(adapter);


    }


}

