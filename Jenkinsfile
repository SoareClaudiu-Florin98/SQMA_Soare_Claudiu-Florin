pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvnw test'
            }
            post{
                always{
                    junit '**/target/surefire-reports/TEST-TestCase1.xml'
                }
            }
        }
    }
}
