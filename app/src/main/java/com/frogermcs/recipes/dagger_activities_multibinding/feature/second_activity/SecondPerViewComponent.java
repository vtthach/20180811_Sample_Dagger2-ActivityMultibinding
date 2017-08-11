package com.frogermcs.recipes.dagger_activities_multibinding.feature.second_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewComponentBuilder;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewModule;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewScope;

import dagger.Module;
import dagger.Subcomponent;

/**
 * Created by froger_mcs on 16/10/2016.
 */

@PerViewScope
@Subcomponent(
        modules = SecondPerViewComponent.SecondActivityModule.class
)
public interface SecondPerViewComponent extends PerViewComponent<SecondActivity> {

    @Subcomponent.Builder
    interface Builder extends PerViewComponentBuilder<SecondActivityModule, SecondPerViewComponent> {
    }

    @Module
    class SecondActivityModule extends PerViewModule<SecondActivity> {
        SecondActivityModule(SecondActivity activity) {
            super(activity);
        }
    }
}