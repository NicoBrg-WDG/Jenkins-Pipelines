@Library('mylib@master')_
pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo 'PARENT PIPELINE RUNNING'
                echo getEnvironment('dev').toString()
                echo 'CALLING SUB PIPELINE'
                some_var = build job: 'Child Job'
                log = Jenkins.getInstance().getItemByFullName('Child Job').getBuildByNumber(some_var.getNumber()).logFile.text
                echo log
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
