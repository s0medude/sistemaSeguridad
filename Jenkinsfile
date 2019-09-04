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
        sh '''DIR="/mnt/JENKINS_HOME/workspace"
if [ -d "$DIR" ]; then
  echo "Removing workspace..."
  rm -fr /mnt/JENKINS_HOME/workspace/
else
  echo "Error: ${DIR} not found. Can not continue."
  exit 1
fi'''
      }
    }
  }
}