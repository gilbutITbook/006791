// buildSrc/src/test/groovy/GreetingPluginTests.groovy

import org.junit.Test
import static org.junit.Assert.assertTrue
import org.gradle.api.DefaultTask
import org.gradle.testfixtures.ProjectBuilder

class GreetingPluginTests {
  @Test
  void helloWorldTest() {
    final project = ProjectBuilder.builder().build() // Gradle 프로젝트 작성
    project.apply plugin: GreetingPlugin // 테스트 대상 플러그인 적용
    final task = project.tasks.greet // 플러그인에 의해 추가된 태스크 취득

    assertTrue(task instanceof DefaultTask)
  }
}

