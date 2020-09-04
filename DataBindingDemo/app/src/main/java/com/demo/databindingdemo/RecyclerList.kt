package com.demo.databindingdemo

data class RecyclerList (val items: ArrayList<RecyclerData>)
data class RecyclerData(val name: String, val description: String, val created_at: String, val owner: Owner)
data class Owner(val avatar_url: String)