package com.frogermcs.recipes.dagger_activities_multibinding.feature.main_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.Utils;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.PerViewScope;

import javax.inject.Inject;

/**
 * Created by froger_mcs on 19/09/16.
 */

@PerViewScope
public class MainActivityPresenter {
    private final MainActivity activity;
    private final Utils utils;

    @Inject
    public MainActivityPresenter(MainActivity activity, Utils utils) {
        this.activity = activity;
        this.utils = utils;
    }

    public void init() {
        activity.updateText(utils.getHardcodedText());
    }
}
