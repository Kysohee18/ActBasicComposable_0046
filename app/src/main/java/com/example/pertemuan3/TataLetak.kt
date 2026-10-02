package com.example.pertemuan3

import android.R.attr.fontFamily
import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColoumn(modifier: Modifier) {
    Column(modifier.padding(top =20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = " Row 1")
        Text(text = "Box 2")
        Text(text = "Coloumn 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier){
    Column()
    {
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1Baris2")
        Text(text = "Komponen2Baris2")
        Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        //kolom1
        Column(){
            Text(text = "Komponen1kolom1")
            Text(text = "Komponen2kolom1")
            Text(text = "Komponen3kolom1")
        }
        //kolom2
        Column(){
            Text(text = "Komponen1kolom2")
            Text(text = "Komponen2kolom2")
            Text(text = "Komponen3kolom2")
        }

    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier){
    val gambar = painterResource(id = R.drawable.memeprabowo)
    Column() {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row1_komponen1")
                    Text(text = "Col1_Row1_komponen2")
                    Text(text = "Col1_Row1_komponen3")
                }
                Row(
                    modifier =modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row2_komponen1")
                    Text(text = "Col1_Row2_komponen2")
                    Text(text = "Col1_Row2_komponen3")
                }
            }
        }
        Spacer(modifier = modifier.height(height = 10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 300.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ){
            Image(painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit )
            Text(text = "hmm teddy",
                fontSize = 50.sp,
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontFamily= FontFamily.Cursive,
                modifier = Modifier.align(
                    alignment= Alignment.Center))

        }
    }
}
