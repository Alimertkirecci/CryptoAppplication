package com.example.atilhocakriptoapp.Service

import com.example.atilhocakriptoapp.Model.CyrptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    //GET ,POST,Update,Delete
    @GET("prices?key=2187154b76945f2373394aa34f7dc98a")
    fun getData():Call<CyrptoModel>
    //DEğişken almaya çalıştığımız işlemi bize burda yapacak liste şeklinde
    //retrofit ve data model sayasesinde

}


//https://github.com/atilsamancioglu/K21-JSONDataSet/blob/master/crypto.json
//https://api.nomics.com/v1/prices?key=2187154b76945f2373394aa34f7dc98a