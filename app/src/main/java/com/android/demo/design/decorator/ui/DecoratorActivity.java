package com.android.demo.design.decorator.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.android.demo.design.R;
import com.android.demo.design.decorator.Clothes;
import com.android.demo.design.decorator.ClothesShoes;
import com.android.demo.design.decorator.ClothesTShirt;
import com.android.demo.design.decorator.ClothesTrousers;
import com.android.demo.design.decorator.Person;

public class DecoratorActivity extends AppCompatActivity {

    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initView();
    }

    private void initView() {
        tvShow = (TextView) findViewById(R.id.tv_show);


        Person person = new Person("老俞");
        ClothesTShirt shirt = new ClothesTShirt();
        shirt.setPerson(person);
        ClothesTrousers trousers = new ClothesTrousers();
        trousers.setPerson(person);
        ClothesShoes shoes = new ClothesShoes();
        shoes.setPerson(person);

        shoes.show();

    }

}
