package com.shoppingList.data.repositories

import com.shoppingList.data.db.ShoppingDatabase
import com.shoppingList.data.db.entities.ShoppingItem

class ShoppingRepository (
    private val db: ShoppingDatabase
    ){
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().insert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}