package com.yuanjiexie.spring2016.oraclebones;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    // this is the background color ID of list
    private int mResourceColorID;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     * @param context    The current context. Used to inflate the layout file.
     * @param words      A List of Word objects to be displayed in a list
     * @param colorID    The color background ID of the list
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews with/without an ImageView, the adapter
        // is not going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mResourceColorID = colorID;
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView  The recycled view to populate.
     * @param parent   The parent ViewGroup that is used for inflation.
     * @return  The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if the existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // get the {@link Word} object loccated at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the chinese text
        TextView chTextView= (TextView) listItemView.findViewById(R.id.chinese_text);
        chTextView.setText(currentWord.getChineseWord());

        // Find the TextView in the list_item.xml layout with the English text
        TextView enTextView= (TextView) listItemView.findViewById(R.id.english_text);
        enTextView.setText(currentWord.getEnglishWord());

        // Find the picture in the list_item.xml or hide it when there is no image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        if (currentWord.hasImage()) {
            // set the resource ID and visibility to visible
            imageView.setImageResource(currentWord.getImageResID());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // If no image, set imageView visibility to GONE
            imageView.setVisibility(View.GONE);
        }

        // set the color theme for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // find the color that the resource ID maps to.
        int color = ContextCompat.getColor(getContext(), mResourceColorID);
        // Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // return the whole list items layout
        return listItemView;
    }
}
