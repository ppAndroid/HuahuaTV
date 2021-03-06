package com.pplab.songhua2.huahuatv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.pplab.songhua2.huahuatv.dagger.Cooker;
import com.pplab.songhua2.huahuatv.dagger.DaggerSimpleComponent;
import com.pplab.songhua2.huahuatv.dagger.SimpleComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //CoffeeMachine coffeeMachine;
    @Inject
    Cooker cooker;
    private SimpleComponent simpleComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        //tv.setText(stringFromJNI());

//        Cooker cooker = new Cooker("James", "Espresso");
//        coffeeMachine = new CoffeeMachine(cooker);
        DaggerSimpleComponent.builder().build().Inject(this);
        tv.setText(cooker.makeCoffee());
        //   Intent i = new Intent();
        //   i.setClassName("com.pplab.songhua2.huahuatv","com.pplab.songhua2.huahuatv.Main2Activity");
        //   startActivity(i);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
