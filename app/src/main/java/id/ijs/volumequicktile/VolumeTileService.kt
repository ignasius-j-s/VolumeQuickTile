package id.ijs.volumequicktile

import android.app.Service
import android.content.Intent
import android.media.AudioManager
import android.os.IBinder
import android.service.quicksettings.TileService

class VolumeTileService : TileService() {
    override fun onClick() {
        super.onClick()
        val audioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        audioManager.adjustStreamVolume(
            AudioManager.STREAM_MUSIC,
            AudioManager.ADJUST_SAME,
            AudioManager.FLAG_SHOW_UI
        )
    }
}