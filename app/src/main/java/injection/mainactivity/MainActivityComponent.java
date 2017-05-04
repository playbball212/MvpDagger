package injection.mainactivity;

import dagger.Component;
import injection.view.mainactivity.MainActivity;

/**
 * Created by agoel on 5/3/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);


}
