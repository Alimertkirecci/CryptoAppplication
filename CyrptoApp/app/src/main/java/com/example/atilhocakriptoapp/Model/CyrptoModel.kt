package com.example.atilhocakriptoapp.Model

import com.google.gson.annotations.SerializedName
import java.util.Currency

data class CyrptoModel (
 //@SerializedName("currency")  değişken üzerne değer verilirse parametresi currency olacak,bunu al val içersindeki string değere ata
 val currency: String,
// @SerializedName("price")
 val price:String)