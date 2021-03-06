package com.example.mynotes;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Note extends Fragment {

    static final String ARG_INDEX = "index";
    private int index;

    public static Note newInstance(int index) {
        Note f = new Note();

        Bundle args = new Bundle();
        args.putInt(ARG_INDEX, index);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
        TextView textView = view.findViewById(R.id.note);
        String[] text = getResources().getStringArray(R.array.notes);
        textView.setText(text[index-1]);
        textView.setTextSize(45);
        return view;
    }
}