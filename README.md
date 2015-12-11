## 예제 코드에 대해서

특별히 언급하지 않는 한 예제 코드는 JDK 8/Gradle 2.5를 기반으로 작성되었으나
장에 따라 전제 조건이 다른 경우가 있습니다.
각 장별 주의 사항은 아래를 참고해주세요.

# [1장]
예제 코드는 JDK 7/JDK 8 상의 Ant 1.9.4 / Maven 3.2.3에서 동작을 확인했습니다.


# [2장]
예제 코드가 없습니다.


# [3장]
예제 코드는 JDK 7/JDK 8상의 Gradle 2.5에서 동작을 확인했습니다.


# [4장]
예제 코드는 JDK 7을 전제로 작성했습니다.
JDK 8에서 실행하려면 빌드 스크립트 설정을 다음과 같이 변경해야 합니다(legacy-prj제외).

    // JDK 8용 설정
    sourceCompatibility = 1.8
    targetCompatibility = 1.8


# [5장]
특별한 주의 사항은 없습니다.


# [6장]
특별한 주의 사항은 없습니다.


# [7장]
특별한 주의 사항은 없습니다.

# [8장]
예제 코드는 JDK 7을 기반으로 작성했습니다.
JDK 8에서 실행하려면 빌드 스크립트 설정을 다음과 같이 변경해야 합니다(book-crud 제외)。

    // JDK 8용 설정
    sourceCompatibility = 1.8
    targetCompatibility = 1.8

* book-crud 프로젝트에 대해서

　이 예제 코드는 다음 버전에서 동작합니다. JDK8에서는 동작하지 않으니 주의하세요.
　JDK7, Gradle2.0 이상, Firefox 33.0

* 단위 테스트를 하려면
    
   gradle -b unit-build.gradle test

* 통합 테스트를 하려면
    
 gradle -Penv=integration integrationTest

* 시스템 테스트를 하려면(※)
    
  gradle -Penv=functional functionalTest

    (※) 테스트 종료 후에 Tomcat에서 예외가 발생할 수 있지만 테스트는 정상적으로 실시됩니다.
         이 예외는 Tomcat 플러그인의 문제로 수정하려면 build.gradle 를 다음과 같이 변경하면 됩니다.

      task tomcatStop4FunctionalTest(type: com.bmuschko.gradle.tomcat.tasks.TomcatStop) {
          stopPort = tomcatStopPort
          stopKey = tomcatStopKey
          doLast {
              Thread.sleep(1000)
          }
      }

# [9장]
예제 코드 없음.


# [10장]
예제 코드 없음.


# [11장]
예제 코드는 JDK 7/JDK 8을 기반으로 Gradle 2.5에서 동작을 확인했습니다.


# [12장]
특별한 주의 사항 없음.


# [13장]
빌드 비교 플러그인 예제에선 Gradle 1.12와 Gradle 2.5에서 동작을 확인했습니다.


# [14장]
특별한 주의 사항 없음.


# [부록]
Windows 환경에선
 "경고: Could not open/create prefs root node Software\JavaSoft\Prefs at root 0x80000002. Win dows RegCreateKeyEx(...) returned error code 5."
메시지가 표시될 수 있지만 동작에는 아무런 문제가 없습니다.


