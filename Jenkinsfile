pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''rm -rf var/jenkins_home/workspace'''
        sh 'git clone git@github.com:s0medude/sistemaSeguridad.git'
      }
    }
  }
}
