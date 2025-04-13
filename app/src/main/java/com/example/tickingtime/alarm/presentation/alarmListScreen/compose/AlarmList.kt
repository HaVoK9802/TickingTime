package com.example.tickingtime.alarm.presentation.alarmListScreen.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tickingtime.alarm.presentation.alarmListScreen.states.AlarmItem

@Composable
fun AlarmList(
    modifier: Modifier = Modifier,
    listOfAlarms:List<AlarmItem>
){
    LazyColumn(
        modifier = modifier
    ){
        items(
            items = listOfAlarms,
            key = {
                it.id
            }
        ){ alarmItem ->
        }
    }

}

@Composable
fun AlarmItem(
    modifier: Modifier = Modifier,
    alarmItem: AlarmItem
){
    Card(
        modifier = Modifier.fillMaxWidth()
    ){
        Row {

        }
    }
}