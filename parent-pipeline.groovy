pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo 'RUNNING'
                echo 'LOADING SUB PIPELINE'
                load 'sub-pipeline.groovy'
            }
        }
    }
    post {
        success {
            echo 'SUCCESS'
        }
    }
}
