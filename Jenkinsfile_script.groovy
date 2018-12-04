node {
    stage('Checkout') {
        checkout scm
        echo 'Downloading codes...'
    }
    stage('Build') {
        echo 'Build project...'
        bat 'nuget restore AzureWebOAuth2.sln'
	bat "\"${tool 'MSBuild'}\" AzureWebOAuth2.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /p:ProductVersion=1.0.0.${env.BUILD_NUMBER}"
    }
    stage('Archive') {
        echo 'Run test cases...'
        archive 'AzureWebOAuth2/bin/Release/**'
    }
    stage('Deploy') {
        echo 'Deploy package...'
    }
}
