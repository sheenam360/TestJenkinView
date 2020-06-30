node {
   stage('Git checkout') { // for display purposes
      git 'https://github.com/sheenam360/TestJenkinView.git'
   }
   stage('Reg1') {
        try {
            sh "mvn clean test -DsuiteXmlFile=src/test/resources/xml/testng.xml
        } catch (err) {
            
        } finally {
           
        }
   }
  stage('Reg2') {
        try {
            sh "mvn clean test -DsuiteXmlFile=src/test/resources/xml/testng1.xml
        } catch (err) {
            
        } finally {
           
        }
   }
