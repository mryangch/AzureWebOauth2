node {
    stage('Download') {
        checkout scm
        echo 'Downloading codes...'
    }
    stage('Build') {
        echo 'Build project...'
    }
    stage('Test') {
        echo 'Run test cases...'
    }
    stage('Deploy') {
        echo 'Deploy package...'
    }
}
