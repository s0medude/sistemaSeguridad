pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        sh 'git clone git@github.com:s0medude/sistemaSeguridad.git'
      }
    }
    stage('CleanUp') {
      steps {
        sh '''#!/bin/bash

DIR="/mnt/JENKINS_HOME/workspace"

if [ -d "$DIR" ]; then
  echo "Removing workspace..."
  rm -fr $DIR
else
  echo "Error: ${DIR} not found. Can not continue."
  exit 1
fi'''
      }
    }
  }
}