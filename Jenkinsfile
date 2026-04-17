pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'Java'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/pujakohale/BDDCucumberProject.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Generate Report') {
            steps {
                bat 'dir target'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/**/*.*', fingerprint: true
        }
        success {
            echo 'Build Successful ✅'
        }
        failure {
            echo 'Build Failed ❌'
        }
    }
}