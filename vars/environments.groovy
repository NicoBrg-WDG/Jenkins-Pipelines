test = 'plop'

def getEnvironments() {
return [
        dev: [
                beanstalkEnv: 'DEVELOPMENT',
                frontConfig: 'dev',
                frontGiftBucket: 'gift-front-dev-gift',
                frontAdminBucket: 'gift-front-dev-admin',
                notify: false
        ],
        devstaging: [
                beanstalkEnv: 'DEV-STAGING',
                frontConfig: 'dev-staging',
                frontGiftBucket: 'wedoogift-front-dev-staging-gift',
                frontAdminBucket: 'wedoogift-front-dev-staging-admin',
                notify: false
        ],
        demo: [
                beanstalkEnv: 'DEMO',
                frontConfig: 'demo',
                frontGiftBucket: 'wedoogift-front-demo-gift',
                frontAdminBucket: 'wedoogift-front-demo-admin',
                notify: true
        ],
        prod: [
                beanstalkEnv: 'PRODUCTION',
                frontConfig: 'prod',
                frontGiftBucket: 'wedoogift-front-app-gift',
                frontAdminBucket: 'wedoogift-front-app-admin',
                notify: true
        ]
]
