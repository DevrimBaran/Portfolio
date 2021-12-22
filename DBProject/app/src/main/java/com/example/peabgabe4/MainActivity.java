package com.example.peabgabe4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Die Mainactivity die zum Start der App öffnet.
 */
public class MainActivity extends AppCompatActivity {

    private Receiver receiver = new Receiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.registerReceiver(receiver, Receiver.INTENT_FILTER);
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.unregisterReceiver(receiver);
    }

    /**
     * OnClick Methode für den Persons Button.
     * @param view Die view für den Button.
     */
    public void onClickPersonsBtn(View view) {
        Intent intent = new Intent(this, PersonActivity.class);
        startActivity(intent);
    }

    /**
     * OnClick Methode für den Faculty Button.
     * @param view Die view für den Button.
     */
    public void onClickFacultyBtn(View view) {
        Intent intent = new Intent(this, FacultyActivity.class);
        startActivity(intent);
    }

}
