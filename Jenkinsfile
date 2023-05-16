pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'chmod +x ./mvnw' 
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
                    dockerImage = docker.build("vet-app", "-f Dockerfile .")
                    dockerImage.run("-p 8082:8082")
                }
            }
        }
    }
}