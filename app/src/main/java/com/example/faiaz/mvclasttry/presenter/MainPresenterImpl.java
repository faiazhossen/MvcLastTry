package com.example.faiaz.mvclasttry.presenter;

import com.example.faiaz.mvclasttry.activity.MainView;
import com.example.faiaz.mvclasttry.model.MainModel;
import com.example.faiaz.mvclasttry.model.MainModelImpl;
import com.example.faiaz.mvclasttry.model.PresnterUpdate;

/**
 * Created by FAIAZ on 10/9/2017.
 */

public class MainPresenterImpl implements MainPresenter ,PresnterUpdate{
    private MainView mainView;
    private MainModel mainModel;

    public MainPresenterImpl(MainView mainView){
        this.mainView = mainView;
        mainModel = new MainModelImpl(this);
    }

    @Override
    public void showToast() {
        mainModel.getToast();
    }

    @Override
    public void showMessage() {
        mainModel.getMessage();

    }

    @Override
    public void setMessage(String message) {
        mainView.showMessage(message);
    }

    @Override
    public void setToast(String toast) {
        mainView.showCounter(toast);
    }
}
