class Constants {
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
}

def getEnvironment(name) {
        return environments.get(name)
}
