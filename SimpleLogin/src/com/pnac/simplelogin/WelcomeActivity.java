package com.pnac.simplelogin;

import com.example.simplelogin.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class WelcomeActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_wecome);
    final Intent intent = getIntent();
    final String userName = (String) intent.getExtras().get("userName");
    
    LinearLayout ll = (LinearLayout) this.findViewById(R.id.welcome_activity);
    LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    TextView tv = new TextView(this);
    tv.setLayoutParams(lparams);
    tv.setText("Welcome : " + userName);
    ll.addView(tv);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.wecome, menu);
    return true;
  }

}
