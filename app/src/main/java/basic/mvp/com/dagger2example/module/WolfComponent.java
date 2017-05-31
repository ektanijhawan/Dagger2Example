package basic.mvp.com.dagger2example.module;

import javax.inject.Singleton;

import basic.mvp.com.dagger2example.model.Wolf;
import dagger.Component;

/**
 * Created by Ekta on 31-05-2017.
 */




    @Singleton
    @Component(modules = {WolfModule.class})
    public interface WolfComponent {

        Wolf provideWolf();


}
