# LegacyLauncher

## This is base server launchWrapper
## Based on 'Mojang LegacyLauncher' revise

## How to build it.

### step 1.
### Enter the command on Microsoft Windows cmd.
```cmd
.\gradlew.bat publish
```

### Enter the command on Linux or MacOSX
```bash
.\gradlew publish
```

### Finally. It was in a named `target` folder.

## How to use it.

### step 1.
### add repo url
``` kotlin
repositories {
    mavenCentral()
}
```

### step 2.
### add Dependencies
```kotlin
implementation("net.kappamc:LegacyLauncher:1.0.0")
```
