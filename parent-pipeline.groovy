@Library('mylib@master')_
pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo 'PARENT PIPELINE RUNNING'
                echo getEnvironment('dev').toString()
                echo 'CALLING SUB PIPELINE'
                buildAndPrint('Child Job')
                echo 'SUB PIPELINE FINISHED'
            }
        }
    }
    
    post {
        success {
            echo 'SUCCESS'
        }
    }
}
