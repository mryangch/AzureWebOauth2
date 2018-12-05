node {
    stage('Checkout') {
        checkout scm
        echo 'Downloading codes...'
    }
    stage('Build') {
        echo 'Build project...'
        //bat 'dotnet restore AzureWebOAuth2.sln'
	bat "\"${tool 'msbuild15.0'}\" AzureWebOAuth2.sln /t:Restore /p:Configuration=Release /p:Platform=\"Any CPU\""
    }
    stage('Archive') {
        echo 'Run test cases...'
        archiveArtifacts 'AzureWebOAuth2/bin/Release'
    }
    stage('Deploy') {
        echo 'Deploy package...'
    }
}
