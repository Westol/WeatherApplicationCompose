package com.easy_life.weatherapplicationcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.easy_life.weatherapplicationcompose.R
import com.easy_life.weatherapplicationcompose.ui.theme.BlueLight

@Composable
@Preview (showBackground = true)
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.weather_bg),
        contentDescription = "image 1",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.9f),
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = BlueLight,
            elevation = 0.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
          Column(
              modifier = Modifier.fillMaxWidth(),
              horizontalAlignment = Alignment.CenterHorizontally
              ) {
              Row(
                  modifier = Modifier.fillMaxWidth(),
                  horizontalArrangement = Arrangement.SpaceBetween
                  ) {
                  Text(
                      modifier = Modifier.padding(top = 8.dp, start = 8.dp),
                      text = "15 Jun 2022 15:00",
                      style = TextStyle(fontSize = 15.sp),
                      color = Color.White
                  )
                  AsyncImage(
                      model = "https://cdn.weatherapi.com/weather/64x64/day/113.png",
                      contentDescription = "image 2",
                      modifier = Modifier.size(35.dp)
                          .padding(top = 3.dp, end = 8.dp)
                  )
              }
          }
        }

    }
}