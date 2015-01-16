package edu.asu.bscs.csiebler.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

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
public class DialogActivity extends Activity {

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().getSimpleName(), "onCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
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
     * Logs notification of method call. Finishes the activity.
     *
     * @param v
     */
    public void finishDialog(View v) {
        Log.w("DialogActivity", "called finishDialog");
        DialogActivity.this.finish();
    }

}
