package com.frogermcs.recipes.dagger_activities_multibinding;

import android.app.Activity;

import com.frogermcs.recipes.dagger_activities_multibinding.application.MyApplication;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewComponentBuilder;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Provider;

/**
 * Created by Miroslaw Stanek on 24.09.15.
 */
public class ApplicationMock extends MyApplication {

    public void putActivityComponentBuilder(final PerViewComponentBuilder builder, Class<? extends Activity> cls) {
        Map<Class<? extends Activity>, Provider<PerViewComponentBuilder>> activityComponentBuilders = new HashMap<>(this.activityComponentBuilders);
        activityComponentBuilders.put(cls, new Provider<PerViewComponentBuilder>() {
            @Override
            public PerViewComponentBuilder get() {
                return builder;
            }
        });
        this.activityComponentBuilders = activityComponentBuilders;
    }
}