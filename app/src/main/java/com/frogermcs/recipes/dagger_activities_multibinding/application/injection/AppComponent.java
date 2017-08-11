package com.frogermcs.recipes.dagger_activities_multibinding.application.injection;

import com.frogermcs.recipes.dagger_activities_multibinding.application.MyApplication;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewBindingModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by froger_mcs on 14/09/16.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                PerViewBindingModule.class
        }
)
public interface AppComponent {
    MyApplication inject(MyApplication application);
}