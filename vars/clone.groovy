def call(String GithubUrl, String Branch){
    git url: "${GithubUrl}", branch: "${Branch}"
}