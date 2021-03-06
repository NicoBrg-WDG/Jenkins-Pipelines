def call(String name){
        environments = [
                dev: [
                        beanstalkEnv: 'DEVELOPMENT',
                        frontConfig: 'dev'
                ],
                devstaging: [
                        beanstalkEnv: 'DEV-STAGING',
                        frontConfig: 'dev-staging'
                ],
                demo: [
                        beanstalkEnv: 'DEMO',
                        frontConfig: 'demo'
                ],
                prod: [
                        beanstalkEnv: 'PRODUCTION',
                        frontConfig: 'prod'
                ]
        ]
        return environments.get(name)
}
