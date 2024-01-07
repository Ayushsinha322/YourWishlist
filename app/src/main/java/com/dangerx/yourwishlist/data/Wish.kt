package com.dangerx.yourwishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")

data class Wish(

    @PrimaryKey(autoGenerate = true)

    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String="",
    @ColumnInfo(name = "wish-desc")
    val description:String=""
)

object DummyWish{
    val wishList  = listOf(

        Wish(title = "Porsche macan",
            description =  "A Car"),
        Wish(title = "Android developer ",
            description =  "BY 2024"),
        Wish(title = "ps5",
            description =  "Gaming Console"),
        Wish(title = "10Cgpa",
            description =  "IN semester")








    )
}
