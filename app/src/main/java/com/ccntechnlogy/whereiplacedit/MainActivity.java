package com.ccntechnlogy.whereiplacedit;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView list;
    String[] web = {
            "call wife at 5pm when pass by library",
            "Twitter",
            "call daddy at 5pm when pass by library",
            "message wife at 5pm when pass by library",
            "call wife at 5pm when pass by library",
            "sharon - 778 8895507",
            "call wife at 5pm when pass by library, call wife at 5pm when pass by library, call wife at 5pm when pass by library",
            "call wife at 5pm when pass by library",
            "call wife at 5pm when pass by library, call wife at 5pm when pass by library",
            "Twitter",
            "call daddy at 5pm when pass by library",
            "message wife at 5pm when pass by library",
            "call wife at 5pm when pass by library",
            "sharon - 778 8895507",
            "call wife at 5pm when pass by library",
            "call wife at 5pm when pass by library,call wife at 5pm when pass by library"
    } ;
    Integer[] imageId = {
            R.drawable.camera,
            R.drawable.speaker,
            R.drawable.note,
            R.drawable.clock,
            R.drawable.camera,
            R.drawable.speaker,
            R.drawable.note,
            R.drawable.clock,
            R.drawable.camera,
            R.drawable.speaker,
            R.drawable.note,
            R.drawable.clock,
            R.drawable.camera,
            R.drawable.speaker,
            R.drawable.note,
            R.drawable.clock
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_main);


        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.listViewMain);

        list.setAdapter(adapter);

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
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
