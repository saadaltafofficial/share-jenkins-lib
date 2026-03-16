def call(String toolName, String projectKey, String projectName) {
    def scannerHome = tool name: toolName, type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv(toolName) {
        sh """
            ${scannerHome}/bin/sonar-scanner \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.projectName=${projectName} \
                -Dsonar.sources=.
        """
    }
}
