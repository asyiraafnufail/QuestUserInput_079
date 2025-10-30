package com.asyiraaf.inputpengguna

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    // variabel untuk mengingat nilai masukan input
    var textNama by remember { mutableStateOf( "") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }

    // variabel untuk menyimpan data dari ui
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("" ) }
    var jenis by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-Laki", "Perempuan")
}