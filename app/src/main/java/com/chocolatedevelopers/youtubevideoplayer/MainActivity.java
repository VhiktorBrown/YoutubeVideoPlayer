package com.chocolatedevelopers.youtubevideoplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerViewFeed)
    RecyclerView recyclerViewFeed;
    YoutubeRecyclerAdapter mRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // prepare data for list
        List<YoutubeVideo> youtubeVideos = prepareList();
        mRecyclerAdapter = new YoutubeRecyclerAdapter(youtubeVideos);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewFeed.setLayoutManager(mLayoutManager);
        recyclerViewFeed.setItemAnimator(new DefaultItemAnimator());
        recyclerViewFeed.setAdapter(mRecyclerAdapter);
    }
    private List<YoutubeVideo> prepareList() {
        ArrayList<YoutubeVideo> videoArrayList=new ArrayList<>();
        // add first item
        YoutubeVideo video1 = new YoutubeVideo();
        video1.setId(1l);
        video1.setImageUrl("https://i.ytimg.com/vi/zI-Pux4uaqM/maxresdefault.jpg");
        video1.setTitle(
                "Thugs Of Hindostan - Official Trailer | Amitabh Bachchan | Aamir Khan");
        video1.setVideoId("zI-Pux4uaqM");
        videoArrayList.add(video1);
        // add second item
        YoutubeVideo video2 = new YoutubeVideo();
        video2.setId(2l);
        video2.setImageUrl("https://i.ytimg.com/vi/8ZK_S-46KwE/maxresdefault.jpg");
        video2.setTitle(
                "Colors for Children to Learning with Baby Fun Play with Color Balls Dolphin...");
        video2.setVideoId("8ZK_S-46KwE");
        // add third item
        YoutubeVideo video3 = new YoutubeVideo();
        video3.setId(3l);
        video3.setImageUrl("https://i.ytimg.com/vi/8czMWUH7vW4/hqdefault.jpg");
        video3.setTitle("Air Hostess Accepts Marriage Proposal Mid-Air, Airline Fires her.");
        video3.setVideoId("8czMWUH7vW4");
        // add four item
        YoutubeVideo video4 = new YoutubeVideo();
        video4.setId(4l);
        video4.setImageUrl("https://i.ytimg.com/vi/YrQVYEb6hcc/maxresdefault.jpg");
        video4.setTitle("EXPERIMENT Glowing 1000 degree METAL BALL vs Gunpowder (100 grams)");
        video4.setVideoId("YrQVYEb6hcc");
        // add four item
        YoutubeVideo video5 = new YoutubeVideo();
        video5.setId(5l);
        video5.setImageUrl("https://i.ytimg.com/vi/S84Fuo2rGoY/maxresdefault.jpg");
        video5.setTitle("What happened after Jauhar of Padmavati");
        video5.setVideoId("S84Fuo2rGoY");
        videoArrayList.add(video1);
        videoArrayList.add(video2);
        videoArrayList.add(video3);
        videoArrayList.add(video4);
        return videoArrayList;
    }
}
