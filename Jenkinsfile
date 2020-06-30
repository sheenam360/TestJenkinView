pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
}
    stages{
    stage('Git checkout') { // for display purposes
          git 'https://github.com/sheenam360/TestJenkinView.git'
       }
       stage('Reg1') {
                bat "clean test -DsuiteXmlFile='src/test/resources/xml/testng.xml"
             }
      stage('Reg2') {
                bat "clean test -DsuiteXmlFile='src/test/resources/xml/testng1.xml"
       }
    }
}
