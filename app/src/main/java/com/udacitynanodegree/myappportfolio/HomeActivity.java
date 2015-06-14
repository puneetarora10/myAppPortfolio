package com.udacitynanodegree.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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

    /**
     * called when any of the buttons is clicked
     * checks which button is clicked and accordingly displays a toast
     *
     * @param view
     */
    public void showMessage(View view) {
        // message to be displayed
        String messageToBeDisplayed = "This button will launch my ";
        // switch view's id to find which button is clicked and append to messageToBeDisplayed
        switch (view.getId()) {
            case R.id.application1Button: // Spotify Streamer
                messageToBeDisplayed += "spotify streamer app";
                break;
            case R.id.application2Button: // Scores
                messageToBeDisplayed += "scores app";
                break;
            case R.id.application3Button: // Library
                messageToBeDisplayed += "library app";
                break;
            case R.id.application4Button: // Build it Bigger
                messageToBeDisplayed += "build it bigger app";
                break;
            case R.id.application5Button: // XYZ
                messageToBeDisplayed += "xyz reader app";
                break;
            case R.id.application6Button: // Capstone
                messageToBeDisplayed += "capstone app";
                break;
        }
        // create and show toast
        Toast toast = Toast.makeText(getApplicationContext(), messageToBeDisplayed, Toast.LENGTH_SHORT);
        toast.show();
    }
}
