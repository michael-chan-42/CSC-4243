package interfacedesign.ligo.michael.ligoapp.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import butterknife.ButterKnife;
import interfacedesign.ligo.michael.ligoapp.R;

/**
 * Created by Mike on 2/29/16.
 */
public class Activity4 extends ActionBarActivity {

    @Override
    public  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
        ButterKnife.bind(this);

    }
}