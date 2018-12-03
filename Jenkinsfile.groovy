pipeline {
    agent any
	
    stages {
        stage('download') {
	    checkout scm
            steps {
                //echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				echo "downloading codes from GitHub"
            }
        }
    }
}
