package com.example.faiaz.mvclasttry.model;

import com.example.faiaz.mvclasttry.presenter.MainPresenter;

/**
 * Created by FAIAZ on 10/9/2017.
 */

public class MainModelImpl implements MainModel {
    PresnterUpdate presenter;
    public MainModelImpl(PresnterUpdate presenter){
        this.presenter = presenter;
    }

    @Override
    public void getMessage() {
        presenter.setMessage("Hello baibeh mvp");
    }

    @Override
    public void getToast() {
        presenter.setToast("Musta fucking Mim");
    }
}
