package com.dtube.steem.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

import com.dtube.steem.R;

/**
 * DTube for DTube is an Open Source app realized by Leonardo Rignanese <rignanese.leo@gmail.com>
 * GNU GENERAL PUBLIC LICENSE  Version 2, June 1991
 * GITHUB: https://github.com/rignaneseleo/DTube-for-DTube
 */
public class CreditsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //load the fragment
        getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();
    }

    //preference fragment
    public static class MyPreferenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.credits);//load the layout
        }
    }
}