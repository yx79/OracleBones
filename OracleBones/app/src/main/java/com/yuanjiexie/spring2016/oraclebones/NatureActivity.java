package com.yuanjiexie.spring2016.oraclebones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link NatureActivity} shows a list of word.
 * For each release, display the Chinese, English, and Oracle script image.
 */
public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList of wordList.
        ArrayList<Word> wordList = new ArrayList<Word>();

        wordList.add(new Word("木 （mù）", "Wood", R.drawable.wood));
        wordList.add(new Word("水 （shuǐ）", "Water", R.drawable.water));
        wordList.add(new Word("火 （huǒ）", "Fire", R.drawable.fire));
        wordList.add(new Word("土 （tǔ）", "Soil", R.drawable.soil));
        wordList.add(new Word("风 （fēng）", "Wind", R.drawable.wind));
        wordList.add(new Word("雨 （yǔ）", "Rain", R.drawable.rain));
        wordList.add(new Word("雷 （léi）", "Thunder", R.drawable.thunder));
        wordList.add(new Word("日 （rì）", "Sun", R.drawable.sun));
        wordList.add(new Word("月 （yuè）", "Moon", R.drawable.moon));
        wordList.add(new Word("山 （shān）", "Mountain", R.drawable.mountain));
        wordList.add(new Word("云 （yún）", "Cloud", R.drawable.cloud));
        wordList.add(new Word("光 （guāng）", "Light", R.drawable.light));

        // Create an {@link WordAdaper}, whose data source is a list of
        // {@link Word}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter itemsAdapter = new WordAdapter(this, wordList, R.color.category_nature);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.wordView);
        listView.setAdapter(itemsAdapter);


    }
}
