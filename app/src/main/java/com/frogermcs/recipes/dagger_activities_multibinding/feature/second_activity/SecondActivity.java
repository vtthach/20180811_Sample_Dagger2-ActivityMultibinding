package com.frogermcs.recipes.dagger_activities_multibinding.feature.second_activity;

import android.os.Bundle;

import com.frogermcs.recipes.dagger_activities_multibinding.BaseActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.R;
import com.frogermcs.recipes.dagger_activities_multibinding.application.activity.HasPerViewSubComponentBuilders;

import javax.inject.Inject;

/**
 * Created by froger_mcs on 16/10/2016.
 */

public class SecondActivity extends BaseActivity {

    @Inject
    SecondActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void injectMembers(HasPerViewSubComponentBuilders hasActivitySubComponentBuilders) {
        ((SecondPerViewComponent.Builder) hasActivitySubComponentBuilders.getActivityComponentBuilder(SecondActivity.class))
                .activityModule(new SecondPerViewComponent.SecondActivityModule(this))
                .build()
                .injectMembers(this);
    }

}
