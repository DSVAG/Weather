object Dependencies {

    object AndroidX {
        const val Appcompat = "androidx.appcompat:appcompat:1.4.1"
        const val Core = "androidx.core:core-ktx:1.7.0"
    }

    object Compose {
        const val Version = "1.1.1"
        private const val AccompanistVersion = "0.23.1"

        const val Activity = "androidx.activity:activity-compose:1.4.0"

        const val Compiler = "androidx.compose.compiler:compiler:$Version"

        const val Ui = "androidx.compose.ui:ui:$Version"
        const val Tooling = "androidx.compose.ui:ui-tooling:$Version"
        const val Preview = "androidx.compose.ui:ui-tooling-preview:$Version"
        const val UiUtil = "androidx.compose.ui:ui-util:$Version"

        const val Foundation = "androidx.compose.foundation:foundation:$Version"

        const val Material = "androidx.compose.material:material:$Version"
        const val IconsCore = "androidx.compose.material:material-icons-core:$Version"
        const val IconsExtended = "androidx.compose.material:material-icons-extended:$Version"

        const val SwipeRefresh =
            "com.google.accompanist:accompanist-swiperefresh:$AccompanistVersion"

        const val Insets = "com.google.accompanist:accompanist-insets:$AccompanistVersion"
        const val InsetsUi = "com.google.accompanist:accompanist-insets-ui:$AccompanistVersion"
        const val UiController =
            "com.google.accompanist:accompanist-systemuicontroller:$AccompanistVersion"

        const val Pager = "com.google.accompanist:accompanist-pager:$AccompanistVersion"
        const val PagerIndicator =
            "com.google.accompanist:accompanist-pager-indicators:$AccompanistVersion"
    }

    object Kotlin {
        private const val Version = "1.6.10"

        const val StdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$Version"
        const val Stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$Version"
    }
}
