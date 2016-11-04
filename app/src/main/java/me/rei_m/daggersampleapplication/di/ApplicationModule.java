package me.rei_m.daggersampleapplication.di;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(@NonNull Application application) {
        this.context = application.getApplicationContext();
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }
}
