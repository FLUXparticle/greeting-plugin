package com.example.greeting;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GreetingPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        var extension = project.getExtensions().create("greeting", GreetingConfigExtension.class);

        extension.getName().convention("World");

        project.task("greeting").doLast(task -> {
            task.setGroup("greeting");
            String name = extension.getName().get();
            System.out.println("Hello " + name + "!");
        });
    }
}

