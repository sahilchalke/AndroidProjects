package com.example.sahil.superheropower.MainActivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sahil.superheropower.Fragments.BackStoryFragment;
import com.example.sahil.superheropower.Fragments.MainFragment;
import com.example.sahil.superheropower.Fragments.PickPowerFragment;
import com.example.sahil.superheropower.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener,
        PickPowerFragment.PickPowerInteractionListener, BackStoryFragment.BackStoryInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        /*FragmentManager manager1 = getSupportFragmentManager();
        Fragment fragment1 = manager1.findFragmentById(R.id.choosePowerFragment);
*/
        if(fragment==null){
            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment);
            transaction.commit();
        }
    }

    public void loadPowerScreen(){
        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment).addToBackStack(null).commit();

    }

    public void loadBackStoryScreen(){
        BackStoryFragment backStoryFragment =new BackStoryFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, backStoryFragment).addToBackStack(null).commit();




    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }



    @Override
    public void onPickPowerFragmentInteraction(Uri uri) {

    }

    @Override
    public void onBackStoryFragmentInteraction(Uri uri) {

    }


}
