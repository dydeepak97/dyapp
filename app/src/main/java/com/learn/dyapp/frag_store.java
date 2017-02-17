package com.learn.dyapp;

import android.app.Activity;
//import android.app.Fragment;
//import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class frag_store extends Activity {

            Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bsub,bmul,bdiv,bdeci,beq;

            TextView textViewInput,textVIewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_store);



        b0=(Button) findViewById(R.id.num0);
        b1=(Button) findViewById(R.id.num1);
        b2=(Button) findViewById(R.id.num2);
        b3=(Button) findViewById(R.id.num3);
        b4=(Button) findViewById(R.id.num4);
        b5=(Button) findViewById(R.id.num5);
        b6=(Button) findViewById(R.id.num6);
        b7=(Button) findViewById(R.id.num7);
        b8=(Button) findViewById(R.id.num8);
        b9=(Button) findViewById(R.id.num9);
        bplus=(Button) findViewById(R.id.op_plus);
        bsub=(Button) findViewById(R.id.op_sub);
        bmul=(Button) findViewById(R.id.op_mul);
        bdiv=(Button) findViewById(R.id.op_div);
        bdeci=(Button) findViewById(R.id.num_deci);
        beq=(Button) findViewById(R.id.equal);


        textViewInput=(TextView) findViewById(R.id.textViewInput);
        textVIewResult=(TextView) findViewById(R.id.textViewResult);

        




        // Create new fragment and transaction
     //   Fragment newFragment = new calc_frag();
     //   FragmentTransaction transaction = getFragmentManager().beginTransaction();
        // getSupportFragmentManager - for app compat
        // getFragmentManager - normal activity

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack if needed
     //   transaction.replace(R.id.fragment_container, newFragment);
     //   transaction.addToBackStack(null);

        // Commit the transaction
     //   transaction.commit();
    }

}
