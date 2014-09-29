package com.muken.fragmentlateralmenu;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by muken on 29/09/14.
 */
public class DrawerItemClickListener implements ListView.OnItemClickListener {

    Activity activity;

    public DrawerItemClickListener(Activity activity){
        this.activity = (Activity) activity;
    }

    @Override
    public void onItemClick(AdapterView parent, View view, int position, long id) {
        int itemIndex = position;
        // selectItem(position); implementar
        OnItemClickDrawerListener listener = (OnItemClickDrawerListener) activity;
        listener.onItemClickDrawer(itemIndex);

    }

    public interface OnItemClickDrawerListener {
        void onItemClickDrawer(int itemIndex);
    }
}
