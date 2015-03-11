package com.idltd.android.bluebuttons;

    import android.content.BroadcastReceiver;
    import android.content.Context;
    import android.content.Intent;
    import android.view.KeyEvent;

    public class MediaButtonIntentReceiver extends BroadcastReceiver {

        public MediaButtonIntentReceiver() {
            super();
            android.util.Log.d("broadcast media event", "create");
        }

        @Override
        public void onReceive(Context context, Intent intent) {
//		android.widget.Toast.makeText(context.getApplicationContext(),"got one!",android.widget.Toast.LENGTH_LONG);
            android.util.Log.d("broadcast media event", "blah");
            String intentAction = intent.getAction();
            if (!Intent.ACTION_MEDIA_BUTTON.equals(intentAction)) {
                return;
            }
            KeyEvent event = (KeyEvent)intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
            if (event == null) {
                return;
            }
            int action = event.getAction();
            if (action == KeyEvent.ACTION_DOWN) {
                // do something
            }
            abortBroadcast();
        }
    }


