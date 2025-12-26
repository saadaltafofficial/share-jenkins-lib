def call(String Project, String ImageTag, String dockerhubUser){
  withCredentials([usernamePassword('credentialsId': "dockerhub-cred",
                passwordVariable: "DOCKER_PASS",
                usernameVariable: "UNUSED_USER")]){
                    
                sh "docker login -u ${dockerhubUser} -p ${DOCKER_PASS}"
                sh "docker image tag notes-app:latest ${dockerhubUser}/notes-app:latest"
                sh "docker push ${dockerhubUser}/notes-app:latest"
                }
}
