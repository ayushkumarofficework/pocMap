package com.poc.mappoc.base;

import android.app.Application;

import com.poc.mappoc.base.dagger.component.BaseApplicationComponent;
import com.poc.mappoc.base.dagger.component.DaggerBaseApplicationComponent;
import com.poc.mappoc.base.dagger.modules.ContextModule;

public class BaseApplication extends Application {

    private BaseApplicationComponent daggerBaseApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpApplication();
    }

    //this produces singleton application context
    private void setUpApplication(){
        daggerBaseApplicationComponent = DaggerBaseApplicationComponent.builder().contextModule(new ContextModule(this)).build();
    }
}
