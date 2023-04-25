pipeline {
    agent any

    environment {
        JAVA_HOME = "${tool 'YOUR_JAVA_TOOL_NAME'}"
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the project...'
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
                // Add your deployment steps here.
            }
        }
    }
}
