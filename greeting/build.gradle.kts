plugins {
    id("com.gradle.plugin-publish") version "1.2.1"
    id("org.barfuin.gradle.taskinfo") version "2.1.0"
}

group = "com.example"
version = "1.0-SNAPSHOT"

gradlePlugin {
    plugins {
        create("greeting") {
            id = "com.example.greeting"
            implementationClass = "com.example.greeting.GreetingPlugin"
        }
    }
}
