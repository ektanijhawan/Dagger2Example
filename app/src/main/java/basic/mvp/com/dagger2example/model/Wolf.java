package basic.mvp.com.dagger2example.model;

import javax.inject.Inject;

import basic.mvp.com.dagger2example.model.Animal;

/**
 * Created by Ekta on 31-05-2017.
 */

public class Wolf {
    Animal animal;

    @Inject
    public Wolf(Animal animal) {
        this.animal = animal;
    }

    public int wolfLegs() {
       return animal.noOfLegs();
    }
}
