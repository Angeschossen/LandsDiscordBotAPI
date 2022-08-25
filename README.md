With the LandsDiscordBotAPI you can set your own linkmanager to integrate your own Discord link system. This can be done by accessing the LandsDiscordBotAPI class and using the setLinkManager method. You can create your own linkmanager by implementing the LinkManager interface.

[![](https://jitpack.io/v/Angeschossen/LandsDiscordBotAPI.svg)](https://jitpack.io/#Angeschossen/LandsDiscordBotAPI)

Include the API with Maven:

```xml

<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
<dependency>
    <groupId>com.github.angeschossen</groupId>
    <artifactId>LandsDiscordBotAPI</artifactId>
    <version>INSERT VERSION HERE</version>
    <scope>provided</scope>
</dependency>
</dependencies>
```

Include the API with Gradle:

```groovy
repositories {
	maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.angeschossen:LandsDiscordBotAPI:INSERT VERSION HERE"
}
```

Alternatively you can download the jar file from here: https://github.com/Angeschossen/LandsDiscordBotAPI/releases

## Integrating LandsDiscordBot

Please make sure to add softdepend: [LandsDiscordBot] to your plugin.yml.
All methods are available in the LandsDiscordBotAPI class. 

```
