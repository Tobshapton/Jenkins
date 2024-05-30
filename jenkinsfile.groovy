pipeline {
    agent any
 
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Executing an HTTP GET request using curl
                sh '''
                    curl -X GET "https://partner.testinsights.io/api/apikey/1R0_mB8hMfPNex860y34u1ftR/project/release/published-test-suite/45/execute"
                '''
                // Add your build steps here, e.g., compile the code, run build tools
                // sh 'make' (if you're using make)
                // sh 'mvn clean install' (if you're using Maven)
            }
        }
 
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add your testing steps here, e.g., run unit tests, integration tests
                // sh 'make test' (if you're using make)
                // sh 'mvn test' (if you're using Maven)
            }
        }
 
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add your deployment steps here, e.g., deploy to a server, push Docker images
                // sh 'scp target/myapp.jar user@server:/path/to/deploy' (for SCP deployment)
                // sh 'docker push myimage:latest' (for Docker deployment)
            }
        }
    }
}