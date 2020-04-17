@Library('Constants')_
pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo 'PARENT PIPELINE RUNNING'
                echo Constants.environments.get('dev')
                //echo 'CALLING SUB PIPELINE'
                //build job: 'Child Job'
                //echo 'SUB PIPELINE FINISHED'
            }
        }
    }
    post {
        success {
            echo 'SUCCESS'
        }
    }
}
