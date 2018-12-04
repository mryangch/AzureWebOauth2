node {
    stage('Download') {
        checkout scm
        echo 'Downloading codes...'
    }
}
