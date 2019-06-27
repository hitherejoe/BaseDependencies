package org.buffer.android.basedependencies

object BaseVersions {
    val kotlin = "1.2.71"
}

open class BaseDeps {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jre8:${BaseVersions.kotlin}"
}