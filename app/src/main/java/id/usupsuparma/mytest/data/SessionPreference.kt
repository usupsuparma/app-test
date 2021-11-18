package id.usupsuparma.mytest.data

import android.content.Context

class SessionPreference(context: Context) {
        companion object {
            private const val PREFS_NAME = "user_pref"
            private const val IS_LOGIN = "login"
        }
        private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        fun setLogin(login: Boolean) {
            val editor = preferences.edit()
            editor.putBoolean(IS_LOGIN, login)
            editor.apply()
        }
        fun isLogin(): Boolean {
            return preferences.getBoolean(IS_LOGIN, false)
        }
    }
