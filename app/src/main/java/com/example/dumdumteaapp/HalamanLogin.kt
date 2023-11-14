package com.example.dumdumteaapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
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

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        OutlinedTextField(value =txtNama , onValueChange ={
            txtNama = it
        }, label = {
            Text(text = "Nama")
        })
        OutlinedTextField(value =txtAlamat , onValueChange ={
            txtAlamat = it
        }, label = {
            Text(text = "Alamat")
        })
        OutlinedTextField(value =txtTelpon , onValueChange ={
            txtTelpon = it
        }, label = {
            Text(text = "Telpon")
        })
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {onSubmitButtonClick(txtListData)}) {
            Text(text = stringResource(id = R.string.btn_submit))
        }
    }
}