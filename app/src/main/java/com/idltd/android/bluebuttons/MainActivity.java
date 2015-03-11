package com.idltd.android.bluebuttons;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.IntentFilter;
import android.content.Intent;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Toast.makeText(getApplication(),"here",Toast.LENGTH_SHORT);
        android.util.Log.d("a","b");
        IntentFilter filter = new IntentFilter(Intent.ACTION_MEDIA_BUTTON);
        filter.setPriority(IntentFilter.SYSTEM_HIGH_PRIORITY^100);
        MediaButtonIntentReceiver r = new MediaButtonIntentReceiver();
        registerReceiver(r, filter);
        Toast.makeText(getApplication(),"there",Toast.LENGTH_SHORT);
        android.util.Log.d("c",Integer.toString(IntentFilter.SYSTEM_HIGH_PRIORITY));
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.d("resume","---");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
