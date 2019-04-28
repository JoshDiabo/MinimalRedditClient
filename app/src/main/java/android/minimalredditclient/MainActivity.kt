package android.minimalredditclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolBar = findViewById<Toolbar>(R.id.reddit_toolbar)
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu (m: Menu) : Boolean {
        val inflater = menuInflater

        inflater.inflate(R.menu.reddit_toolbar, m)
        return true
    }
}
