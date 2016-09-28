package com.yuanjiexie.spring2016.oraclebones;

/**
 * The Word class contains english and chinese strings, with or without image
 * Each objuct can have 2 or 3 properties.
 */
public class Word {

    // number -1 to represent there is no image
    private static final int NO_IMAGE = -1;

    // chinese word
    private String chineseWord;

    // english word
    private String englishWord;

    // Image resource id, an integer, set to -1, no imageID as default
    private int imageResID = NO_IMAGE;

    /**
     * Constructor for only text
     * @param chinese is the chinese word
     * @param english is the english word
     */
    public Word(String chinese, String english) {
        chineseWord = chinese;
        englishWord = english;
    }


    /**
     * Constructor for text and image
     * @param chinese is the chinese word
     * @param english is the english word
     * @param id is the image resource ID
     */
    public Word(String chinese, String english, int id) {
        chineseWord = chinese;
        englishWord = english;
        imageResID = id;
    }

    /**
     *  Getter of chinese word
     * @return chinese word
     */
    public String getChineseWord() {
        return chineseWord;
    }

    /**
     * Getter of english word
     * @return english word
     */
    public String getEnglishWord() {
        return englishWord;
    }

    /**
     * Getter of Image Resource ID
     * @return imageResID
     */
    public int getImageResID() {
        return imageResID;
    }

    /**
     * check if there is a image within the word
     * @return true if there is a image within word
     */
    public boolean hasImage() {
        if (imageResID == NO_IMAGE) return false;
        else return true;
        //return imageResID != NO_IMAGE;
    }
}
