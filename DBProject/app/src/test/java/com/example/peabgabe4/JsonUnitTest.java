package com.example.peabgabe4;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class JsonUnitTest {

    private Person person = new Person();
    private Person person1 = new Person();
    private Person person2 = new Person();

    @Before
    public void JsonBefore() {
        person.setFirstName("Klaus");
        person.setLastName("Müller");
        person.setAge(60);
        person1.setFirstName("Leon");
        person1.setLastName("Schroeder");
        person1.setAge(31);
        person2.setFirstName("Manuela");
        person2.setLastName("Kortig");
        person2.setAge(24);
        PersonActivity.dataSet.add(0, person);
        PersonActivity.dataSet.add(0, person1);
        PersonActivity.dataSet.add(0, person2);
        Collections.sort(PersonActivity.dataSet);
        JsonActivity.JsonFormatter();
    }

    @Test
    public void Json_isCorrect() {
        assertEquals("{\n" +
                "\t\"persons\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"person\": {\n" +
                "\t\t\t\t\"first\": \"Klaus\",\n" +
                "\t\t\t\t\"last\": \"Müller\",\n" +
                "\t\t\t\t\"age\": 60\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"person\": {\n" +
                "\t\t\t\t\"first\": \"Leon\",\n" +
                "\t\t\t\t\"last\": \"Schroeder\",\n" +
                "\t\t\t\t\"age\": 31\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"person\": {\n" +
                "\t\t\t\t\"first\": \"Manuela\",\n" +
                "\t\t\t\t\"last\": \"Kortig\",\n" +
                "\t\t\t\t\"age\": 24\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}", JsonActivity.string);
    }
}