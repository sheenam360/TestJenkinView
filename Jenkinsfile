pipeline{
	agent{
		node{
			label 'master'
		   }
	}
    stages{
	stage('Regression1'){
		steps{
	  
			git 'https://github.com/sheenam360/TestJenkinView.git'
			set M2_HOME = D:/apache-maven-3.6.3
			set PATH = D:/apache-maven-3.6.3/bin:%path%
			script{
				bat(/mvn clean test/)
			}
	}

	}
	}

}
