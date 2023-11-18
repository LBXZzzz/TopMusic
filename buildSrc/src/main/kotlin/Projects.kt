object Version {
    const val applicationId = "cn.mrra.android"
    const val compileSdk = 32
    const val minSdk = 23
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "1.0"
}


object AndroidX {
    const val core = "androidx.core:core-ktx:1.7.0"
    const val appCompat = "androidx.appcompat:appcompat:1.4.1"

    object Lifecycle {
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"
    }

    object Room {
        const val room_version = "2.4.2"
        const val kapt = "androidx.room:room-compiler:$room_version"
        const val runtime = "androidx.room:room-runtime:$room_version"
        const val ktx = "androidx.room:room-ktx:$room_version"
    }

    object DataStore {
        const val data_store_version = "1.0.0-rc01"
        const val preference = "androidx.datastore:datastore-preferences:$data_store_version"
    }
}

object Navigation {
    const val nav_version = "2.5.3"
    const val fragment = "androidx.navigation:navigation-fragment:$nav_version"
    const val ui = "androidx.navigation:navigation-ui-ktx:$nav_version"
}

object AndroidTest {
    const val junit = "androidx.test.ext:junit:1.1.3"
    const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
}
object Text{
    const val junit ="junit:junit:4.13.2"
}

object KotlinX {
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
}

object RikkaX {
    const val appCompat = "dev.rikka.rikkax.appcompat:appcompat:1.5.0.1"
    const val core = "dev.rikka.rikkax.core:core:1.4.1"
    const val insets = "dev.rikka.rikkax.insets:insets:1.3.0"
    const val material = "dev.rikka.rikkax.material:material:2.5.1"
    const val materialPreference = "dev.rikka.rikkax.material:material-preference:2.0.0"
    const val mainSwitchBar = "dev.rikka.rikkax.widget:mainswitchbar:1.0.2"

    // If you want to use RikkaX API, you must
    //
    // add the following code to build.gradle
    // configurations.all {
    //     exclude group: 'androidx.appcompat', module: 'appcompat'
    // }
    //
    // or add the following code to build.gradle.kts
    // configurations.all {
    //     exclude("androidx.appcompat", "appcompat")
    // }
    //
    // Why? See https://github.com/RikkaApps/RikkaX/issues/8
}

object View {
    const val material = "com.google.android.material:material:1.5.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.3"
}

object Square {
    const val okhttp = "com.squareup.okhttp3:okhttp:5.0.0-alpha.10"
    const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
}

object Banner {
    const val banner1 = "com.github.donkingliang:CustomBanner:1.1.3"
    const val banner2 = "com.github.bingoogolapple:BGABanner-Android:3.0.1"
}
