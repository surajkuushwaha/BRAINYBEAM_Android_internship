package com.internship;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class CommonMethod {
    public CommonMethod(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
    public CommonMethod(View view, String message){
        Snackbar.make(view,message,Snackbar.LENGTH_SHORT).show();
    }
    public CommonMethod(Context context, Class<?> nextclass){
        Intent intent = new Intent(context,nextclass);
        context.startActivity(intent);
    }
}
