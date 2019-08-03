package com.example.user.musicmaneger.helper;

import java.util.HashMap;


public class Constants {

    public static HashMap getHmapType(){
        // Creating a HashMap
        HashMap<Integer, String> musicalInstruments = new HashMap<Integer, String>();
        musicalInstruments.put(1,"Drumbs");
        musicalInstruments.put(2,"Guitar");
        musicalInstruments.put(3,"Piano");
        return musicalInstruments;
        //return (HashMap) musicalInstruments.values();
    }

}
