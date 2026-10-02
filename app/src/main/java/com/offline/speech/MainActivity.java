package com.offline.speech;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hindi Voice Typing Service is Active");
        tv.setPadding(40, 40, 40, 40);
        tv.setTextSize(18);
        setContentView(tv);
    }
}
