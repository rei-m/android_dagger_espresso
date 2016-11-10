package me.rei_m.daggersampleapplication.component;

import dagger.Subcomponent;
import me.rei_m.daggersampleapplication.ListActivity;
import me.rei_m.daggersampleapplication.ListFragment;
import me.rei_m.daggersampleapplication.module.ListActivityModule;

@Subcomponent(modules = {ListActivityModule.class})
public interface ListActivityComponent extends ListFragment.Injector {
    void inject(ListActivity activity);
}
