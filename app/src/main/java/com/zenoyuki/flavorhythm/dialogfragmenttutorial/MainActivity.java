package com.zenoyuki.flavorhythm.dialogfragmenttutorial;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import data.AlertDFragment;
import data.DFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    private Button dialogFrag, alertFrag;
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogFrag = (Button)findViewById(R.id.main_btn_dialogFragment);
        alertFrag = (Button)findViewById(R.id.main_btn_alertFragment);

        dialogFrag.setOnClickListener(this);
        alertFrag.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.main_btn_dialogFragment:
                createDFrag();
                break;
            case R.id.main_btn_alertFragment:
                createAFrag();
                break;
            default:
                Toast.makeText(getApplicationContext(), "Buttons gone wonkers", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void createDFrag() {
        DFragment dFragment = new DFragment();
        dFragment.show(fm, "Dialog Fragment");
    }

    private void createAFrag() {
        AlertDFragment alertDFragment = new AlertDFragment();
        alertDFragment.show(fm, "Alert Dialog Fragment");
    }
}
