package com.example.riddleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.riddleapp.ui.theme.RiddleAppTheme
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofriddle.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RiddleAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    RiddleColumn()
                }
            }
        }
    }
}

@Composable
fun RiddleColumn() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        RiddleCard(
            day = 1,
            riddle = "What has keys but can’t open locks?",
            answer = "A piano.",
            imageRes = R.drawable.art1
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 2,
            riddle = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps.",
            imageRes = R.drawable.art2
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 3,
            riddle = "I’m tall when I’m young, and I’m short when I’m old. What am I?",
            answer = "A candle.",
            imageRes = R.drawable.art3
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 4,
            riddle = "What has a heart that doesn’t beat?",
            answer = "An artichoke.",
            imageRes = R.drawable.art4
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 5,
            riddle = "I’m light as a feather, yet the strongest man can’t hold me for more than five minutes. What am I?",
            answer = "Breath.",
            imageRes = R.drawable.art5
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 6,
            riddle = "I’m not alive, but I can grow. I don’t have lungs, but I need air. What am I?",
            answer = "Fire.",
            imageRes = R.drawable.art6
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 7,
            riddle = "What comes once in a minute, twice in a moment, but never in a thousand years?",
            answer = "The letter 'M'.",
            imageRes = R.drawable.art7
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 8,
            riddle = "I can travel around the world while staying in the same spot. What am I?",
            answer = "A stamp.",
            imageRes = R.drawable.art8
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 9,
            riddle = "What has many teeth but cannot bite?",
            answer = "A comb.",
            imageRes = R.drawable.art9
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 10,
            riddle = "What can fill a room but takes up no space?",
            answer = "Light.",
            imageRes = R.drawable.art10
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 11,
            riddle = "The more you have of it, the less you see. What is it?",
            answer = "Darkness.",
            imageRes = R.drawable.art11
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 12,
            riddle = "I have branches, but no fruit, trunk, or leaves. What am I?",
            answer = "A bank.",
            imageRes = R.drawable.art12
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 13,
            riddle = "What has words, but never speaks?",
            answer = "A book.",
            imageRes = R.drawable.art13
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 14,
            riddle = "I have cities, but no houses. I have mountains, but no trees. I have water, but no fish. What am I?",
            answer = "A map.",
            imageRes = R.drawable.art14
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 15,
            riddle = "What has an eye but cannot see?",
            answer = "A needle.",
            imageRes = R.drawable.art15
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 16,
            riddle = "I’m always in front of you but can’t be seen. What am I?",
            answer = "The future.",
            imageRes = R.drawable.art16
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 17,
            riddle = "I’m found in socks, scarves, and mittens. I’m found in the paws of playful kittens. What am I?",
            answer = "Yarn.",
            imageRes = R.drawable.art17
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 18,
            riddle = "What can travel faster than sound?",
            answer = "Light.",
            imageRes = R.drawable.art18
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 19,
            riddle = "I fly without wings. I cry without eyes. Whenever I go, darkness flies. What am I?",
            answer = "A cloud.",
            imageRes = R.drawable.art19
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 20,
            riddle = "What begins with an E, ends with an E, but only contains one letter?",
            answer = "An envelope.",
            imageRes = R.drawable.art20
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 21,
            riddle = "What has a neck but no head?",
            answer = "A bottle.",
            imageRes = R.drawable.art21
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 22,
            riddle = "I can be cracked, made, told, and played. What am I?",
            answer = "A joke.",
            imageRes = R.drawable.art22
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 23,
            riddle = "What has to be broken before you can use it?",
            answer = "An egg.",
            imageRes = R.drawable.art23
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 24,
            riddle = "What’s full of holes but still holds water?",
            answer = "A sponge.",
            imageRes = R.drawable.art24
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 25,
            riddle = "I am an odd number. Take away one letter, and I become even. What number am I?",
            answer = "Seven.",
            imageRes = R.drawable.art25
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 26,
            riddle = "If two’s company, and three’s a crowd, what are four and five?",
            answer = "Nine.",
            imageRes = R.drawable.art26
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 27,
            riddle = "What has one head, one foot, and four legs?",
            answer = "A bed.",
            imageRes = R.drawable.art27
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 28,
            riddle = "I am taken from a mine and shut up in a wooden case, from which I am never released. What am I?",
            answer = "Pencil lead.",
            imageRes = R.drawable.art28
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 29,
            riddle = "What kind of coat is best put on wet?",
            answer = "A coat of paint.",
            imageRes = R.drawable.art29
        )

        Spacer(modifier = Modifier.height(8.dp))
        RiddleCard(
            day = 30,
            riddle = "Forward I am heavy, but backward I am not. What am I?",
            answer = "A ton.",
            imageRes = R.drawable.art30
        )

    }
}

@Composable
fun RiddleCard(day: Int, riddle: String, answer: String, imageRes: Int) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Day $day",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = riddle,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Riddle Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(vertical = 8.dp)
            )
            Text(
                text = "Answer: $answer",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRiddleColumn() {
    RiddleColumn()
}
