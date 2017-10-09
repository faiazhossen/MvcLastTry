package com.example.faiaz.mvclasttry.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.faiaz.mvclasttry.R;
import com.example.faiaz.mvclasttry.presenter.MainPresenter;
import com.example.faiaz.mvclasttry.presenter.MainPresenterImpl;


public class MainActivity extends AppCompatActivity implements MainView{

    Button count;

    TextView messageView;



    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageView = (TextView) findViewById(R.id.txt_message);
        count = (Button) findViewById(R.id.btn_count);
        presenter = new MainPresenterImpl(this);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.showMessage();
                presenter.showToast();
            }
        });
    }



    @Override
    public void showMessage(String message) {
        messageView.setText(message);
    }

    @Override
    public void showCounter(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }


}
