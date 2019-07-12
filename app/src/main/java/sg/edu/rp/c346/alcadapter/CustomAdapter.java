package sg.edu.rp.c346.alcadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int id;
    ArrayList<arrayList> listVersion;

    public  CustomAdapter(Context context, int resource, ArrayList<arrayList> object) {

        super(context, resource, object);

        parent_context = context;
        id = resource;
        listVersion = object;
    }

    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(id,parent,false);
        TextView tv1 = rowView.findViewById(R.id.textView);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        arrayList currentVersion = listVersion.get(position);

        tv1.setText(currentVersion.getMsa());
        tvDate.setText(currentVersion.getDate());

        return rowView;

    }


}
