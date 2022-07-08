package com.mkrdeveloper.menuoptionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
         R.id.setting -> Toast.makeText(this,"setting selected", Toast.LENGTH_SHORT).show()
         R.id.fav -> Toast.makeText(this,"fav selected", Toast.LENGTH_SHORT).show()
         R.id.delete -> Toast.makeText(this,"delete selected", Toast.LENGTH_SHORT).show()
         R.id.add -> Toast.makeText(this,"add selected", Toast.LENGTH_SHORT).show()
        }


        return super.onOptionsItemSelected(item)
    }
}