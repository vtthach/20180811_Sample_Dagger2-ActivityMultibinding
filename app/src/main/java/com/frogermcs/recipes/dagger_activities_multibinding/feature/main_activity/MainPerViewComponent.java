package com.frogermcs.recipes.dagger_activities_multibinding.feature.main_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewComponentBuilder;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewModule;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewScope;

import dagger.Module;
import dagger.Subcomponent;

@PerViewScope
@Subcomponent(
        modules = MainPerViewComponent.MainActivityModule.class
)
public interface MainPerViewComponent extends PerViewComponent<MainActivity> {

    @Subcomponent.Builder
    interface Builder extends PerViewComponentBuilder<MainActivityModule, MainPerViewComponent> {
    }

    @Module
    class MainActivityModule extends PerViewModule<MainActivity> {
        MainActivityModule(MainActivity activity) {
            super(activity);
        }
    }
}
