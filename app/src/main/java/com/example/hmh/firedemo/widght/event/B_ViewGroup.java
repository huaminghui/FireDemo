package com.example.hmh.firedemo.widght.event;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.example.hmh.firedemo.utils.Utils;

/**
 * Created by hmh on 2017/3/27.
 * 事件分发
 */

public class B_ViewGroup extends LinearLayout{
    public B_ViewGroup(Context context) {
        super(context);
    }

    public B_ViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public B_ViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("fuck",Utils.getActionName(ev) + ", ViewGroupB.dispatch");
        boolean result = super.dispatchTouchEvent(ev);
        Log.e("fuck",Utils.getActionName(ev) + ", ViewGroupB.dispatch = " + result);
        return result;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean result = false;
        Log.e("fuck",Utils.getActionName(ev) + ", ViewGroupB.intercept = " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = false;
        Log.e("fuck",Utils.getActionName(event) + ", ViewGroupB.touch = " + result);
        return result;
    }
}