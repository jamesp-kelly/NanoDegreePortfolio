package com.jameskelly.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  private static final String TOAST_FORMAT = "This will launch the %s app";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    setupToolbar();
  }

  private void setupToolbar() {
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  @OnClick(R.id.button_build_bigger)
  public void buildBiggerClicked() {
    displayButtonInfo(getString(R.string.build_it_bigger));
  }

  @OnClick(R.id.button_capstone)
  public void capstoneClicked() {
    displayButtonInfo(getString(R.string.capstone));
  }

  @OnClick(R.id.button_material)
  public void materialClicked() {
    displayButtonInfo(getString(R.string.make_your_app_material));
  }

  @OnClick(R.id.button_movies)
  public void moviesClicked() {
    displayButtonInfo(getString(R.string.popular_movies));
  }

  @OnClick(R.id.button_stock)
  public void stockClicked() {
    displayButtonInfo(getString(R.string.stock_hawk));
  }

  @OnClick(R.id.button_ubiquitous)
  public void ubiquitousClicked() {
    displayButtonInfo(getString(R.string.go_ubiquitous));
  }

  private void displayButtonInfo(String appName) {
    Toast.makeText(this, String.format(TOAST_FORMAT, appName), Toast.LENGTH_SHORT).show();
  }

}
