package com.yuanjiexie.spring2016.oraclebones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link AnimalsActivity} shows a list of word.
 * For each release, display the Chinese, English, and Oracle script image.
 */
public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList of wordList.
        ArrayList<Word> wordList = new ArrayList<Word>();

        wordList.add(new Word("鼠 （shǔ）", "Mouse", R.drawable.mouse));
        wordList.add(new Word("牛 （niú）", "Bull", R.drawable.bull));
        wordList.add(new Word("虎 （hǔ）", "Tiger", R.drawable.tiger));
        wordList.add(new Word("兔 （tù）", "Rabbit", R.drawable.rabbit));
        wordList.add(new Word("龙 （lóng）", "Dragon", R.drawable.dragon));
        wordList.add(new Word("蛇 （shé）", "Snake", R.drawable.snake));
        wordList.add(new Word("马 （mǎ）", "Horse", R.drawable.horse));
        wordList.add(new Word("羊 （yáng）", "Ram", R.drawable.goat));
        wordList.add(new Word("猴 （hóu）", "Monkey", R.drawable.monkey));
        wordList.add(new Word("鸡 （jī）", "Chicken", R.drawable.chicken));
        wordList.add(new Word("狗 （gǒu） / 犬 （quǎn）", "Dog", R.drawable.dog));
        wordList.add(new Word("猪 （zhū） / 豕 （shǐ）", "Pig", R.drawable.pig));
        wordList.add(new Word("象 （xiàng）", "Elephant", R.drawable.elephant));
        wordList.add(new Word("鱼 （yú）", "Fish", R.drawable.fish));
        wordList.add(new Word("鹿 （lù）", "Deer", R.drawable.deer));


        // Create an {@link WordAdaper}, whose data source is a list of
        // {@link Word}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter itemsAdapter = new WordAdapter(this, wordList, R.color.category_animal);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.wordView);
        listView.setAdapter(itemsAdapter);
    }
}
