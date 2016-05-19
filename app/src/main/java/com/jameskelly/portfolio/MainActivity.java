package com.jameskelly.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setupToolbar();
  }

  private void setupToolbar() {
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  public void portfolioButtonClicked(View view) {
    TextView textView = (TextView) view;
    String toastText = String.format("This button will launch my %s app!", textView.getText());
    Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
  }
}
