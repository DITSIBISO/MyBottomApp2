package com.example.android.mybottomapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/24.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
        Context context;
        List<Contact> contactList;

public MyAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;

}
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.screen_view,parent,false);
        MyViewHolder myViewHolder =new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.name.setText(contact.getName());
        // holder.surname.setText(contact.getSurname());
        // holder.email.setText(contact.getEmail());



    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        //surname,email;

        public MyViewHolder(View itemView) {
            super(itemView);


            name = (TextView)itemView.findViewById(R.id.scn1Text);
            // surname =(TextView)itemView.findViewById(R.id.txtSurname);
            // email =(TextView)itemView.findViewById(R.id.txtEmail);
        }
    }
}
