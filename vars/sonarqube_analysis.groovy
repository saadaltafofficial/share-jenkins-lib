def call(String toolName, String projectKey, String projectName) {
    withSonarQubeEnv(toolName) {
        sh """
            sonar-scanner \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.projectName=${projectName} \
                -Dsonar.sources=.
        """
    }
}
