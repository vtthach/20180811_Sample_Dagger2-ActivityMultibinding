package com.frogermcs.recipes.dagger_activities_multibinding.application.activity;

import com.frogermcs.recipes.dagger_activities_multibinding.feature.main_activity.MainActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.feature.main_activity.MainPerViewComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.feature.second_activity.SecondActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.feature.second_activity.SecondPerViewComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by froger_mcs on 14/09/16.
 */

@Module(
        subcomponents = {
                MainPerViewComponent.class,
                SecondPerViewComponent.class
        })
public abstract class PerViewBindingModule {

    @Binds
    @IntoMap
    @PerViewKey(MainActivity.class)
    public abstract PerViewComponentBuilder mainActivityComponentBuilder(MainPerViewComponent.Builder impl);

    @Binds
    @IntoMap
    @PerViewKey(SecondActivity.class)
    public abstract PerViewComponentBuilder secondActivityComponentBuilder(SecondPerViewComponent.Builder impl);
}