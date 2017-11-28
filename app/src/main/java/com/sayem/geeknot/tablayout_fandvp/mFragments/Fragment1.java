package com.sayem.geeknot.tablayout_fandvp.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sayem.geeknot.tablayout_fandvp.R;

public class Fragment1 extends Fragment {
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.activity_fragment1,container,false);
        return rootView;
    }

    @Override
    public String toString() {
        String title="Fragment:1";
        return title;
    }
}
