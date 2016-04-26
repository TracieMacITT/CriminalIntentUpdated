package com.mclaughlin.tracie.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Tracie on 4/24/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();

    }

}
