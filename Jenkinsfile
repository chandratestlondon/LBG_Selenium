pipeline {
    agent any
    
    stages {
  stage('Check out git') {
    steps {
      echo 'Checking out the code'
      git branch: 'main', url: 'https://github.com/chandratestlondon/LBG_Selenium.git'
    }
  }
  
    stage('install maven') {
    steps {
        echo 'Maven install...'
        withMaven(maven: 'MAVAN') {
    // some block
}
    }
  }

  stage('Testing build') {
    steps {
        echo 'Testing...'
        bat 'cucmberbatch.bat'
    }
  }

  stage('reports') {
    steps {
        echo 'Cucmber reports...'
        cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
    }
  }

}

    
}
