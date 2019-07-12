package sg.edu.rp.c346.alcadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<arrayList> list;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        list = new ArrayList<>();
        list.add(new arrayList("MSA","1/7/2019"));
        list.add(new arrayList("Go for haircut","22/09/2019"));

        adapter = new CustomAdapter(this, R.layout.row,list);
        listView.setAdapter(adapter);



    }
}
