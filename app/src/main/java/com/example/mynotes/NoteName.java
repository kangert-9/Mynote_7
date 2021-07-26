package com.example.mynotes;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class NoteName extends Fragment {

        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            return inflater.inflate(R.layout.fragment_blank, container, false);
        }

        @Override
        public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState){
            super.onViewCreated(view, savedInstanceState);
            initList(view);
        }

        private void initList (View view){
            LinearLayout layoutView = (LinearLayout) view;
            String[] notes = getResources().getStringArray(R.array.note_names);

            for (int i = 0; i < notes.length; i++) {
                String note = notes[i];
                TextView tv = new TextView(getContext());
                tv.setText(note);
                tv.setTextSize(45);
                layoutView.addView(tv);
                final int fi = i;
                tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showNote(fi);
                    }
                });

            }
        }
    private void showNote(int index) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), NewActivity.class);
        intent.putExtra(Note.ARG_INDEX, index);
        startActivity(intent);
    }

}