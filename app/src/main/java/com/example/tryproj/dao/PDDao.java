package com.example.tryproj.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.tryproj.PDItem;

import java.util.List;

@Dao
public interface PDDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertPDItem(PDItem pdItem);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertPDItems(PDItem[] list);

    @Update
    public void updatePDItem(PDItem pdItem);

    @Update
    public void updatePDItems(PDItem[] list);

    @Query("SELECT * FROM PDItem")
    public PDItem[] loadPDItems();

    @Query("SELECT * FROM PDItem WHERE status = 1")
    public PDItem[] loadDonePDItems();

    @Query("SELECT * FROM PDItem WHERE status = 0")
    public PDItem[] loadUndonePDItems();

    @Delete
    public void deletePDItem(PDItem pdItem);


    @Delete
    public void deletePDItems(PDItem[] pdItem);

}
