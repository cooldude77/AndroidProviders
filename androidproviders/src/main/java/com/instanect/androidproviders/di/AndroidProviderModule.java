package com.instanect.androidproviders.di;

import com.instanect.androidproviders.BundleProvider;
import com.instanect.androidproviders.HashMapProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 12/19/2017.
 */

@Module
public class AndroidProviderModule {

    @Singleton
    @Provides
    HashMapProvider provideHashMapProvider() {
        return new HashMapProvider();
    }

    @Singleton
    @Provides
    BundleProvider provideBundleProvider() {
        return new BundleProvider();
    }
}
