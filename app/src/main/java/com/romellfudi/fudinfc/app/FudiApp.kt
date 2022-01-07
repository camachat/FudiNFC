/*
 * Copyright (c) 2021. BoostTag E.I.R.L. Romell D.Z.
 * All rights reserved
 * portfolio.romellfudi.com
 */

package com.romellfudi.fudinfc.app

import android.app.Application
import com.romellfudi.fudinfc.app.di.moduleNFC
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Fudi Permission Application
 *
 * @version 1.0.a
 * @autor Romell Domínguez (@romellfudi)
 * @date 4/1/21
 */
class FudiApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            //androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            printLogger(Level.ERROR)
            androidContext(this@FudiApp)
            modules(moduleNFC)
        }
    }
}