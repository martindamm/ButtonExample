package com.iducate.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lecture 2 exercise 2: Arrays
        String[] Person={"Martin Damm, 32","John Doe, 45","Leo Nardo, 57", "Diana Caprio, 37"};
            for (String name : Person){
                System.out.println( "Name: " + name);
            }

        /*
        // Lecture 2 exercise 1
        Person p1 = new Person("Martin Damm",32);
        Person p2 = new Person("John Doe", 45);
        p1.printPerson();
        p2.printPerson();
        */

        // Lecture 2 exercise 3: Toasts
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0); // sets the toast dead center
        toast.show();
    }
    
    public void sayHello(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Hello, Martin";
        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0); // sets the toast dead center
        toast.show();

        /*
        Dialog dialog = new Dialog(this);

        dialog.setTitle("Greetings");

        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setPadding(20, 20, 20, 20);

        dialog.setContentView(textView);

        dialog.show();
        */
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
