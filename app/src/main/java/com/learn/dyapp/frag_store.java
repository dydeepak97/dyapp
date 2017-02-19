package com.learn.dyapp;

import android.app.Activity;
//import android.app.Fragment;
//import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class frag_store extends Activity {

            Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bsub,bmul,bdiv,bdel,beq;

            TextView textViewInput,textVIewResult;

            String s="",s1="",s2="",resultString="";

            int i=0,i1=0,c=-1;
            int result=0;

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
        bdel=(Button) findViewById(R.id.del);
        beq=(Button) findViewById(R.id.equal);


        textViewInput=(TextView) findViewById(R.id.textViewInput);
        textVIewResult=(TextView) findViewById(R.id.textViewResult);



        b0.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "0");
                s="";

            }
        });

        b1.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "1");
                s="";

            }
        });

        b2.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "2");
                s="";

            }
        });

        b3.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "3");
                s="";

            }
        });

        b4.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "4");
                s="";

            }
        });

        b5.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "5");
                s="";

            }
        });

        b6.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "6");
                s="";

            }
        });

        b7.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "7");
                s="";

            }
        });

        b8.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "8");
                s="";

            }
        });

        b9.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                s=(String) textVIewResult.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") )
                {
                    textVIewResult.setText("");
                    s="";
                }
                textVIewResult.setText(s + "9");
                s="";

            }
        });



        bplus.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                String temp=(String) textVIewResult.getText();
                if(temp.isEmpty()){
                    s1="0";
                }
                else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/")){
                    s1=temp;
                }
                c=0;

                resultString="";
                textVIewResult.setText("+");
                textViewInput.setText(   s1+ "+");
            }
        });

        bsub.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                String temp=(String) textVIewResult.getText();
                if(temp.isEmpty()){
                    s1="0";
                }
                else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/")){
                    s1=temp;
                }
                c=1;
                resultString="";

                textVIewResult.setText("-");
                textViewInput.setText( s1+ "-");
            }
        });

        bmul.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                String temp=(String) textVIewResult.getText();
                if(temp.isEmpty()){
                    s1="0";
                }
                else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/")){
                    s1=temp;
                }
                c=3;
                resultString="";

                textVIewResult.setText("*");
                textViewInput.setText( s1+ "*");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                String temp=(String) textVIewResult.getText();
                if(temp.isEmpty()){
                    s1="0";
                }
                else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/")){
                    s1=temp;
                }
                c=4;
                resultString="";

                textVIewResult.setText("/");
                textViewInput.setText(s1 + "/");
            }
        });

        beq.setOnClickListener(new View.OnClickListener()   {

            public void onClick(View v ){
                String temp=(String) textVIewResult.getText();
                if(temp.isEmpty()){
                    s1="0";
                }
                else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/")){
                    s1=temp;
                }
                c=4;
                resultString="";

                textVIewResult.setText("/");
                textViewInput.setText( s1 + "/");
            }
        });



/*
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
 */

    }


}
