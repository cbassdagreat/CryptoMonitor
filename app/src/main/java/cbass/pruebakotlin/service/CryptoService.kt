package cbass.pruebakotlin.service

import cbass.pruebakotlin.model.CryptoMoneda
import retrofit2.Call
import retrofit2.http.GET

interface CryptoService {

    @GET("crypto")
    fun getCrypto(): Call<CryptoMoneda>

}