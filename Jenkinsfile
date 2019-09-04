pipeline {
  agent any
  stages {
    stage('CleanUp') {
      agent any
      steps {
        sh '''DIR="/mnt/JENKINS_HOME/workspace"

if [ -d "$DIR" ]; then
  echo "Removing workspace..."
  rm -fr /mnt/JENKINS_HOME/workspace
else
  echo "workspace ${DIR} non exists..."
fi'''
      }
    }
    stage('Build') {
      steps {
        sh '''git clone git@github.com:s0medude/sistemaSeguridad.git
'''
      }
    }
  }
}