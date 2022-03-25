package com.example.testcovidapi

enum class Metric{
    NEGATIVE,
    POSITIVE,
    DEATHS
}

enum class TimeScale(val numDays: Int){
    WEEK(7),
    MONTH(30),
    MAX(-1)
}


class ChartOptions {
}