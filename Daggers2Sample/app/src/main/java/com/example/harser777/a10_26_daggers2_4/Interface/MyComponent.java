package com.example.harser777.a10_26_daggers2_4.Interface;

import com.example.harser777.a10_26_daggers2_4.Dependencies.Computer;
import com.example.harser777.a10_26_daggers2_4.Modules.ComputerModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by harser777 on 10/27/2016.
 */

//THE INTERFACE, tells framework to create modules for classes defined
    //and provides a getter to build the object(computer)

@Singleton
@Component(modules={ComputerModule.class})
public interface MyComponent {

    Computer provideComputer();
}
