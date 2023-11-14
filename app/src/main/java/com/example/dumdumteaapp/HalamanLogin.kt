package com.example.dumdumteaapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun HalamanLogin(
    onSubmitButtonClick: (MutableList<String>) -> Unit
){
    var txtNama by rememberSaveable {
        mutableStateOf("")
    }
    var txtAlamat by rememberSaveable {
        mutableStateOf("")
    }
    var txtTelpon by rememberSaveable {
        mutableStateOf("")
    }
    var txtListData: MutableList<String> = mutableListOf(txtNama,txtAlamat,txtTelpon)
}