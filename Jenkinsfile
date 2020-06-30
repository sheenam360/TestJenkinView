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
			script{
				bat(/mvn clean test/)
			}
	}

	}
	}

}
