@Library('mylib')_
pipeline {
   agent any
   stages {
      stage ('sub pipeline'){
         parallel{
            stage('sub pipeline stage 1') {
               agent any
               steps{
                 echo getEnvironment('prod').toString()
               }
            }
            stage('sub pipeline stage 2') {
               agent any
               steps{
                 echo getEnvironment('dev-staging').beanstalkEnv
               }
            }
         }
      }
   }
}
