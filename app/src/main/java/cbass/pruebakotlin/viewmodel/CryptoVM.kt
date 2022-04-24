package cbass.pruebakotlin.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import cbass.pruebakotlin.cliente.ClienteRetrofit
import cbass.pruebakotlin.model.CryptoMoneda
import cbass.pruebakotlin.model.CryptoMonedaItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CryptoVM(application: Application) : AndroidViewModel(application) {

    val cryptos = MutableLiveData<CryptoMoneda>()
    val crypto = MutableLiveData<CryptoMonedaItem>()

    fun getData()
    {
        val service = ClienteRetrofit.getInstance(ClienteRetrofit.BASE_URL)
        service.getCrypto().enqueue(object :Callback<CryptoMoneda>
        {
            override fun onResponse(call: Call<CryptoMoneda>, response: Response<CryptoMoneda>) {
                response.body().let {
                    cryptos.postValue(it)
                }
            }

            override fun onFailure(call: Call<CryptoMoneda>, t: Throwable) {
                Log.e("CALL",t.message.toString())
            }

        })
    }

    fun updateCrypto(crypto: CryptoMonedaItem)
    {
        this.crypto.value = crypto

    }

}