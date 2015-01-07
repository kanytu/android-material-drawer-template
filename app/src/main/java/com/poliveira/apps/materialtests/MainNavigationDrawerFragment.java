package com.poliveira.apps.materialtests;


import com.poliveria.apps.navigationdrawer.NavigationDrawerFragment;
import com.poliveria.apps.navigationdrawer.NavigationItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin Brey on 12/27/2014.
 */
public class MainNavigationDrawerFragment extends NavigationDrawerFragment {

    @Override
    public List<NavigationItem> getMenu() {
        List<NavigationItem> items = new ArrayList<NavigationItem>();
        items.add(new NavigationItem("item 1", getResources().getDrawable(R.drawable.ic_menu_check)));
        items.add(new NavigationItem("item 2", getResources().getDrawable(R.drawable.ic_menu_check)));
        items.add(new NavigationItem("item 3", getResources().getDrawable(R.drawable.ic_menu_check)));
        return items;
    }
}
