package edu.asu.bscs.csiebler.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Copyright 2015 Cory Siebler
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * @author Cory Siebler csiebler@asu.edu
 * @version Jan 16, 2015
 */
public class MainActivity extends ActionBarActivity {

    /**
     * Logs notification of method call.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().getSimpleName(), "onCreate");
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     *
     * @param item
     * @return
     */
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
     * Logs notification of method call.
     */
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(getClass().getSimpleName(), "onRestart");
    }

    /**
     * Logs notification of method call.
     */
    @Override
    public void onPause() {
        super.onPause();
        Log.d(getClass().getSimpleName(), "onPause");
    }

    /**
     * Logs notification of method call.
     */
    @Override
    public void onResume() {
        super.onResume();
        Log.d(getClass().getSimpleName(), "onResume");
    }

    /**
     * Logs notification of method call.
     */
    @Override
    public void onStop() {
        super.onStop();
        Log.d(getClass().getSimpleName(), "onStop");
    }

    /**
     * Logs notification of method call.
     */
    @Override
    public void onStart() {
        super.onStart();
        Log.d(getClass().getSimpleName(), "onStart");
    }

    /**
     * Logs notification of method call.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(getClass().getSimpleName(), "onDestroy");
    }

    /**
     * Logs notification of method call. Starts the DialogActivity.
     *
     * @param v
     */
    public void startDialog(View v) {
        Log.w("ActivityMain", "called startDialog()");
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);
    }

    /**
     * Logs notification of method call. Starts the DialogActivity.
     *
     * @param v
     */
    public void showTime(View v) {
        Log.w("ActivityMain:", "called showTime()");

        // Initialize a new Calendar
        final Calendar cal = Calendar.getInstance();

        // Grab the TextView
        TextView textView = (TextView) findViewById(R.id.helloTV);

        // Set the date format
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

        // Modify the TextView
        textView.setText(sdf.format(cal.getTime()));
    }

}
