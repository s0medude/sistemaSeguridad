pipeline {
  agent any
  stages {
    stage('CleanUp') {
      steps {
        sh 'rm -rf /mnt/JENKINS_HOME/workspace'
      }
    }
    stage('Build') {
      steps {
        sh 'git clone git@github.com:s0medude/sistemaSeguridad.git'
      }
    }
  }
}