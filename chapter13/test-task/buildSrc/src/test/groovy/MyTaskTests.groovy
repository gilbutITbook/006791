import org.junit.Test
import static org.junit.Assert.assertEquals
import groovy.ui.SystemOutputInterceptor
import org.gradle.testfixtures.ProjectBuilder

class MyTaskTests {
  @Test
  void helloWorldTest() {
    final project = ProjectBuilder.builder().build() // Gradle 프로젝트 작성
    final task = project.task("myTask", type: MyTask) // 테스트 대상 태스크 작성
    task.target = "world" // 태스크 속성 설정

    final actual = getStdOut {
      task.greet() // 테스트 대상 액션 실행
    }
    assertEquals "Hello, ${task.target}!".toString(), actual
  }

  private static String getStdOut(Closure proc) {
    def stdOut = ""
    final interceptor = new SystemOutputInterceptor({ stdOut += it; false })
    interceptor.start()
    proc()
    interceptor.stop()
    stdOut.trim()
  }
}

