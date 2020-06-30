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
