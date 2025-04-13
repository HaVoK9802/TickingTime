package com.example.tickingtime.alarm.presentation.alarmListScreen.states

data class AlarmItem(
    val id: Int,
    val name: String? = null,
    val time: String,
    val amOrPm: String,
    val isScheduled: Boolean,
    val alarmScheduled: AlarmScheduled,
    val selectedDateForAlarm:String? = null,
    val daysScheduledForAlarm:List<Pair<DaysOfTheWeek,Boolean>>? = null
)

enum class AlarmScheduled{
    EVERY_DAY,
    SELECTED_DATE, 
    SELECTED_DAYS_OF_THE_WEEK
}

enum class DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}