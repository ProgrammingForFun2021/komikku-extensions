plugins {
    id("lib-multisrc")
}

baseVersionCode = 5 + 2

dependencies {
    api(project(":lib:i18n"))
}
