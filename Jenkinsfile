pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'git clone git@github.com:s0medude/sistemaSeguridad.git'
      }
    }
    stage('CleanUp') {
      steps {
        sh 'rm -rf /mnt/JENKINS_HOME/workspace'
      }
    }
  }
}