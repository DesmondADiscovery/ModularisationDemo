object TestLibraryDependencies {

    private object Versions {
        const val junit = "4.12"
        const val mockitoInline = "2.13.0"
        const val mockitoKotlinVersion = "2.1.0"
        const val assertJVersion = "3.11.1"
        const val mockKVersion = "1.9.2.kotlin12"
        const val archCore = "2.1.0"
        const val androidxJunit = "1.1.1"
    }

    const val junit = "junit:junit:${Versions.junit}"
    const val androidxJunit = "androidx.test.espresso:espresso-core:${Versions.androidxJunit}"
    const val archCoreTesting = "androidx.arch.core:core-testing:${Versions.archCore}"
    const val mockK = "io.mockk:mockk:${Versions.mockKVersion}"
    const val assertJVersion = "org.assertj:assertj-core:${Versions.assertJVersion}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlinVersion}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockitoInline}"
}

object InstrumentationTestDependencies {
    // TODO
}