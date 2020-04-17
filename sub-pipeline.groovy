pipeline {
   agent any
   stages {
      stage ('sub pipeline'){
         parallel{
            stage('sub pipeline stage 1') {
               echo 'sub pipeline stage 1 executed'
            }
            stage('sub pipeline stage 2') {
               echo 'sub pipeline stage 2 executed'
            }
            stage('sub pipeline stage 3') {
               echo 'sub pipeline stage 3 executed'
            }
            stage('sub pipeline stage 4') {
               echo 'sub pipeline stage 4 executed'
            }
         }
      }
   }
}
