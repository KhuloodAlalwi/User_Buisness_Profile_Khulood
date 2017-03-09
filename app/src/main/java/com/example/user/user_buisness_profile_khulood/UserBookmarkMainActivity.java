package com.example.user.user_buisness_profile_khulood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserBookmarkMainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<UserBookmarkListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user_bookmark);


          /* initialize recycler veiw take id from xml file*/

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

            /* every item of  recycler view has a fixed size*/
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

            /* we put data we want to store inside the list item*/
        listItems = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            UserBookmarkListItem listItem = new UserBookmarkListItem(
                    R.drawable.target,
                    "Place Name" + i + 1,
                    "Place description",

                    R.drawable.bookmark


            );

            listItems.add(listItem);

        }


        adapter = new UserBookmarkAdapter(listItems, this);

        recyclerView.setAdapter(adapter);


    }


}