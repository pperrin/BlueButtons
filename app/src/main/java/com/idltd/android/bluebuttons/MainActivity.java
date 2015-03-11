package com.idltd.android.bluebuttons;

import android.app.*;
import android.os.*;
import android.content.IntentFilter;
import android.content.Intent;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Toast.makeText(getApplication(),"here",Toast.LENGTH_SHORT);
		android.util.Log.d("a","b");
		
    IntentFilter filter = new IntentFilter(Intent.ACTION_MEDIA_BUTTON);
	filter.setPriority(IntentFilter.SYSTEM_HIGH_PRIORITY^100);
    MediaButtonIntentReceiver r = new MediaButtonIntentReceiver();
    registerReceiver(r, filter); 
	Toast.makeText(getApplication(),"there",Toast.LENGTH_SHORT);
		android.util.Log.d("c",Integer.toString(IntentFilter.SYSTEM_HIGH_PRIORITY));

	}
}
