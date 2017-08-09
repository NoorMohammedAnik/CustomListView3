package com.noor.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryList[]={"Bangladesh","America","Australia","China","India","New Zealand","Portugle"};
    int flags[]={R.drawable.bd,R.drawable.america,R.drawable.australia,R.drawable.china,R.drawable.india,R.drawable.new_zealand,R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList=(ListView)findViewById(R.id.listview);

        CustomListAdapter listAdapter=new CustomListAdapter(getApplicationContext(),countryList,flags);
        customList.setAdapter(listAdapter);



        

    }
}
