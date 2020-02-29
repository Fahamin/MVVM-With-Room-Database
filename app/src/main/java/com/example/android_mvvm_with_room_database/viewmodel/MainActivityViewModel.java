package com.example.android_mvvm_with_room_database.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.annotation.NonNull;

import com.example.android_mvvm_with_room_database.service.model.User;
import com.example.android_mvvm_with_room_database.service.repository.UserRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private UserRepository userRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        userRepository = new UserRepository(application);
    }

    public LiveData<List<User>> getAllUsers() {

        return userRepository.getAllUser();
    }

    public void insert(User user) {
        userRepository.insert(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
