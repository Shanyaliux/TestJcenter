package world.shanya.mylibrary

import android.content.Context
import android.widget.Toast

object Test {
    fun test(context: Context){
        Toast.makeText(context,"Hello World",Toast.LENGTH_SHORT).show()
    }
}