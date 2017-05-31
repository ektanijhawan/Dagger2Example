package basic.mvp.com.dagger2example.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import basic.mvp.com.dagger2example.R;
import basic.mvp.com.dagger2example.module.DaggerWolfComponent;
import basic.mvp.com.dagger2example.module.WolfComponent;
import basic.mvp.com.dagger2example.module.WolfModule;
import dagger.android.DaggerActivity_MembersInjector;
import dagger.android.DaggerFragment_MembersInjector;

public class MainActivity extends AppCompatActivity {


    Wolf wolf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WolfComponent component= DaggerWolfComponent.builder().wolfModule(new WolfModule()).build();
        wolf=component.provideWolf();

        Toast.makeText(this,String.valueOf(wolf.wolfLegs()),Toast.LENGTH_SHORT).show();

    }
}
