package com.learn.dyapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class frag_store extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_store);

        // Create new fragment and transaction
        Fragment newFragment = new calc_frag();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        // getSupportFragmentManager - for app compat
        // getFragmentManager - normal activity

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack if needed
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }

}
