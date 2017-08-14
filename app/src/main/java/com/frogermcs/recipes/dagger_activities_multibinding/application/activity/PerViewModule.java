package com.frogermcs.recipes.dagger_activities_multibinding.application.activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by froger_mcs on 09/08/16.
 */

@Module
public abstract class PerViewModule<T> {
    protected final T view;

    public PerViewModule(T view) {
        this.view = view;
    }

    @Provides
    @PerViewScope
    public T provideView() {
        return view;
    }
}
