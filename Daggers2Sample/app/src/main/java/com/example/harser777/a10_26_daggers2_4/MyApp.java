package com.example.harser777.a10_26_daggers2_4;

import android.app.Application;

import com.example.harser777.a10_26_daggers2_4.Dependencies.Computer;
import com.example.harser777.a10_26_daggers2_4.Interface.DaggerMyComponent;
import com.example.harser777.a10_26_daggers2_4.Interface.MyComponent;
import com.example.harser777.a10_26_daggers2_4.Modules.ComputerModule;

/**
 * Created by harser777 on 10/27/2016.
 */
public class MyApp extends Application {

    private MyComponent myComponent;
    Computer computer;

    private static MyApp ourInstance = new MyApp();

    public static MyApp getInstance() {
        return ourInstance;
    }

    private MyApp() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //DaggerMyComponent is created by framework after build we use:
        myComponent= DaggerMyComponent.builder().computerModule(new ComputerModule()).build();
  
    }

    public MyComponent getComponent(){
        return myComponent;
    }
}
