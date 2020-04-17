pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo 'RUNNING'
                echo 'LOADING SUB PIPELINE'
                build job: 'Child Job'
            }
        }
    }
    post {
        success {
            echo 'SUCCESS'
        }
    }
}
