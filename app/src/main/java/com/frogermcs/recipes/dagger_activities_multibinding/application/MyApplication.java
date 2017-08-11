package com.frogermcs.recipes.dagger_activities_multibinding.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewComponentBuilder;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.HasPerViewSubComponentBuilders;
import com.frogermcs.recipes.dagger_activities_multibinding.application.injection.AppComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.application.injection.DaggerAppComponent;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by froger_mcs on 14/09/16.
 */

public class MyApplication extends Application implements HasPerViewSubComponentBuilders {

    @Inject
    Map<Class<? extends Activity>, Provider<PerViewComponentBuilder>> activityComponentBuilders;

    private AppComponent appComponent;

    public static HasPerViewSubComponentBuilders get(Context context) {
        return ((HasPerViewSubComponentBuilders) context.getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
        appComponent.inject(this);
    }

    @Override
    public PerViewComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass) {
        return activityComponentBuilders.get(activityClass).get();
    }
}