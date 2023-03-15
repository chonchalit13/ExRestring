package th.co.toei.exrestring

import android.app.Application
import android.content.Context
import android.content.res.Resources
import com.akexorcist.localizationactivity.ui.LocalizationApplication
import dev.b3nedikt.restring.Restring
import dev.b3nedikt.reword.RewordInterceptor
import dev.b3nedikt.viewpump.ViewPump
import java.util.*

class Applications : Application() {
//    override fun getDefaultLanguage(context: Context): Locale =
//        if (Locale.getDefault() == Locale.ENGLISH) Locale.ENGLISH
//        else Locale("th", "TH")

    override fun onCreate() {
        super.onCreate()

//        AppLocale.supportedLocales = listOf(Locale.ENGLISH, Locale("th", "TH"))

        Restring.init(this)
        Restring.localeProvider = AppLocaleLocaleProvider

        ViewPump.init(RewordInterceptor)
    }

//    override fun getResources(): Resources {
//        return Restring.wrapResources(applicationContext, super.getResources())
//    }
}