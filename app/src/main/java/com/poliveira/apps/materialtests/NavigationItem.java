package com.poliveira.apps.materialtests;

/**
 * Created by poliveira on 24/10/2014.
 */
public class NavigationItem {
    private String mText;

    public NavigationItem(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}
