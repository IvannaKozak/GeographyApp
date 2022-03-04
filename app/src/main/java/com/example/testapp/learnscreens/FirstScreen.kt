package com.example.testapp.learnscreens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.widget.Space
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.testapp.R
import com.example.testapp.navigation.Screen
import kotlinx.coroutines.delay


@Composable
fun FirstScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(start = 0.dp)
        .verticalScroll(rememberScrollState())
        .background(if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2))
        .padding(horizontal = 15.dp, vertical = 20.dp),
    //    .padding(start = 16.dp)
        contentAlignment = Alignment.TopCenter
    ) {
        Column {
            Text(
                text = "Географічні відкриття, видатні мандрівники", fontSize = 25.sp,
                color = if (isSystemInDarkTheme()) Color(0xFFFFB400) else Color.Black)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "---------------------------------------------------------------------------")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "1.Подорож Христофора Колумба", fontSize = 26.sp,
                color = if (isSystemInDarkTheme()) Color.White else Color.Black)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Метою першої експедиції Х. Колумба було відкриття західного шляху в Індію, оскільки на той час європейці вже знали, що Земля має форму кулі. Мандрівники вирушили з Піренейського півострова на захід через Атлантичний океан. Перетнувши океан, експедиція досягла островів Центральної Америки.",
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                fontSize = 22.sp)
            Spacer(modifier = Modifier.height(20.dp))
            Image(painter = painterResource(R.drawable.firstmap), contentDescription = "first_map",
            modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(50.dp))

            Text(text = "2.Подорож Магеллана", fontSize = 26.sp,
                color = if (isSystemInDarkTheme()) Color.White else Color.Black)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Фернанд Магеллан під час своєї експедиції здійснив першу в історії навколосвітню подорож.",
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                fontSize = 22.sp)
            Spacer(modifier = Modifier.height(20.dp))
            Image(painter = painterResource(R.drawable.secondmap2), contentDescription = "first_map",
                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(50.dp))

            Text(text = "3.Подорож Васко да Гами", fontSize = 26.sp,
                color = if (isSystemInDarkTheme()) Color.White else Color.Black)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Васко да Гама відкрив європейцям морський шлях до Індії, обігнувши Африку із заходу, перейшовши через Атлантичний та Індійський океани.",
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                fontSize = 22.sp)
            Spacer(modifier = Modifier.height(20.dp))
            Image(painter = painterResource(R.drawable.thirdmap2), contentDescription = "first_map",
                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(50.dp))

            Text(text = "5.Подорож Вітуса Беринга", fontSize = 26.sp,
                color = if (isSystemInDarkTheme()) Color.White else Color.Black)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Вітус Беринг відкрив протоку між Тихим і Північним Льодовитим океанами.",
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                fontSize = 22.sp)
            Spacer(modifier = Modifier.height(20.dp))
            Image(painter = painterResource(R.drawable.thirdmap2), contentDescription = "first_map",
                modifier = Modifier.fillMaxWidth())
        }
    }
}


@Composable
@Preview
fun FirstScreenPreview() {
    FirstScreen()
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun FirstScreenDarkPreview() {
    FirstScreen()
}