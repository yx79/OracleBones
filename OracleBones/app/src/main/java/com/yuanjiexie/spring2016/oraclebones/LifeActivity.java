package com.yuanjiexie.spring2016.oraclebones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link LifeActivity} shows a list of word.
 * For each release, display the Chinese, English, and Oracle script image.
 */
public class LifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList of wordList.
        ArrayList<Word> wordList = new ArrayList<Word>();

        wordList.add(new Word("女 （nǚ）", "Woman", R.drawable.woman));
        wordList.add(new Word("母 （mǔ）", "Mother", R.drawable.mother));
        wordList.add(new Word("孕 （yùn）", "Pregnant", R.drawable.pregnant));
        wordList.add(new Word("人 （rén）", "People", R.drawable.people));
        wordList.add(new Word("大 （dà）", "Grown up", R.drawable.adult));
        wordList.add(new Word("儿 （ér）", "Son", R.drawable.son));
        wordList.add(new Word("童 （tóng）", "Child", R.drawable.child));
        wordList.add(new Word("老 （Lǎo）", "Aged", R.drawable.older));
        wordList.add(new Word("父 （fù）", "Father", R.drawable.father));
        wordList.add(new Word("男 （nán）", "Man", R.drawable.man));

        // Create an {@link WordAdaper}, whose data source is a list of
        // {@link Word}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter itemsAdapter = new WordAdapter(this, wordList, R.color.category_life);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.wordView);
        listView.setAdapter(itemsAdapter);
    }
}
