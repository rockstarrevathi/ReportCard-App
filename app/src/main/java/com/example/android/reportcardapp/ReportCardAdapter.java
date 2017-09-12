package com.example.android.reportcardapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {
    Context context;
    int id;
    ReportCard listDetails[] = null;

    public ReportCardAdapter(Context context, int id, ReportCard[] lists ) {
        super(context, id, lists);
        this.id = id;
        this.context = context;
        this.listDetails = lists;
    }

    static class ReportCardDetails
    {
        ImageView subIcon;
        TextView subName;
        TextView subGrade;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list = convertView;
        ReportCardDetails reportCardBox = null;

        if(list == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            list = inflater.inflate(id, parent, false);

            reportCardBox = new ReportCardDetails();
            reportCardBox.subIcon = (ImageView)list.findViewById(R.id.subimage);
            reportCardBox.subName = (TextView)list.findViewById(R.id.subname);
            reportCardBox.subGrade = (TextView)list.findViewById(R.id.subgrade);

            list.setTag(reportCardBox);
        }
        else
        {
            reportCardBox = (ReportCardDetails)list.getTag();
        }

        ReportCard Card = listDetails[position];

        reportCardBox.subName.setText(Card.getSubjectName());
        reportCardBox.subIcon.setImageResource(Card.getSubjectIcon());
        reportCardBox.subGrade.setText(Card.getGrade());

        return list;
    }


}
