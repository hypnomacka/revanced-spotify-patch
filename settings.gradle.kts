include("dummy")

rootProject.name = "revanced-patches"

buildCache {
    local {
        isEnabled = !System.getenv().containsKey("CI")
    }
}

plugins {
      id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
  }
