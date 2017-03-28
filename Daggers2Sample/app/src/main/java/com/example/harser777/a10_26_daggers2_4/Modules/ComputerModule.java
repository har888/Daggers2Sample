package com.example.harser777.a10_26_daggers2_4.Modules;

import com.example.harser777.a10_26_daggers2_4.Dependencies.Computer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by harser777 on 10/27/2016.
 */


@Module
public class ComputerModule {

    @Provides
    @Singleton
    Computer provideComputer(){
        return new Computer();
    }


}
