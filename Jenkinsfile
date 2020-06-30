pipeline{
	  environment {
       		env.PATH = env.PATH + ";c://Windows//System32"
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
				bat "dir"
			}
	}

	}
	}

}
