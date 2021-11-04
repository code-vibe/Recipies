package com.example.android.recipies

import androidx.annotation.DrawableRes


data class Recipies (
    val title : String,
    val cookingTime : String,
    val category: String,
    val energy: String,
    val rating: String,
    val description: String,
    val reviews: String,
    val ingredients: List<Ingredient>,

    )

data class Ingredient(@DrawableRes val image:Int, val title: String, val subtitle:String)

