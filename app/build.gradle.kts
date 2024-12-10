import java.util.Properties

...

tasks.register("incrementVersion") {
    val propertiesFile = project.file("version.properties")
    val properties = Properties()
    propertiesFile.reader().use { reader ->
        properties.load(reader)
    }
    val versionPatch = properties.getProperty("VERSION_PATCH").toInt()
    properties.setProperty("VERSION_PATCH", (versionPatch + 1).toString())
    propertiesFile.writer().use { writer ->
        properties.store(writer, null)
    }
}
