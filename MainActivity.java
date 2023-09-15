package com.example.kanika.smartcitytraveller;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;


public class MainActivity extends Activity  {

    Button top_picks, plan_your_day, bookmarks, eating_places, fetch_location;
    public static final String mypreference = "mypref";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_picks = (Button) findViewById(R.id.top);
        top_picks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClass(MainActivity.this, Location.class);
                i.putExtra("Uniqid","From_Top_Picks");
                startActivity(i);
            }
        });



        plan_your_day = (Button) findViewById(R.id.plan);
        plan_your_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClass(MainActivity.this, Location.class);
                i.putExtra("Uniqid","From_Plan_Your_Day");
                startActivity(i);
            }
        });

        eating_places = (Button) findViewById(R.id.eat);
        eating_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClass(MainActivity.this, Location.class);
                i.putExtra("Uniqid","From_Eating_Places");
                startActivity(i);
            }
        });
    }




    }







