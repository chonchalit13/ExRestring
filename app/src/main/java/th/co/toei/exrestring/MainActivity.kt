package th.co.toei.exrestring

import android.os.Bundle
import android.util.Log
import com.akexorcist.localizationactivity.core.LocalizationActivityDelegate
import dev.b3nedikt.app_locale.AppLocale
import dev.b3nedikt.reword.Reword
import th.co.toei.exrestring.databinding.ActivityMainBinding
import java.util.*

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private val localizationDelegate = LocalizationActivityDelegate(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("toei1","${AppLocale.currentLocale}")

        binding.btnClick.setOnClickListener {
//            if (localizationDelegate.getLanguage(this).language == "th") {
//                setLanguage(Locale.ENGLISH)
//            } else {
//                setLanguage(Locale("th", "TH"))
//            }
            Log.e("toei2","${AppLocale.currentLocale}")

            if (AppLocale.currentLocale.language == "th") {
                AppLocale.desiredLocale = Locale.ENGLISH
            } else {
                AppLocale.desiredLocale = Locale("th", "TH")
            }

            Log.e("toei3","${AppLocale.currentLocale}")

            val rootView = window.decorView.rootView
            Reword.reword(rootView)
        }
    }
}