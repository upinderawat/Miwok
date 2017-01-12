package com.ccet.upinder.miwok;

/**
 * Created by Upinder on 11/01/2017.
 */

public class Word {
    static final int NO_IMAGE_SET = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_SET;
    private int mSongId;

    //word containing defualtTranslation, MiwokTranslation, auddio
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mSongId) {
        this.mSongId = mSongId;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    //word containing defualtTranslation, MiwokTranslation, image, auddio
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mSongId) {
        this.mSongId = mSongId;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return this.mImageResourceId;
    }

    public int getmSongId() {
        return this.mSongId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_SET;
    }
}
