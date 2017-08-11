package com.frogermcs.recipes.dagger_activities_multibinding.application.activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by froger_mcs on 09/08/16.
 */

@Module
public abstract class PerViewModule<T> {
    protected final T activity;

    public PerViewModule(T activity) {
        this.activity = activity;
    }

    @Provides
    @PerViewScope
    public T provideActivity() {
        return activity;
    }
}
