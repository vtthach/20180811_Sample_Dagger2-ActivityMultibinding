package com.frogermcs.recipes.dagger_activities_multibinding.application.injection;

import com.frogermcs.recipes.dagger_activities_multibinding.Utils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by froger_mcs on 14/09/16.
 */

@Module
public class AppModule {

    public AppModule() {
    }

    @Provides
    @Singleton
    public Utils provideUtils() {
        return new Utils();
    }

}