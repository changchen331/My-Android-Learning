pluginManagement {
    repositories {

        // JAVA配置的配置
//        maven { url 'https://maven.aliyun.com/repository/central' }
//        maven { url 'https://maven.aliyun.com/repository/google' }
//        maven { url 'https://maven.aliyun.com/repository/gradle-plugin' }
//        maven { url 'https://maven.aliyun.com/repository/jcenter' }
//        maven { url 'https://maven.aliyun.com/repository/public' }
//        maven { setUrl("https://maven.aliyun.com/repository/central") }
//        maven { setUrl("https://maven.aliyun.com/repository/jcenter") }
//        maven { setUrl("https://maven.aliyun.com/repository/google") }
//        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
//        maven { setUrl("https://maven.aliyun.com/repository/public") }
//        maven { setUrl("https://jitpack.io") }

        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {

        // JAVA配置的配置
//        maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
//        maven { url 'http://maven.aliyun.com/nexus/content/repositories/jcenter' }
//        maven { url 'http://maven.aliyun.com/nexus/content/repositories/google' }
//        maven { url 'http://maven.aliyun.com/nexus/content/repositories/gradle-plugin' }
//        maven { url 'https://maven.aliyun.com/repository/central' }
//        maven { url 'https://maven.aliyun.com/repository/google' }
//        maven { url 'https://maven.aliyun.com/repository/gradle-plugin' }
//        maven { url 'https://maven.aliyun.com/repository/jcenter' }
//        maven { url 'https://maven.aliyun.com/repository/public' }
//        maven { setUrl("https://maven.aliyun.com/repository/central") }
//        maven { setUrl("https://maven.aliyun.com/repository/jcenter") }
//        maven { setUrl("https://maven.aliyun.com/repository/google") }
//        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
//        maven { setUrl("https://maven.aliyun.com/repository/public") }
//        maven { setUrl("https://jitpack.io") }

        google()
        mavenCentral()
    }
}

rootProject.name = "Test"
include(":app")
include(":chapter03")
