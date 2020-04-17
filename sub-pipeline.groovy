pipeline {
   agent any
   stages {
      stage ('sub pipeline'){
         parallel{
            stage('sub pipeline stage 1') {
               agent any
               echo 'sub pipeline stage 1 executed'
            }
            stage('sub pipeline stage 2') {
               agent any
               echo 'sub pipeline stage 2 executed'
            }
            stage('sub pipeline stage 3') {
               agent any
               echo 'sub pipeline stage 3 executed'
            }
            stage('sub pipeline stage 4') {
               agent any
               echo 'sub pipeline stage 4 executed'
            }
         }
      }
   }
}
