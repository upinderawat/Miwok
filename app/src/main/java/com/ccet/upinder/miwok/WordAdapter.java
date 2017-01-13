package com.ccet.upinder.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Upinder on 11/01/2017.
 */
public class WordAdapter extends ArrayAdapter<Word>{
    //provides the background color id for the different activities
    int mColorResourceId;
    private MediaPlayer mMediaPlayer;

      public WordAdapter(Context context, ArrayList<Word> words,int colorResourceId){
        super(context,0,words);//calls the super class constructor
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        final Word currentWord = getItem(position);
        // Get the TextViews from list_item and inflate the TextView and ImageView
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        TextView engTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.text_container);

        miwokTextView.setText(currentWord.getmMiwokTranslation());
        engTextView.setText(currentWord.getmDefaultTranslation());
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        linearLayout.setBackgroundColor(color);

        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }


}