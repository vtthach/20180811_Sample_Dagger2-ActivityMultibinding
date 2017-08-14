package com.frogermcs.recipes.dagger_activities_multibinding.application.activity;

/**
 * Created by froger_mcs on 14/09/16.
 */

public interface PerViewComponentBuilder<M extends PerViewModule, C extends PerViewComponent> {
    PerViewComponentBuilder<M, C> viewModule(M viewModule);
    C build();
}