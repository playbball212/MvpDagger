package injection.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import injection.mainactivity.DaggerMainActivityComponent;
import injection.mainactivity.MainActivityComponent;
import webv.agoel.mvpdagger.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{


    private static final String TAG = "MainActivity";
    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.create().inject(this);
        presenter.addView(this);
        presenter.doCalculation("hello world");
    }

    @Override
    public void updateView(String log) {
        Log.d(TAG, "updateView: " + log);
    }
}
