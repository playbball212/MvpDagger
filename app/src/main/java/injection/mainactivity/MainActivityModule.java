package injection.mainactivity;

import dagger.Module;
import dagger.Provides;
import injection.view.mainactivity.MainActivityPresenter;

/**
 * Created by agoel on 5/3/2017.
 */


@Module
public class MainActivityModule {

    @Provides
    public MainActivityPresenter provideMainActivityPresenter (){
        return new MainActivityPresenter();
    }
}
