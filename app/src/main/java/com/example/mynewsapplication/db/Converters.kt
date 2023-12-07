package com.example.mynewsapplication.db

import androidx.room.TypeConverter
import com.example.mynewsapplication.model.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String? {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
       return Source(name, name)
    }
}
