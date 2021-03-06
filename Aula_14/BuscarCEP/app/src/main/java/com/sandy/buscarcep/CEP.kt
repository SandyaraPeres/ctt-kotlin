package com.sandy.buscarcep

import com.google.gson.annotations.SerializedName

data class CEP(
    @SerializedName("logradouro") val rua: String,
    @SerializedName("bairro") val bairro: String,
    @SerializedName("localidade") val cidade: String,
    @SerializedName("uf") val uf: String
) {
    //Sobrecarga de método
    override fun toString() : String {
        return "Rua: $rua\nBairro:$bairro\nE fica em: $cidade / $uf"
    }
}