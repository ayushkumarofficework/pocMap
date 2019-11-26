package com.poc.mappoc.base.dagger.component;


import com.poc.mappoc.base.BaseApplication;
import com.poc.mappoc.base.dagger.modules.ApplicationModule;
import com.poc.mappoc.base.dagger.modules.ContextModule;

import dagger.Component;

@Component(modules = {ApplicationModule.class})
public interface BaseApplicationComponent {
    void inject(BaseApplication baseApplication);
}
