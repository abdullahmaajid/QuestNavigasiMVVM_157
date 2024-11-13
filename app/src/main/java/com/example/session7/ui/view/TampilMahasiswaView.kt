package com.example.session7.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.navigation.NavHostController
import com.example.session7.model.Mahasiswa



@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa,
    navController: NavHostController
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Button(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
        Spacer(modifier = Modifier.height(16.dp))


        TampilData(judul = "Nama", isinya = mhs.nama)
        TampilData(judul = "Jenis Kelamin", isinya = mhs.gender)
        TampilData(judul = "Alamat", isinya = mhs.alamat)
        TampilData(judul = "Email", isinya = mhs.email)
        TampilData(judul = "Nomor Handphone", isinya = mhs.noHp)
        TampilData(judul = "NIM", isinya = mhs.nim)
    }
}

@Composable
fun TampilData(
    judul: String,
    isinya: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(judul, modifier = Modifier.weight(1f))
        Text(":", modifier = Modifier.weight(0.1f))
        Text(isinya, modifier = Modifier.weight(2f))
    }
}

