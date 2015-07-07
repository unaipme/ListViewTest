package com.unaipme.listviewtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<Match> list = new ArrayList<>();
        list.add(new Match("Meridiano 0", "Rockus", 0, 4));
        list.add(new Match("Meridiano 0", "Samber", 1, 3));
        list.add(new Match("Meridiano 0", "Perla", 0, 8));
        list.add(new Match("Meridiano 0", "Arkaitza", 1, 3));

        listView.setAdapter(new MatchListAdapter(this, list));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
