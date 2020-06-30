pipeline{
	agent{
	node{
		'master'
		}
	}
    stages{
	stage('Regression1'){
	  
		git 'https://github.com/sheenam360/TestJenkinView.git'
		script{
			bat(/mvn clean test/)
		}	

	}
	}

}
