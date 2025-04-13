package com.example.tickingtime.alarm.presentation.alarmListScreen.compose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.tickingtime.alarm.presentation.alarmListScreen.states.UpcomingAlarmDetails

@Composable
fun UpcomingAlarm(
    upcomingAlarmDetails: UpcomingAlarmDetails
){
    Text(
        text = upcomingAlarmDetails.alarmIn
    )
    Text(
        text = upcomingAlarmDetails.scheduledFor
    )
}