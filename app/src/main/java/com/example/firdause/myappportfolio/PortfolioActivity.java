package com.example.firdause.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortfolioActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    //Click Spotify Streamer button
    public void clickSpotify(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Spotify app!", Toast.LENGTH_LONG).show();
    }

    //Click Scores App button
    public void clickScores(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Scores app!", Toast.LENGTH_LONG).show();
    }

    //Click Library App button
    public void clickLibrary(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Library app!", Toast.LENGTH_LONG).show();
    }

    //Click Build It Bigger button
    public void clickBuild(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Build app!", Toast.LENGTH_LONG).show();
    }

    //Click XYZ Reader button
    public void clickXYZ(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my XYZ app!", Toast.LENGTH_LONG).show();
    }

    //Click Capstone: My Own App button
    public void clickCapstone(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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
