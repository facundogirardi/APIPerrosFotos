package com.example.apiperrosfotos

import com.google.gson.annotations.SerializedName

data class PerrosResponse(
    @SerializedName("status") var Estado: String,
    @SerializedName("message") var Imagenes: List<String>
)
