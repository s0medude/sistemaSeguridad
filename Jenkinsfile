pipeline {
  agent any
  stages {
    stage('CleanUp') {
      steps {
        sh 'rm -rf var/jenkins_home/workspace'
      }
    }
    stage('Build') {
      steps {
        sh 'git clone git@github.com:s0medude/sistemaSeguridad.git'
      }
    }
  }
}