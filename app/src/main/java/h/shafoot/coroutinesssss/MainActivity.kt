package h.shafoot.coroutinesssss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var hh:MainActivity
    @OptIn(ExperimentalStdlibApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch(Dispatchers.Main) {
            println("huda inspects threads ,,11  ${coroutineContext[CoroutineDispatcher]}")
        }
        lifecycleScope.launch(Dispatchers.Default) {
            println("huda inspects threads ,,2  ${coroutineContext[CoroutineDispatcher]}")
        }
        lifecycleScope.launch(Dispatchers.IO) {
            println("huda inspects threads ,,3  ${coroutineContext[CoroutineDispatcher]}")
        }
        lifecycleScope.launch {
            println("huda inspects threads ,,4  ${coroutineContext[CoroutineDispatcher]}")
        }

        if (::hh.isInitialized){}







    }


    fun addNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun main() {
        val result = addNumbers(3, 4)
        println("Result: $result")
    }

    fun mmm():(Int,Int)->Unit{
        return {x,e->}
    }

    
}