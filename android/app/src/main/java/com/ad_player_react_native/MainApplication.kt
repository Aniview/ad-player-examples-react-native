package com.ad_player_react_native

import android.app.Application
import android.graphics.Color
import com.adservrs.adplayer.AdPlayer.initializeAdPlayer
import com.adservrs.adplayer.AdPlayer.initializePublisher
import com.facebook.react.PackageList
import com.facebook.react.ReactApplication
import com.facebook.react.ReactHost
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.load
import com.facebook.react.defaults.DefaultReactHost.getDefaultReactHost
import com.facebook.react.defaults.DefaultReactNativeHost
import com.facebook.soloader.SoLoader

class MainApplication : Application(), ReactApplication {

    override val reactNativeHost: ReactNativeHost =
        object : DefaultReactNativeHost(this) {
            override val isNewArchEnabled = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED
            override val isHermesEnabled = BuildConfig.IS_HERMES_ENABLED

            override fun getJSMainModuleName(): String = "index"
            override fun getUseDeveloperSupport(): Boolean = BuildConfig.DEBUG

            override fun getPackages(): List<ReactPackage> {
                val list = PackageList(this).packages
                list.add(MainPackage)
                return list
            }
        }

    override val reactHost: ReactHost
        get() = getDefaultReactHost(applicationContext, reactNativeHost)

    override fun onCreate() {
        super.onCreate()

        initializeAdPlayer()
        initializePublisher(BuildConfig.AV_PUB_ID) {
            addTag(BuildConfig.AV_TAG_ID) {
                backgroundColor = Color.BLACK
            }
        }

        SoLoader.init(this, false)

        if (BuildConfig.IS_NEW_ARCHITECTURE_ENABLED) {
            // If you opted-in for the New Architecture, we load the native entry point for this app.
            load()
        }
    }
}
