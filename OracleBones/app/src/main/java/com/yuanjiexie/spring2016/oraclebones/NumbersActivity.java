package com.yuanjiexie.spring2016.oraclebones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link NumbersActivity} shows a list of word.
 * For each release, display the Chinese, English, and Oracle script image.
 */
public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList of wordList.
        ArrayList<Word> wordList = new ArrayList<Word>();
        wordList.add(new Word("一 （yī）", "One", R.drawable.one));
        wordList.add(new Word("二 （èr）", "Two", R.drawable.two));
        wordList.add(new Word("三 （sān）", "Three", R.drawable.three));
        wordList.add(new Word("四 （sì）", "Four", R.drawable.four));
        wordList.add(new Word("五 （wǔ）", "Five", R.drawable.five));
        wordList.add(new Word("六 （liù）", "Six", R.drawable.six));
        wordList.add(new Word("七 （qī）", "Seven", R.drawable.seven));
        wordList.add(new Word("八 （bā）", "Eight", R.drawable.eight));
        wordList.add(new Word("九 （jiǔ）", "Nine", R.drawable.nine));
        wordList.add(new Word("十 （shí）", "Ten", R.drawable.ten));
        wordList.add(new Word("二十 （èr shí）", "Twenty", R.drawable.twenty));
        wordList.add(new Word("三十 （sān shí）", "Thirty", R.drawable.thirty));
        wordList.add(new Word("四十 （sì shí）", "Forty", R.drawable.fourty));
        wordList.add(new Word("五十 （wǔ shí）", "Fifty", R.drawable.fifty));
        wordList.add(new Word("六十 （liù shí）", "Sixty", R.drawable.sixty));
        wordList.add(new Word("七十 （qī shí）", "Seventy", R.drawable.seventy));
        wordList.add(new Word("八十 （bā shí）", "Eighty", R.drawable.eighty));
        wordList.add(new Word("百 （bǎi）", "Hundred", R.drawable.hundred));
        wordList.add(new Word("千 （qiān）", "Thousand", R.drawable.thousand));
        wordList.add(new Word("万 （wàn）", "Ten thousand", R.drawable.wan));


        // Create an {@link WordAdaper}, whose data source is a list of
        // {@link Word}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter itemsAdapter = new WordAdapter(this, wordList, R.color.category_numbers);


        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.wordView);
        listView.setAdapter(itemsAdapter);

    }
}
