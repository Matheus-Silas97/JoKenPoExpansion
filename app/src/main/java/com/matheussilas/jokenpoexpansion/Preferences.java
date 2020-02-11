package com.matheussilas.jokenpoexpansion;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {
    private Context context;
    private SharedPreferences preferences;
    private static final String PLAYERNAME = "player_name";
    private SharedPreferences.Editor editor;
    private final String KEYNAME = "player";

    public Preferences(Context c) {
    this.context = c;
    preferences = context.getSharedPreferences(PLAYERNAME, 0);
    editor = preferences.edit();
    }


    public void savePlayer(String name) {
        editor.putString(KEYNAME,name);
        editor.commit();
    }

    public String loadPlayer() {
        return preferences.getString(KEYNAME,"");
    }

}
