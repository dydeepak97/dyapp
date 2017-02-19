package com.learn.dyapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.view.Menu;

public class MainActivityList extends Activity {

    Button but_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        //Storing
        String[] mobileArray= getResources().getStringArray(R.array.ABC);

        //Binding
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_item,mobileArray);

        //Displaying








}
    //when  button clicked
    public void sendf(View v){


        Intent i= new Intent(getApplicationContext(),frag_store.class);
        startActivity(i);

    }



}
