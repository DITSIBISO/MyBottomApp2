package com.example.android.mybottomapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    View view;
    LayoutInflater inflater= null;
    Context context = this;
    FrameLayout content;

    MyAdapter myAdapter;
    ViewGroup container;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    view = null;
                    inflater = null;
                    content.removeAllViews();

                    // mTextMessage.setText(R.string.title_home);
                    inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                    view = inflater.inflate(R.layout.firstscreen,null);
                    //content.addView(view);

                    //......................
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.myRecycle);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    List<Contact> contactList = new ArrayList<>();

                    Contact contact1 = new Contact();
                    contact1.setName("can this the first on 1");

                    Contact contact2 = new Contact();
                    contact2.setName("can this the second on 2");

                    contactList.add(contact1);
                    contactList.add(contact2);


                    myAdapter = new MyAdapter(MainActivity.this, contactList);
                    recyclerView.setAdapter(myAdapter);

                    //Frame lAYOUT
                    content.addView(view);

                    //mTextMessage.setText(R.string.title_home);
                    return true;

                case R.id.navigation_dashboard:
                    view = null;
                    inflater = null;
                    content.removeAllViews();

                    //mTextMessage.setText(R.string.title_dashboard);
                    inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                    view = inflater.inflate(R.layout.secondscreen, null);
                    content.addView(view);
                    return true;
                case R.id.navigation_notifications:
                    view = null;
                    inflater = null;
                    content.removeAllViews();

                    //mTextMessage.setText(R.string.title_notifications);
                    inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                    view = inflater.inflate(R.layout.thirdscreen, null);
                    content.addView(view);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        content = (FrameLayout) findViewById(R.id.content);

        view = null;
        inflater = null;
        content.removeAllViews();

        // mTextMessage.setText(R.string.title_home);
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.firstscreen, null);

        //......................
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.myRecycle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<Contact>contactList = new ArrayList<>();

        Contact contact1 = new Contact();
        contact1.setName("can this the first on 1");

        Contact contact2 = new Contact();
        contact2.setName("can this the second on 2");

        contactList.add(contact1);
        contactList.add(contact2);


        myAdapter = new MyAdapter(MainActivity.this, contactList);
        recyclerView.setAdapter(myAdapter);

        content.addView(view);
    }

}
