package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.utility

import android.content.Context
import android.content.SharedPreferences

class PlayerNameUtility(context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("PlayerNameUtility", Context.MODE_PRIVATE)

    fun savePlayerNames(playerNames: Set<String>) {
        val editor = sharedPreferences.edit()
        editor.putStringSet("playerNames", playerNames)
        editor.apply()
    }

    fun getPlayerNames(): Set<String> {
        return sharedPreferences.getStringSet("playerNames", emptySet()) ?: emptySet()
    }

    fun addPlayerName(playerName: String) {
        val playerNames = getPlayerNames().toMutableSet()
        playerNames.add(playerName)
        savePlayerNames(playerNames)
    }
}
