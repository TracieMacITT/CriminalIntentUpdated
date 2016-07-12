package com.mclaughlin.tracie.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Tracie on 4/23/2016.
 */


public class CrimeLab {
    private ArrayList <Crime> mCrimes;

    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        //Generates 100 random crimes
//        for (int i = 0; i < 100; i++){
//            Crime c = new Crime();
//            c.setTitle("Crime #" +i);
//            c.setSolved(i % 2 == 0); // every other one
//            mCrimes.add(c);
//        }
        // NO LONGER NECESSARY REFER TO addCrime method
    }

    public static CrimeLab get(Context c){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    public ArrayList<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime c: mCrimes){
            if (c.getId().equals(id))
                return c;
        }
        return  null;
    }
}
