package com.dtube.steem.utils;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;

/**
 * DTube for DTube is an Open Source app realized by Leonardo Rignanese <rignanese.leo@gmail.com>
 * GNU GENERAL PUBLIC LICENSE  Version 2, June 1991
 * GITHUB: https://github.com/rignaneseleo/DTube-for-DTube
 */
public class SwitchWithoutBugs extends SwitchPreference {
	public SwitchWithoutBugs(Context context) {
		super(context);
	}

	public SwitchWithoutBugs(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SwitchWithoutBugs(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
}