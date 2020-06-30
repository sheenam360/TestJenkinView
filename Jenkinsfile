pipeline {
    agent any
    tools { 
        maven 'Maven 3.6.3' 
        jdk 'jdk1.8' 
        git 'Git'
    }
    stages {
          stage ('Git checkout') { // for display purposes
                git 'https://github.com/sheenam360/TestJenkinView.git'
         }
        
        stage ('Initialize') {
            steps {
                bat '''
                    "mvn clean test -DsuiteXmlFile=src/test/resources/xml/testng.xml"
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
