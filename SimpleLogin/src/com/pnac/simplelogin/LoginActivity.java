package com.pnac.simplelogin;

import com.example.simplelogin.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    final Button loginButton = (Button) findViewById(R.id.login);
    final EditText userNameView = (EditText) findViewById(R.id.user_name);
    final EditText passwordView = (EditText) findViewById(R.id.password);

    loginButton.setOnClickListener(new OnClickListener() {

      public void onClick(View v) {
        Context context = getApplicationContext();
        final String enteredUserName = userNameView.getText().toString();
        final String enteredPassword = passwordView.getText().toString();
        if (enteredUserName.equals("") || enteredUserName == null || enteredPassword.equals("")
            || enteredPassword == null) {
          Toast toast = Toast.makeText(context, "Username or password was not entered. Please enter both.",
              Toast.LENGTH_LONG);
          toast.show();
        } else {
          Intent intent = new Intent(context, WelcomeActivity.class);
          intent.putExtra("userName", enteredUserName);
          startActivity(intent);
        }
      }

    });
  }

  @Override
  protected void onStart() {
    super.onStart();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.login, menu);
    return true;
  }

}
