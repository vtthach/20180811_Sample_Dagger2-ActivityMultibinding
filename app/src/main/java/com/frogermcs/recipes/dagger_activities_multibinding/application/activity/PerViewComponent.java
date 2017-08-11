package com.frogermcs.recipes.dagger_activities_multibinding.application.activity;

import android.app.Activity;

import dagger.MembersInjector;

/**
 * Created by froger_mcs on 16/10/2016.
 */

public interface PerViewComponent<A extends Activity> extends MembersInjector<A> {
}
