pipeline {
  agent any
  stages {
    stage('CleanUp') {
      agent any
      steps {
        sh '''#!/bin/bash

cd /

DIR="/mnt/JENKINS_HOME/workspace/*"

if [ -d "$DIR" ]; then
  echo "Removing workspace..."
  rm -fr /mnt/JENKINS_HOME/workspace/*
else
  echo "WorkSpace ${DIR} non exists..."
  exit 1
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