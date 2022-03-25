package com.example.testcovidapi.db

import android.provider.BaseColumns

object DBNameClass: BaseColumns {
    const val TABLE_NAME = "CovidData"
    const val COLUMN_NAME_DATE = "Name"
    const val COLUMN_NAME_POSITIVE = "Positive"
    const val COLUMN_NAME_NEGATIVE = "Negative"
    const val COLUMN_NAME_DEATHS = "Deaths"
}