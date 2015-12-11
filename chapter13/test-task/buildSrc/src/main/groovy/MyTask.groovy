import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MyTask extends DefaultTask {
    String target

    @TaskAction
    void greet() {
        println "Hello, $target!"
    }
}

