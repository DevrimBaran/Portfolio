package com.example.peabgabe4;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Diese Klasse berechnet die Fakultät der Zahl die ins Textfeld eingegeben wird.
 */
public class FacultyActivity extends AppCompatActivity {

    /**
     * Die FalcultyTask berechnet die Fakultät im Hintergrund in einem seperaten asynchronen Thread.
     */
    @SuppressLint("StaticFieldLeak")
    class FacultyTask extends AsyncTask<Integer, Integer, Double> {

        @Override
        protected void onProgressUpdate(Integer... progress) {
            progressBarRef.setProgress(progress[0]);
        }

        @Override
        protected Double doInBackground(Integer... values) {
            double factorial = values[0];

            for (int i = 2; i < values[0]; i++) {
                if (factorial == Double.POSITIVE_INFINITY) {
                    break;
                }
                factorial = factorial * i;
                publishProgress((int) (i / (float) values[0] * 100));
            }
            Log.d("Factorial is", " " + factorial);
            return factorial;
        }

        @SuppressLint("SetTextI18n")
        @Override
        protected void onPostExecute(Double result) {
            resultViewRef.setText("Result: " + result.toString());
            progressBarRef.setProgress(100);
        }
    }

    private EditText numberTextRef;
    private ProgressBar progressBarRef;
    private TextView resultViewRef;
    private Receiver receiver = new Receiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        numberTextRef = findViewById(R.id.numberText);
        progressBarRef = findViewById(R.id.progressBar);
        resultViewRef = findViewById(R.id.resultView);
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
     * Die onClick Methode für den Submit button.
     *
     * @param view Die View für den Button.
     */
    public void onClickSubmitBtn(View view) {
        if (numberTextRef.getText().toString().equals("")) {
            numberTextRef.setText("1");
        }
        FacultyTask facultyTask = new FacultyTask();
        try {
            facultyTask.execute(Integer.parseInt(numberTextRef.getText().toString()));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Number is bigger then Integer MAX_VALUE.", Toast.LENGTH_SHORT).show();
        }
    }
}
