// add Internet permission

package org.gc.helloworldvolleyclient;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.TextView;
import java.util.List;

import com.google.gson.*;
import com.android.volley.*;
import com.android.volley.toolbox.*;

// in build.gradle for Module:app
// implementation 'com.android.volley:volley:1.1.1'
// implementation 'com.google.code.gson:gson:2.8.5'

public class MainActivity extends AppCompatActivity
{

    // uri of RESTful service on Azure
    private String SERVICE_URI = "https://ead2ca2api.azurewebsites.net/api/team/all";          // or https
    private String TAG = "";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // floating action button, call the service
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                callService(view);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    // call RESTful service using volley and display results
    public void callService(View v)
    {
        // get TextView for displaying result
        final TextView outputTextView = (TextView) findViewById(R.id.outputTextView);

        try
        {
            // make a string request (JSON request an alternative)
            RequestQueue queue = Volley.newRequestQueue(this);
            Log.d(TAG, "Making request");
            try
            {
                StringRequest strObjRequest = new StringRequest(Request.Method.GET, SERVICE_URI,
                        new Response.Listener<String>()
                        {
                            @Override
                            public void onResponse(String response)
                            {
                                // parse resulting string containing JSON to Greeting object
                                List<Team> team = (List<Team>) new Gson().fromJson(response, Team.class);
                                //outputTextView.setText(team.toString());

                            }
                        },
                        new Response.ErrorListener()
                        {
                            @Override
                            public void onErrorResponse(VolleyError error)
                            {
                                outputTextView.setText(error.toString());
                                //Log.d(TAG, "Error" + error.toString());
                            }
                        });
                queue.add(strObjRequest);           // can have multiple in a queue, and can cancel
            }
            catch (Exception e1)
            {
                Log.d(TAG, e1.toString());
                outputTextView.setText(e1.toString());
            }
        }
        catch (Exception e2)
        {
            Log.d(TAG, e2.toString());
            outputTextView.setText(e2.toString());
        }
    }
}




