pipeline {
    agent any
    tools { 
        maven 'Maven 3.6.3' 
        jdk 'jdk1.8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                bat '''
                    git 'https://github.com/sheenam360/TestJenkinView.git'
                ''' 
            }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}
