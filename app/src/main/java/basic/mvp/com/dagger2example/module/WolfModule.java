package basic.mvp.com.dagger2example.module;

import javax.inject.Singleton;

import basic.mvp.com.dagger2example.model.Wolf;
import basic.mvp.com.dagger2example.model.Animal;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Ekta on 31-05-2017.
 */
@Module
public class WolfModule {

    @Singleton @Provides
    Animal provideAnimal(){
        return new Animal();
    }

    @Singleton @Provides
    Wolf provideWolf()
    {
        return new Wolf(new Animal());
    }

}
