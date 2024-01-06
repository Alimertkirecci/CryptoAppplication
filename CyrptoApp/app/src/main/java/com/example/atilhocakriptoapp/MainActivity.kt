  package com.example.atilhocakriptoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.atilhocakriptoapp.Model.CyrptoModel
import com.example.atilhocakriptoapp.Service.CryptoAPI
import com.example.atilhocakriptoapp.databinding.ActivityMainBinding
import com.example.atilhocakriptoapp.databinding.RowLayoutBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

  private fun Any.enqueue(callback: Callback<List<CyrptoModel>>) {
      TODO("Not yet implemented")
  }//textid_price  textid_name

  class MainActivity : AppCompatActivity() {
lateinit var binding: RowLayoutBinding
    private val BASE_URL= "https://api.nomics.com/v1/"
    private var cryptoModels:ArrayList<CyrptoModel>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)
        binding= RowLayoutBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        binding.textidName
        binding.textidPrice
    }
      private fun loadData(){//REtrofit nesnemizi aşağıda oluşturmuş olduk

          val retrofit=Retrofit.Builder()
              .baseUrl(BASE_URL)
              .addConverterFactory(GsonConverterFactory.create()).build()
          //Servis ile retrofiti birbrne  bağlıyoruz.
          val service=retrofit.create(CryptoAPI::class.java)
          val call =service.getData()  //async şekilde verileri almayı sağlar. obje atamamız gerekmektedir.
          call.enqueue(object:Callback<List<CyrptoModel>>{
              override fun onResponse(
                  call: Call<List<CyrptoModel>>,
                  response: Response<List<CyrptoModel>>
              )
              {
if(response.isSuccessful){//Eğer bu boş gelmediyse let kod bloğu içerisinde verdiğimi yap
    response.body()?.let {
cryptoModels= ArrayList(it)                    }
for (cryptoModels:CyrptoModel in cryptoModels!! ){
    println(cryptoModels.currency)
    println(cryptoModels.price)
}
            }
              }

              override fun onFailure(call: Call<List<CyrptoModel>>, t: Throwable) {
                  t.printStackTrace()
              }

          })



      }
}