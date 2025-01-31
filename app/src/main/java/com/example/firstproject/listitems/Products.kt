package com.example.firstproject.listitems

import com.example.firstproject.R
import com.example.firstproject.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Products {
    private val _productList = MutableStateFlow<MutableList<Product>>(mutableListOf())
    private val productListFlow: StateFlow<MutableList<Product>> = _productList

    fun getProducts(): Flow<MutableList<Product>> {
        val productList: MutableList<Product> = mutableListOf(
            Product(
                imgProduct = R.drawable.pizza1,
                name = "Margherita Pizza",
                price = "$10.50"
            ),
            Product(
                imgProduct = R.drawable.pizza2,
                name = "Pepperoni  Pizza",
                price = "$12.50"
            ),
            Product(
                imgProduct = R.drawable.pizza3,
                name = "Mixed Pizza",
                price = "$10.50"
            ),
            Product(
                imgProduct = R.drawable.pizza4,
                name = "Mushroom Pizza",
                price = "$10.50"
            ),
            Product(
                imgProduct = R.drawable.pizza4,
                name = "Mushroom Pizza",
                price = "$10.50"
            ),
            Product(
                imgProduct = R.drawable.pizza4,
                name = "Mushroom Pizza",
                price = "$10.50"
            )
        )
        _productList.value = productList
        return productListFlow
    }
}