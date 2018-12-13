package com.example.joanc.insaide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;



public class Fragment_menu_bar extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_menu_bar, container, false);
        ImageButton homeButton = view.findViewById(R.id.homebutton);
        ImageButton searchButton = view.findViewById(R.id.searchbutton);
        ImageButton addButton = view.findViewById(R.id.addbutton);

        homeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Accueil.class);
                startActivity(intent);
            }
        });

        //searchButton.setOnClickListener(new View.OnClickListener() {

        //TODO
            /*
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Accueil.class);
                startActivity(intent);
            }

        });*/

        addButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PropTutoratPonctuel.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
