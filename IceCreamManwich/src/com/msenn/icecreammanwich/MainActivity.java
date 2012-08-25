
package com.msenn.icecreammanwich;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		MenuItem item = menu.add("Menu item");
		item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		
		return super.onCreateOptionsMenu(menu);
	}
    
    
}
