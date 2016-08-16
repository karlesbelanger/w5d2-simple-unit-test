package ca.kgb.simpleunittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Log.d(TAG, "sumItems: " + CalculatorHelper.sumItems(4,-5));
//        Log.d(TAG, "powerItems: " + CalculatorHelper.powerItems(-3, 4));
//        Log.d(TAG, "absDifferenceItems: " + CalculatorHelper.absDifferenceItems(-2, -10));
    }
}
