package com.frogermcs.recipes.dagger_activities_multibinding.feature.second_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewScope;

import javax.inject.Inject;

/**
 * Created by froger_mcs on 16/10/2016.
 */

@PerViewScope
public class SecondActivityPresenter {
    private SecondActivity activity;

    @Inject
    public SecondActivityPresenter(SecondActivity activity) {
        this.activity = activity;
    }
}
