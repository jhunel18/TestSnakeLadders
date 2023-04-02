package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.utility

import android.content.Context
import android.content.SharedPreferences
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.utility.PreferenceUtility


class PreferenceUtility {
    private var appPreferences: SharedPreferences? = null
    private val PREFS = "appPreferences"

    constructor(context: Context) {
        appPreferences = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
    }

    fun saveStringPreferences(key: String?, value: String?) {
        val prefsEditor = appPreferences!!.edit()
        prefsEditor.putString(key, value)
        prefsEditor.apply()
    }

    fun getStringPreferences(key: String?): String? {
        return appPreferences!!.getString(key, "")
    }
}