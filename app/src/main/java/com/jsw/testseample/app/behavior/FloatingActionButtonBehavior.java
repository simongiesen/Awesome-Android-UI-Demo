package com.jsw.testseample.app.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.util.AttributeSet;
import android.view.View;
import com.getbase.floatingactionbutton.FloatingActionButton;

import java.util.jar.Attributes;

/**
 * Created by user on 2016/12/16.
 */
public class FloatingActionButtonBehavior extends CoordinatorLayout.Behavior<com.getbase.floatingactionbutton.FloatingActionButton> {

    public FloatingActionButtonBehavior(Context context, AttributeSet attrs) {

    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        return dependency instanceof Snackbar.SnackbarLayout;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        float translationY = Math.min(0, dependency.getTranslationY() - dependency.getHeight());
        child.setTranslationY(translationY);
        return true;
    }
}
