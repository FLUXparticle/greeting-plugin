package com.example.greeting;

import org.gradle.api.provider.Property;

public abstract class GreetingConfigExtension {
  public abstract Property<String> getName();
}
