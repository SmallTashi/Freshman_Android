package com.mredrock.cyxbs.freshman.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mredrock.cyxbs.freshman.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.essential)
    Button essential;
    @BindView(R.id.train)
    Button train;
    @BindView(R.id.strategy)
    Button strategy;
    @BindView(R.id.main)
    Button main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.essential, R.id.train, R.id.strategy, R.id.main})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.essential:
                Intent a = new Intent(TestActivity.this, EssentialActivity.class);
                startActivity(a);
                overridePendingTransition(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out);
                break;
            case R.id.train:
                Intent b = new Intent(TestActivity.this, TrainingActivity.class);
                startActivity(b);
                overridePendingTransition(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out);
                break;
            case R.id.strategy:
                Intent c = new Intent(TestActivity.this, StrategyMainActivity.class);
                startActivity(c);
                overridePendingTransition(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out);
                break;
            case R.id.main:
                Intent d = new Intent(TestActivity.this, MainActivity.class);
                startActivity(d);
                overridePendingTransition(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        onViewClicked(v);
    }
}
