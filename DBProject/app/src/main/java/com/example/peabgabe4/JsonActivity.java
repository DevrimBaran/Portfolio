package com.example.peabgabe4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Die Klasse zeigt die Personen, die in der Arrayliste in der PersonActivity sind, im JSON Format in einer neuen Activity an.
 */
public class JsonActivity extends AppCompatActivity {

    // Eigentlich wurde anfangs nur die JsonViewRef initialisiert. Da ich so aber keinen unitTest machen konnte habe ich noch einen
    // statische String Attribut initialisiert und die TextView da reingesetzt, damit ich den String dann im unitTest aufrufen konnte.
    // Da ich nicht mit reflections arbeiten wollte habe ich den String statisch gemacht.
    public static String string = "";
    public TextView jsonViewRef;
    private Receiver receiver = new Receiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        JsonFormatter();
        jsonViewRef = findViewById(R.id.jasnView);
        jsonViewRef.setText(string);
    }

    /**
     * Diese Methode ist zur Formattierung zum JsonFormat.
     */
    @SuppressLint("SetTextI18n")
    public static void JsonFormatter() {
        for (int i = PersonActivity.dataSet.size() - 1; i >= 0; i--) {
            String firstFormat = "";
            if (i == 0) {
                firstFormat = "{\n\t\"persons\": [\n\t\t{\n";
            }
            String secFormat = "\n\t\t\t}\n\t\t},\n\t\t{\n";
            String format = "\t\t\t\"person\": {\n\t\t\t\t\"first\": " + "\"" +
                    PersonActivity.dataSet.get(i).getFirstName() + "\",\n\t\t\t\t\"last\": \"" +
                    PersonActivity.dataSet.get(i).getLastName() + "\",\n\t\t\t\t\"age\": " +
                    PersonActivity.dataSet.get(i).getAge();
            if (i == PersonActivity.dataSet.size() - 1) {
                secFormat = "\n\t\t\t}\n\t\t}\n\t]\n}";
            }
            string = (firstFormat + format + secFormat + string);
        }
    }

    protected void onResume() {
        super.onResume();
        this.registerReceiver(receiver, Receiver.INTENT_FILTER);
    }

    @Override
    protected void onPause() {
        super.onPause();
        string = "";
        this.unregisterReceiver(receiver);
    }
}
