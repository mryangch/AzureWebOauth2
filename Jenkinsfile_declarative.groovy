pipeline {
    agent any
	
    stages {
        stage('download') {
	   
            steps {
                //echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				echo "downloading codes from GitHub"
            }
        }
    }
}
