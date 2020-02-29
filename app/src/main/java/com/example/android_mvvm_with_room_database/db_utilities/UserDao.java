package com.example.android_mvvm_with_room_database.db_utilities;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.android_mvvm_with_room_database.service.model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    public void insert(User user);

    @Query("SELECT * FROM users")
    public LiveData<List<User>> getAllUsers();

    @Delete
    public void delete(User user);

    @Update
    public void update(User user);
}
