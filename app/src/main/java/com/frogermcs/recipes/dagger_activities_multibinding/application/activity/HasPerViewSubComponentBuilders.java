package com.frogermcs.recipes.dagger_activities_multibinding.application.activity;

import android.app.Activity;

/**
 * Created by froger_mcs on 18/09/16.
 */
public interface HasPerViewSubComponentBuilders {
    PerViewComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass);
}