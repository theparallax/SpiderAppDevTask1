package com.example.rogith.spiderappdevtask1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

//import java.util.ArrayList;
//import java.util.List;


public class MainActivity extends AppCompatActivity {

    int CheckBoxInput =0;           //This is to check if any one of the checkboxes are clicked
    Context mContext;

    TextView NameTextView;
    TextView PhoneNumberView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Spinner DepartmentSpinner;
        setContentView(R.layout.activity_main);
        DepartmentSpinner = (Spinner) findViewById(R.id.DeptSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Department_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        DepartmentSpinner.setAdapter(adapter);
        NameTextView = (TextView) findViewById(R.id.NameTextID);
        PhoneNumberView = (TextView) findViewById(R.id.NumberTextID);

    }
    public void onBtnClick(View v){
        if(CheckBoxInput==0){   Toast.makeText(mContext,"Choose atleast one profile",Toast.LENGTH_SHORT).show();
        }
        else {
            if(NameTextView.getText()==""&&PhoneNumberView.getText()!=""){
            Toast.makeText(mContext,"Name not entered",Toast.LENGTH_SHORT).show();

        }
        else if(NameTextView.getText()!=""&&PhoneNumberView.getText()==""){
            Toast.makeText(mContext,"Phone Number not entered",Toast.LENGTH_SHORT).show();
        }
        else if(NameTextView.getText()==""&&PhoneNumberView.getText()==""){
            Toast.makeText(mContext,"Name and Phone Number not entered",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent newIntent = new Intent(MainActivity.this,DIsplayMessageActivity.class);
            newIntent.putExtra("Key",0);
            MainActivity.this.startActivity(newIntent);


        }
    }
    }

    public void onAlgoCheckBoxClick(View v){
        CheckBoxInput=1;

    }
    public void onTronixCheckBoxClick(View v){
        CheckBoxInput=1;

    }
    public void onWebDevCheckBoxClick(View v){
        CheckBoxInput=1;

    }
    public void onAppDevCheckBoxClick(View v){
        CheckBoxInput=1;

    }


}
