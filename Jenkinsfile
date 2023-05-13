pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './mvnw clean package'
            }
        }
        stage('Test'){
            steps{
                echo 'Testing..'
                sh './mvnw test'
            }
        }
        stage('Docker Build and Run') {
            steps{
                script {
                    dockerImage = docker.build("vet-app")
                    dockerImage.run("-p 8080:8080")
                }
            }
        }
    }
}
