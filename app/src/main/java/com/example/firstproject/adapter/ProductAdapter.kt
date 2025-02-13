package com.example.firstproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.firstproject.databinding.ProductItemBinding
import com.example.firstproject.model.Product

class ProductAdapter (private val context: Context, private val productList: MutableList<Product>):
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val listItem = ProductItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ProductViewHolder(listItem)
    }

    override fun getItemCount() = productList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.ImgProcut.setBackgroundResource(productList[position].imgProduct)
        holder.name.text = productList[position].name
        holder.price.text = productList[position].price
    }

    inner class ProductViewHolder(binding:ProductItemBinding): RecyclerView.ViewHolder(binding.root){
        val ImgProcut = binding.imgProduct
        val name = binding.txtName
        val price = binding.txtPrice
    }
}