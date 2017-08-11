package com.frogermcs.recipes.dagger_activities_multibinding.application.activity;

import android.app.Activity;

import dagger.MapKey;

/**
 * Created by froger_mcs on 16/10/2016.
 */

@MapKey
public @interface PerViewKey {
    Class<? extends Activity> value();
}
