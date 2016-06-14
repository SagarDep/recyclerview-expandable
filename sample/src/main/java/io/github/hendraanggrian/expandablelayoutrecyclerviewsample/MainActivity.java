package io.github.hendraanggrian.expandablelayoutrecyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import io.github.hendraanggrian.expandablelayoutrecyclerview.ExpandableLayoutRecyclerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestAdapter adapter = new TestAdapter(new LinearLayoutManager(this));

        final ExpandableLayoutRecyclerView expandableLayoutRecyclerView = (ExpandableLayoutRecyclerView) findViewById(R.id.recyclerView);
        expandableLayoutRecyclerView.setAdapter(adapter);
        expandableLayoutRecyclerView.setLayoutManager(adapter.getLayoutManager());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}