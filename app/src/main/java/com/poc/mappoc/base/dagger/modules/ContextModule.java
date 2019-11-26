package com.poc.mappoc.base.dagger.modules;


import android.content.Context;

import com.poc.mappoc.base.ApplicationContext;
import com.poc.mappoc.base.BaseApplication;
import com.poc.mappoc.scopeannotations.ApplicationScoped;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private final Context context;
    public ContextModule(BaseApplication baseApplication){
        this.context = baseApplication.getApplicationContext();
    }

    @Provides
    @ApplicationScoped
    @ApplicationContext
    public Context provideApplicationContext(){
        return this.context;
    }

}
