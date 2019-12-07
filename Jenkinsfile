pipeline {
    agent { 
        label 'docker' 
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('dockerize') {
            steps {
                sh 'docker build . -t jenkinsworkshop:1.0-SNAPSHOT'
            }
        }
    }
} 
