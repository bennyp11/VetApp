pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'chmod +x ./mvnw'  // Add this line
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
                    // Add the Dockerfile directory in the docker.build command
                    dockerImage = docker.build("vet-app", "-f Dockerfile .")
                    dockerImage.run("-p 8081:8081")
                }
            }
        }
    }
}