pipeline {
    agent any
	checkout scm
    stages {
        stage('download') {
            steps {
                //echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				echo "downloading codes from GitHub"
            }
        }
    }
}
