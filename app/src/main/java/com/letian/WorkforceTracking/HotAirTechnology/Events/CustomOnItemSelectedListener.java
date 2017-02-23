package com.letian.WorkforceTracking.HotAirTechnology.Events;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by letian on 7/2/17.
 */

public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {


    public void onItemSelected(AdapterView<?> parent, View view, int pos,
                               long id) {
        String itemSelected = parent.getItemAtPosition(pos).toString();

        Toast.makeText(parent.getContext(),
                itemSelected +" is selected",
                Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}
