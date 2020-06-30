pipeline{
	  environment {
		 M2_HOME="D://apache-maven-3.6.3"
		 JAVA_HOME="C://Program Files//Java//jdk1.8.0_181"
       		 PATH= ";c://Windows//System32;D://apache-maven-3.6.3//bin;C://Program Files//Java//jdk1.8.0_181//bin"
  	 }
	agent{
		node{
			label 'master'
			
		   }
	}
    stages{
	stage('Regression1'){
		steps{
			git 'https://github.com/sheenam360/TestJenkinView.git'
			script{
				bat "mvn clean test -DsuiteXmlFile=src\test\resources\xml\testng.xml"
			}
	}

	}
	}

}
