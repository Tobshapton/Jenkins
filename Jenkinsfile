pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'curl -k -X POST "https://partner.testinsights.io/api/apikey/1R0_mB8hMfPNex860y34u1ftR/project/release/published-test-suite/45/execute"'
      }
    }

  }
}