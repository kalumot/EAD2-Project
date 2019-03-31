// add Internet permission

package org.gc.helloworldvolleyclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

// in build.gradle for Module:app
// implementation 'com.android.volley:volley:1.1.1'
// implementation 'com.google.code.gson:gson:2.8.5'

public class MainActivity extends AppCompatActivity
{

    // uri of RESTful service on Azure
    private String SERVICE_URI = "https://ead2ca2api.azurewebsites.net/api/team/all";
    private String MATCH_URI = "https://ead2ca2api.azurewebsites.net/api/match/all";
    private String TAG = "helloworldvolleyclient";
    List<Team> clubs = new ArrayList<Team>() {
    };
    List<String> names = new ArrayList<String>() {
    };
    //TextView nametest = (TextView) findViewById(R.id.outputTextView);
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue queue = Volley.newRequestQueue(this);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, names);

        //teams for spinner
        try
        {
            StringRequest strObjRequest = new StringRequest(Request.Method.GET, SERVICE_URI,
                    new Response.Listener<String>()
                    {
                        @Override
                        public void onResponse(String response)
                        {
                            // parse resulting string containing JSON to Greeting object
                            List<Team> teams = new Gson().fromJson(response, new TypeToken<List<Team>>(){}.getType());
                            makeSpinner(teams);
                            Log.d(TAG, "Displaying data" + teams.toString());

                            
                        }
                    },
                    new Response.ErrorListener()
                    {
                        @Override
                        public void onErrorResponse(VolleyError error)
                        {
                            Log.d(TAG, "Error" + error.toString());
                        }
                    });
            queue.add(strObjRequest);           // can have multiple in a queue, and can cancel
        }
        catch (Exception e1)
        {
            Log.d(TAG, e1.toString());
        }


        TextView testy = (TextView) findViewById(R.id.testy);
        testy.setText(names.toString());

    }

    public void makeSpinner(List<Team> t)
    {
        for(int i = 0; i < t.size(); i++){
            clubs.add(t.get(i));
        }
        names.add("All");
        for(int i = 0; i < t.size(); i++){
          names.add(clubs.get(i).toString());
        }

        Spinner dynamicSpinner = (Spinner) findViewById(R.id.dynamic_spinner);
        dynamicSpinner.setAdapter(adapter);

        dynamicSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));
                String selected = parent.getItemAtPosition(position).toString();
                TextView testy = (TextView) findViewById(R.id.testy);
                testy.setText(selected);
                String code = getCode(selected);
                String newrl;
                if(selected != "All"){
                    newrl = "https://ead2ca2api.azurewebsites.net/api/team/" + code;
                }
                else{
                    newrl = "https://ead2ca2api.azurewebsites.net/api/match/all";
                }
                //String newrl = "https://ead2ca2api.azurewebsites.net/api/team/" + code;
                RequestQueue queue2 = Volley.newRequestQueue(MainActivity.this);
                try
                {
                    StringRequest strObjRequest = new StringRequest(Request.Method.GET, newrl,
                            new Response.Listener<String>()
                            {
                                @Override
                                public void onResponse(String response)
                                {
                                    // parse resulting string containing JSON to Greeting object
                                    List<Match> matches = new Gson().fromJson(response, new TypeToken<List<Match>>(){}.getType());
                                    TextView home1 = (TextView) findViewById(R.id.home1);
                                    home1.setText(matches.get(0).home.toString());
                                    TextView away1 = (TextView) findViewById(R.id.away1);
                                    away1.setText(matches.get(0).away.toString());
                                    TextView hs1 = (TextView) findViewById(R.id.hs1);
                                    hs1.setText(""+matches.get(0).homeScore);
                                    TextView as1 = (TextView) findViewById(R.id.as1);
                                    as1.setText(""+matches.get(0).awayScore);

                                    TextView home2 = (TextView) findViewById(R.id.home2);
                                    home2.setText(matches.get(1).home.toString());
                                    TextView away2 = (TextView) findViewById(R.id.away2);
                                    away2.setText(matches.get(1).away.toString());
                                    TextView hs2 = (TextView) findViewById(R.id.hs2);
                                    hs2.setText(""+matches.get(1).homeScore);
                                    TextView as2 = (TextView) findViewById(R.id.as2);
                                    as2.setText(""+matches.get(1).awayScore);

                                    TextView home3 = (TextView) findViewById(R.id.home3);
                                    home3.setText(matches.get(2).home.toString());
                                    TextView away3 = (TextView) findViewById(R.id.away3);
                                    away3.setText(matches.get(2).away.toString());
                                    TextView hs3 = (TextView) findViewById(R.id.hs3);
                                    hs3.setText(""+matches.get(2).homeScore);
                                    TextView as3 = (TextView) findViewById(R.id.as3);
                                    as3.setText(""+matches.get(2).awayScore);

                                    TextView home4 = (TextView) findViewById(R.id.home4);
                                    home4.setText(matches.get(3).home.toString());
                                    TextView away4 = (TextView) findViewById(R.id.away4);
                                    away4.setText(matches.get(3).away.toString());
                                    TextView hs4 = (TextView) findViewById(R.id.hs4);
                                    hs4.setText(""+matches.get(3).homeScore);
                                    TextView as4 = (TextView) findViewById(R.id.as4);
                                    as4.setText(""+matches.get(3).awayScore);

                                    TextView home5 = (TextView) findViewById(R.id.home5);
                                    home5.setText(matches.get(4).home.toString());
                                    TextView away5 = (TextView) findViewById(R.id.away5);
                                    away5.setText(matches.get(4).away.toString());
                                    TextView hs5 = (TextView) findViewById(R.id.hs5);
                                    hs5.setText(""+matches.get(4).homeScore);
                                    TextView as5 = (TextView) findViewById(R.id.as5);
                                    as5.setText(""+matches.get(4).awayScore);



                                    Log.d(TAG, "Displaying data" + matches.toString());

                                }
                            },
                            new Response.ErrorListener()
                            {
                                @Override
                                public void onErrorResponse(VolleyError error)
                                {
                                    Log.d(TAG, "Error" + error.toString());
                                }
                            });
                    queue2.add(strObjRequest);           // can have multiple in a queue, and can cancel
                }
                catch (Exception e1)
                {
                    Log.d(TAG, e1.toString());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView testy = (TextView) findViewById(R.id.testy);
                testy.setText("gaaaaa");
            }
        });

    }
    public String getCode(String n){
        for(Team t : clubs) {
            if(t.name.equals(n)) {
                return t.code;
            }
        }
        return null;
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


}




