import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider

class DependencyUtils {

    /**
     * Converts a {@link Provider} of {@link MinimalExternalModuleDependency}
     * into a string coordinate representing the dependency in standard
     * Gradle notation (i.e., "group:artifact:version").
     *
     * @param provider the provider of the dependency to convert
     * @return the Gradle-style coordinate string (without classifiers)
     */
    static String toString(Provider<MinimalExternalModuleDependency> provider) {
        var dep = provider.get()
        return "${dep.group}:${dep.name}:${dep.version}"
    }
}