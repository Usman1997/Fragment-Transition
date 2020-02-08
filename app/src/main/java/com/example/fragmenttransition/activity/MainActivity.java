package com.example.fragmenttransition.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;

import com.example.fragmenttransition.utils.FragmentTransactionExtended;
import com.example.fragmenttransition.R;
import com.example.fragmenttransition.fragments.Fragment1;
import com.example.fragmenttransition.fragments.Fragment2;

public class MainActivity extends AppCompatActivity {
    Fragment mFirstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFirstFragment();
    }

    private void addFirstFragment() {
        mFirstFragment = new Fragment1();
        androidx.fragment.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, mFirstFragment);
        fragmentTransaction.commit();
    }

    public void addFragmentWithAnimation(int transition){
        Fragment secondFragment = new Fragment2();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        FragmentTransactionExtended fragmentTransactionExtended = new FragmentTransactionExtended(this, fragmentTransaction, mFirstFragment, secondFragment, R.id.fragment_container);
        fragmentTransactionExtended.addTransition(transition);
        fragmentTransactionExtended.commit();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getFragmentManager().popBackStack();
        } else
            super.onBackPressed();
    }
}
