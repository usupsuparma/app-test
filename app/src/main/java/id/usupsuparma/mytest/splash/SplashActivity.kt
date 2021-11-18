package id.usupsuparma.mytest.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.usupsuparma.mytest.R
import id.usupsuparma.mytest.data.SessionPreference
import id.usupsuparma.mytest.login.LoginActivity
import id.usupsuparma.mytest.main.MainActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var sessionPreference: SessionPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        sessionPreference = SessionPreference(this)

        if (sessionPreference.isLogin()) {
            val moveIntent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(moveIntent)
        } else {
            val moveIntent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(moveIntent)
        }
    }
}