def call(String jobName){
    buildResult = build job: jobName
    print buildResult.getRawBuild().getLog()
}
