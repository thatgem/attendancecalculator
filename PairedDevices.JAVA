package com.example.nehaa.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class pairlist extends Activity {
    ListView lview;
    String[] pairs;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pairlist);
        lview=(ListView) findViewById(R.id.listview);
        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(lview.getSelectedItem()=="MotoG3")
                {
                    Toast.makeText(getBaseContext(), "MotoG3 is present..", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Bundle bnd= getIntent().getExtras();
        pairs=bnd.getStringArray("pairs");
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,pairs);
        lview.setAdapter(adapter);
    }
}
