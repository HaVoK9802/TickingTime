package com.example.tickingtime.alarm.presentation.alarmListScreen.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tickingtime.alarm.presentation.alarmListScreen.states.AlarmItem
import com.example.tickingtime.alarm.presentation.alarmListScreen.states.UpcomingAlarmDetails


@Composable
fun AlarmScreen(
    modifier: Modifier = Modifier,
    listOfAlarms:List<AlarmItem>,
    upcomingAlarmDetails: UpcomingAlarmDetails
){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        UpcomingAlarm(upcomingAlarmDetails = upcomingAlarmDetails)

    }

}

@Preview
@Composable
fun PreviewAlarmScreen(

){

}