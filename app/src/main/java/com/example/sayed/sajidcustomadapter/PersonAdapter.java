package com.example.sayed.sajidcustomadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nurud on 2/18/2018.
 */

public class PersonAdapter extends ArrayAdapter<ContactPerson> {
    private Context context;
    private ArrayList<ContactPerson> perspns;
    public PersonAdapter(@NonNull Context context, ArrayList<ContactPerson> persons) {
        super(context, R.layout.row_layout, persons);
        this.context = context;
        this.perspns = persons;
    }


   /* public View getGetView(int position, View convestView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convestView =  inflater.inflate(R.layout.row_layout, parent, false);

        TextView nameTV = convestView.findViewById(R.id.myName);
        TextView phoneTV = convestView.findViewById(R.id.myPhone);
        ImageView imageTV = convestView.findViewById(R.id.myImage);

        nameTV.setText(perspns.get(position).getPersonName());
        phoneTV.setText(perspns.get(position).getPhoneNumber());
        //imageTV.setText(perspns.get(position).getPersonName());
        return convestView;
    }*/

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_layout, parent, false);

        TextView nameTv = convertView.findViewById(R.id.myName);
        TextView phoneTv = convertView.findViewById(R.id.myPhone);
        ImageView imageTV = convertView.findViewById(R.id.myImage);

        nameTv.setText(perspns.get(position).getPersonName());
        phoneTv.setText(perspns.get(position).getPhoneNumber());

        return convertView;
    }
}
