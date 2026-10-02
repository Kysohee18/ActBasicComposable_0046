package com.example.pertemuan3

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginBackground(modifier: Modifier){
    Box(modifier = modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background_1),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = modifier.matchParentSize()
        )
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center)
        {
            //Colum Header
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
                )
            {
                Text(text ="Login",
                    color = Color.Yellow,
                    fontSize = 40.sp,
                    )
                Text(text="ini adalah halaman login",
                    color =Color.White)

                Spacer(modifier =Modifier.height(120.dp))
            }

            //kolom tengah
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally)
            {Image(painter = painterResource(id = R.drawable.logoumy),
                contentDescription = null,
                modifier =Modifier.size(150.dp)


            )}
            //
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Spacer(modifier =Modifier.height(50.dp))
                Text(text ="Nama",
                    color = Color.Green,
                    fontSize = 27.sp)
                Text(text="Shahky Yandhana Putra",
                    color =Color.Yellow,
                    fontSize = 20.sp)

                Text(text="20240140047",
                    color =Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)

                Spacer(modifier =Modifier.height(25.dp))
                Image(painter = painterResource(id = R.drawable.kucing),
                    contentDescription = null,
                    modifier =Modifier
                        .size(320.dp)
                        .clip(CircleShape),


                )
            }

        }
    }
}