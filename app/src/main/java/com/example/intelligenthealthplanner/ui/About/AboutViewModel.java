package com.example.intelligenthealthplanner.ui.About;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This app will help you to enhance your health!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}