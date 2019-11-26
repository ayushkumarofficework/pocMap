package com.poc.mappoc.base.dagger.modules;


import android.content.Context;

import dagger.Module;

@Module(includes = {ContextModule.class,NetworkModule.class})
public class ApplicationModule {
}
