package com.unaipme.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MatchListAdapter extends BaseAdapter {
    private ArrayList<Match> list;
    private Context context;

    public MatchListAdapter(Context context, ArrayList<Match> list) {
        super();
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.match_layout, parent, false);
        }

        TextView homeTeam = (TextView) rowView.findViewById(R.id.homeTeamNameView);
        TextView homeGoals = (TextView) rowView.findViewById(R.id.homeTeamGoalsView);
        TextView awayTeam = (TextView) rowView.findViewById(R.id.awayTeamNameView);
        TextView awayGoals = (TextView) rowView.findViewById(R.id.awayTeamGoalsView);

        Match m = list.get(position);
        homeTeam.setText(m.getHomeTeam());
        awayTeam.setText(m.getAwayTeam());
        homeGoals.setText(String.valueOf(m.getHomeGoals()));
        awayGoals.setText(String.valueOf(m.getAwayGoals()));

        return rowView;
    }
}
