package com.iducate.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // Lecture 2 exercise 2: Arrays
        String[] Person={"Martin Damm, 32","John Doe, 45","Leo Nardo, 57", "Diana Caprio, 37"};
            for (String name : Person){
                System.out.println( "Name: " + name);
            }
        /* Lecture 3, exercise 1 */
        ArrayList<Person> list = new ArrayList<>();


        // Create persons
        Person p1 = new Person("Martin Damm",32);
        Person p2 = new Person("John Doe", 45);
        Person p3 = new Person("Leo Nardo", 57);
        Person p4 = new Person("Diana Caprio", 37);

        // Create workers and pensionists
        Worker w1 = new Worker("Martin Damm", 32, 230923509);
        Worker w2 = new Worker("John Doe", 45, 2342309);
        Pensionist pn1 = new Pensionist("Leo Nardo",57, 1983);
        Pensionist pn2 = new Pensionist("Diana Caprio",37, 2003);

        // add persons, workers and pensionists to the ArrayList called list
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(w1);
        list.add(w2);
        list.add(pn1);
        list.add(pn2);


        list.add(w1);
        //Pensionist pns1 = new Pensionist("Leo Nardo", 57, 1983);
        //list.add(pns1);

            for (Person person:list){
                person.printPerson();
            }


        /* Lecture 2 exercise 3: Toasts */
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0); // sets the toast dead center
        toast.show();
        /* End of Lecture 2 exercise 3: Toasts */
    }
    
    public void sayHello(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Hello, Martin";
        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0); // sets the toast dead center
        toast.show();
    }

    public void btnTwo (View view){
        Context context = getApplicationContext();
        CharSequence text = "You have pressed button 2";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0); // sets the toast dead center
        toast.show();
    }
    
}
