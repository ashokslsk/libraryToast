package com.ashokslsk.helloworld;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ashok.kumar on 13/07/16.
 */
public class TestToast {

    public static String NAME = "Thank you for trying the library" ;
    public Context mContext;

    public TestToast(Context mContext, String name) {
        this.mContext = mContext;
        Toast.makeText(mContext,name +" ->"+NAME,Toast.LENGTH_LONG).show();
    }
}
