pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post{
                always{
                    junit '**/target/surefire-reports/TestCase1.txt'
                }
            }
        }
    }
}
