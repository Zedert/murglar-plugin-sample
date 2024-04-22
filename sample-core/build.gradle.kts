plugins {
    alias(catalog.plugins.murglar.plugin.core)
}

murglarPlugin {
    id = "sample"
    name = "Sample"
    version = "2"
    murglarClass = "com.badmanners.murglar.lib.sample.SampleMurglar"
}
