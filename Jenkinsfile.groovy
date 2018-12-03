#!/usr/bin/env groovy Jenkinsfile
pipeline {
   stages{
   checkout scm
   stage('download') {
      checkout scm
       echo 'prepare step1'
       echo 'prepare step2'
   }
   stage('build') {
       echo 'build step1'
       echo 'build step2'
   }
   stage('deploy') {
       echo 'deploy step1'
       echo 'deploy step2'
   }
   }
}
