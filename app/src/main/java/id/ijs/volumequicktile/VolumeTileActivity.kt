package id.ijs.volumequicktile

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import id.ijs.volumequicktile.VolumeTileService

class VolumeTileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Intent(
            this,
            VolumeTileService::class.java
        ).also { intent -> startService(intent) }
        finish()
    }
}