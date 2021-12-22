package com.example.peabgabe4;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Die PersonActivity in der man Personen in die Recyclerview hinzufügen kann.
 */
public class PersonActivity extends AppCompatActivity {

    private Receiver receiver = new Receiver();
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    public static ArrayList<Person> dataSet = new ArrayList<>();
    private EditText firstNameEditTxtRef;
    private EditText lastNameEditTxtRef;
    private EditText ageTxtRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        RecyclerView recyclerViewRef = findViewById(R.id.personsRecyclerView);
        firstNameEditTxtRef = findViewById(R.id.firstNameEditTxt);
        lastNameEditTxtRef = findViewById(R.id.lastNameEditTxt);
        ageTxtRef = findViewById(R.id.ageEditTxt);
        layoutManager = new LinearLayoutManager(this);
        adapter = new MyAdapter(dataSet);
        recyclerViewRef.setAdapter(adapter);
        recyclerViewRef.setLayoutManager(layoutManager);
    }

    /**
     * Mit Klick auf den Insert Button wird eine neue Person erstellt die dann dataSet sortiert hinzugefügt und dann in die Recyclerview hinzugefügt.
     * @param view Die view für den Button.
     */
    public void onClickInsertBtn(View view) {
        if (firstNameEditTxtRef.getText().toString().isEmpty() || lastNameEditTxtRef.getText().toString().isEmpty() || ageTxtRef.getText().toString().isEmpty()) {
            Toast.makeText(this, "Eines der Textfelder ist leer", Toast.LENGTH_SHORT).show();
        } else {
            Person person = new Person();
            person.setFirstName(firstNameEditTxtRef.getText().toString());
            person.setLastName(lastNameEditTxtRef.getText().toString());
            person.setAge(Integer.parseInt(ageTxtRef.getText().toString()));
            dataSet.add(0, person);
            Collections.sort(dataSet);
            adapter.notifyItemInserted(0);
            layoutManager.scrollToPosition(0);
            adapter.notifyDataSetChanged();
        }
    }

    /**
     * Mit dem Klick auf Read from XML wird aus der XML Datei die Personen rausgelesen und dann wieder diese Persponen dataSet sortiert hinzugefügt
     * und dann in die Recyclerview hinzugefügt.
     * @param view Die view für den Button.
     */
    public void onClickReadXmlBtn(View view) {
        String fileName = "xml_sample_data.xml";
        AssetManager manager = getAssets();
        InputStream inputStream;
        try {
            inputStream = manager.open(fileName, AssetManager.ACCESS_BUFFER);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            document.getDocumentElement().normalize();
            NodeList list = document.getElementsByTagName("person");
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Person person = new Person();
                    Element element = (Element) node;
                    person.setAge(Integer.parseInt(element.getAttribute("age")));
                    person.setFirstName(element.getElementsByTagName("first").item(0).getTextContent().trim());
                    person.setLastName(element.getElementsByTagName("last").item(0).getTextContent().trim());
                    dataSet.add(0, person);
                }
            }
            Collections.sort(dataSet);
            adapter.notifyItemInserted(0);
            layoutManager.scrollToPosition(0);
            adapter.notifyDataSetChanged();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    /**
     * Mit dem Klick auf Json Button wird die JsonActivity gestartet.
     * @param view Die view für den Button.
     */
    public void onClickJsonBtn(View view) {
        Intent intent = new Intent(this, JsonActivity.class);
        startActivity(intent);
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
}