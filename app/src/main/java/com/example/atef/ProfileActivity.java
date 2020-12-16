package com.example.atef;

import android.os.Bundle;

public class ProfileActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getNavigationMenuItemId() {
        return R.id.profile;
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_profile;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}