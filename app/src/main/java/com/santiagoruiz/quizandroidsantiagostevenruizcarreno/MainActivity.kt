package com.santiagoruiz.quizandroidsantiagostevenruizcarreno

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.santiagoruiz.quizandroidsantiagostevenruizcarreno.ui.theme.QuizAndroidSantiagoStevenRuizCarrenoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PantallaPerfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        androidx.compose.foundation.Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Juan Pérez",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 4.dp, start = 16.dp, end = 16.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "150", fontWeight = FontWeight.Bold)
                Text(text = "Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "2.3K", fontWeight = FontWeight.Bold)
                Text(text = "Seguidores")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "980", fontWeight = FontWeight.Bold)
                Text(text = "Likes")
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Seguir",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(weight = 1f)
                    .background(
                        color = Color.Blue,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 10.dp, bottom = 10.dp)
            )
            Text(
                text = "Mensaje",
                color = Color.Blue,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(weight = 1f)
                    .border(
                        width = 1.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 10.dp, bottom = 10.dp)
            )
        }

        Text(
            text = "Intereses",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Ciclismo", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "Programación", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "UI/UX", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Música", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "Viajes", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "Gaming", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
        }

        Text(
            text = "Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 8.dp)
        )
        Row(modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Gray, RoundedCornerShape(8.dp))
                       .padding(12.dp)) {
        }

    }
}




