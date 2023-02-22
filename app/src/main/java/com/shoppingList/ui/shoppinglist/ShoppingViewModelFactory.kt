package com.shoppingList.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shoppingList.data.repositories.ShoppingRepository

class ShoppingViewModelFactory(
    private val repository: ShoppingRepository
): ViewModelProvider.NewInstanceFactory() {
    private fun <T: ViewModel?> create(modelClass: Class<T>): T{
        return ShoppingViewModel(repository) as T
    }
}