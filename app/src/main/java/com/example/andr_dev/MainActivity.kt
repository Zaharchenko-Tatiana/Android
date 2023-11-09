package com.example.andr_dev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.andr_dev.ui.theme.fon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(count=1000){
                    Box(modifier = Modifier.background(fon)) {
                        ImaMain()
                        Box() {
                            Fon()
                            Title()

                        }
                        Column(modifier = Modifier.fillMaxSize()) {
                            Icon()
                            Tex()
                            Scr()
                            Butt()

                        }
                    }
                }
            }
        }
    }
}


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(count=1000){
            Box(modifier = Modifier.background(fon)) {
                ImaMain()
                Box() {
                    Fon()
                    Title()

                }
                Column(modifier = Modifier.fillMaxSize()) {
                    Icon()
                    Tex()
                    Scr()
                    Butt()

               }
            }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ImaMain() {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.main_img), contentDescription = "Main_im",
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.BottomCenter,
                modifier = Modifier.fillMaxWidth()

            )

        }
    }

    @Preview
    @Composable
    fun Icon() {

        Row(
            modifier = Modifier.padding(start = 24.dp, top = 320.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic), contentDescription = "icon",
                modifier = Modifier.size(140.dp)
            )
        }

    }

    @Preview
    @Composable
    fun Title() {

        Box(modifier = Modifier.padding(start = 144.dp, top = 375.dp)) {

                Text(
                    text = "DoTA2",
                    modifier = Modifier.size(160.dp),
                    Color.White,
                    fontWeight = FontWeight.Bold
                )

            }
        Row(modifier = Modifier.padding(start = 144.dp, top = 370.dp)) {
            Image(
                painter = painterResource(id = R.drawable.stars_1),
                contentDescription = "stars_1",
                modifier = Modifier.size(70.dp)
            )
            Text(text = "70M", modifier = Modifier.padding(start = 10.dp, top = 25.dp),
                color = Color(69, 69, 77)
                )
        }
        Box(modifier = Modifier.padding(start = 50.dp, top = 420.dp)) {
            Row( ) {
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.moba),
                        contentDescription = "moba",
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        text = "MOBA", modifier = Modifier.padding(start = 13.dp, top = 22.dp),
                        color = Color(68, 169, 244)
                    )
                }

//                Box() {
//                    Image(
//                        painter = painterResource(id = R.drawable.multi),
//                        contentDescription = "multi",
//                        modifier = Modifier.size(64.dp)
//                    )
//                    Text(
//                        text = "MULTIPLAYER", modifier = Modifier.padding(start = 13.dp, top = 22.dp),
//                        color = Color(68, 169, 244)
//                    )
//                }
//
//                Box() {
//                    Image(
//                        painter = painterResource(id = R.drawable.strategy),
//                        contentDescription = "strategy",
//                        modifier = Modifier
//                            .size(64.dp)
//                    )
//                    Text(
//                        text = "STRATEGY", modifier = Modifier.padding(start = 13.dp, top = 22.dp),
//                        color = Color(68, 169, 244)
//                    )
//                }
            }

       }
    }

@Preview
@Composable
fun Tex() {
    Row(modifier = Modifier.padding(start = 50.dp, top = 30.dp, end=30.dp)) {
        Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA)" +
                    " game which has two teams of five players compete to collectively" +
                    " destroy a large structure defended by the opposing team known as" +
                    " the \"Ancient\", whilst defending their own.", color = Color(238, 242, 251)
        )
    }
}

@Preview
@Composable
fun Scr() {

            Row(
                modifier = Modifier
                    .padding(start = 50.dp, top = 18.dp)
                    .height(128.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.scrin1), contentDescription = "scr1",
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(240.dp),
                    contentScale = ContentScale.FillBounds
                )
                Image(
                    painter = painterResource(id = R.drawable.scrin2), contentDescription = "scr2",
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(240.dp)
                        .padding(start = 16.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
}


@Composable
fun Butt() {
    Row(modifier = Modifier.padding(70.dp)){}
//    Box(  modifier = Modifier.background(Yellow)) {
//        Button(
//            onClick =
//            { /*...*/ }
//
//
//        ) { Text("Install") }
//
//    }
}

@Preview
    @Composable
    fun Fon() {

        Row(
            modifier = Modifier
                .padding(top = 360.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.fon), contentDescription = "fon",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds,
            )
        }

    }
