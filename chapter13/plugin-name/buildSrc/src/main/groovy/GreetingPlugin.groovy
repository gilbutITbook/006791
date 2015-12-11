import org.gradle.api.*

class GreetingPlugin implements Plugin<Project> { // Plugin을 implement한 사용자 정의 플러그인 클래스
    void apply(Project project) { // 이 플러그인이 적용될 때 호출되는 메서드
        project.extensions.create("greeting", GreetingExtension) // 프로젝트에 greeting extension 추가
        project.task("greet") << { // 프로젝트에 'greet' 태스크 추가
            println "${project.greeting.greeting}, ${project.greeting.target}!"
        }
    }
}

class GreetingExtension {
    String greeting
    String target
    void message(greeting, target) {
        this.greeting = greeting
        this.target = target
    }
}

