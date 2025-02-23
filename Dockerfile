# 1. JDK 17이 포함된 기본 이미지 사용
FROM eclipse-temurin:17-jdk-alpine

# 2. 작업 디렉토리 생성
WORKDIR /app

# 3. Gradle 빌드 후 생성된 JAR 파일을 컨테이너로 복사
COPY build/libs/*.jar /app/app.jar

# 4. 컨테이너가 실행될 때 JAR 파일 실행
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
