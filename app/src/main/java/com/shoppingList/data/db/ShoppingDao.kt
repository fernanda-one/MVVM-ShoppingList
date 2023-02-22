package com.shoppingList.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.shoppingList.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem)

    @Delete()
    suspend fun delete(item: ShoppingItem)

    @Query(value = "SELECT * FROM shopping_items")
    fun getAllShoppingItems() : LiveData<List<ShoppingItem>>
}