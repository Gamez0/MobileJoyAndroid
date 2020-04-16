package com.praylist.mobileJoy.fragment;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.badge.BadgeDrawable;
import com.praylist.mobileJoy.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HymnFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HymnFragment extends Fragment {


    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private MediaPlayer mediaPlayer3;
    private MediaPlayer mediaPlayer4;

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HymnFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HymnFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HymnFragment newInstance(String param1, String param2) {
        HymnFragment fragment = new HymnFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer1.pause();
        mediaPlayer1.seekTo(0);
        mediaPlayer2.pause();
        mediaPlayer2.seekTo(0);
        mediaPlayer3.pause();
        mediaPlayer3.seekTo(0);
        mediaPlayer4.pause();
        mediaPlayer4.seekTo(0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hymn, container, false);

//        imageView1 = (ImageView) view.findViewById(R.id.thumbNail1);
//        imageView2 = (ImageView) view.findViewById(R.id.thumbNail2);
//        imageView3 = (ImageView) view.findViewById(R.id.thumbNail3);
//        imageView4 = (ImageView) view.findViewById(R.id.thumbNail4);
//
//        Picasso.get().load("https://img.youtube.com/vi/1my2AV2vi6s/0.jpg").into(imageView1);
//        Picasso.get().load("https://img.youtube.com/vi/24L6J8dw9Y0/0.jpg").into(imageView2);
//        Picasso.get().load("https://img.youtube.com/vi/I8iNYugqxfI/0.jpg").into(imageView3);
//        Picasso.get().load("https://img.youtube.com/vi/aQjrm5vPcMo/0.jpg").into(imageView4);



        mediaPlayer1 = MediaPlayer.create(getContext(),R.raw.in_all_circumstances_01);
        mediaPlayer2 = MediaPlayer.create(getContext(),R.raw.standing_on_the_promises_02);
        mediaPlayer3 = MediaPlayer.create(getContext(),R.raw.dreaming_about_our_home_03);
        mediaPlayer4 = MediaPlayer.create(getContext(),R.raw.in_your_beautiful_sanctuary_04);

        final Button playButton1 = (Button) view.findViewById(R.id.playButton1);
        final Button playButton2 = (Button) view.findViewById(R.id.playButton2);
        final Button playButton3 = (Button) view.findViewById(R.id.playButton3);
        final Button playButton4 = (Button) view.findViewById(R.id.playButton4);

        playButton1.setBackgroundResource(R.drawable.ic_play);
        playButton2.setBackgroundResource(R.drawable.ic_play);
        playButton3.setBackgroundResource(R.drawable.ic_play);
        playButton4.setBackgroundResource(R.drawable.ic_play);



        playButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer1.isPlaying()){
                    mediaPlayer1.pause();
                    playButton1.setBackgroundResource(R.drawable.ic_play);
                }else{
                    mediaPlayer1.start();
                    playButton1.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });

        playButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                    playButton2.setBackgroundResource(R.drawable.ic_play);
                }else{
                    mediaPlayer2.start();
                    playButton2.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });

        playButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer3.isPlaying()){
                    mediaPlayer3.pause();
                    playButton3.setBackgroundResource(R.drawable.ic_play);
                }else{
                    mediaPlayer3.start();
                    playButton3.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });

        playButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer4.isPlaying()){
                    mediaPlayer4.pause();
                    playButton4.setBackgroundResource(R.drawable.ic_play);
                }else{
                    mediaPlayer4.start();
                    playButton4.setBackgroundResource(R.drawable.ic_pause);
                }
            }
        });
        Button stopButton1 = (Button) view.findViewById(R.id.stopButton1);
        stopButton1.setBackgroundResource(R.drawable.ic_stop);
        stopButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mediaPlayer1.stop();
                mediaPlayer1.pause();
                mediaPlayer1.seekTo(0);
                playButton1.setBackgroundResource(R.drawable.ic_play);
            }
        });
        Button stopButton2 = (Button) view.findViewById(R.id.stopButton2);
        stopButton2.setBackgroundResource(R.drawable.ic_stop);
        stopButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.pause();
                mediaPlayer2.seekTo(0);
                playButton2.setBackgroundResource(R.drawable.ic_play);
            }
        });
        Button stopButton3 = (Button) view.findViewById(R.id.stopButton3);
        stopButton3.setBackgroundResource(R.drawable.ic_stop);
        stopButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
                playButton3.setBackgroundResource(R.drawable.ic_play);
            }
        });Button stopButton4 = (Button) view.findViewById(R.id.stopButton4);
        stopButton4.setBackgroundResource(R.drawable.ic_stop);
        stopButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.pause();
                mediaPlayer4.seekTo(0);
                playButton4.setBackgroundResource(R.drawable.ic_play);
            }
        });


        // Inflate the layout for this fragment
        return view;
    }
}
