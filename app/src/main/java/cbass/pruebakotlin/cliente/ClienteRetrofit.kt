package cbass.pruebakotlin.cliente

import cbass.pruebakotlin.service.CryptoService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ClienteRetrofit {

    companion object {
        const val BASE_URL = "https://api.coincap.io/"
        private var cliente: Retrofit? = null

        fun getInstance(url: String): CryptoService {
            if (cliente == null) {
                cliente = Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build()
            }

            return cliente!!.create(CryptoService::class.java)

        }
    }
}