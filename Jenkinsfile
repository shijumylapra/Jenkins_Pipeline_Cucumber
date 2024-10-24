pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Checkout Source Code') {
            steps {
                // Get some code from a GitHub repository
                git "https://github.com/shijumylapra/JerkinsCucumber_OCT.git"
            }
        }

        stage('Run Test') {
            steps {
                // Run Maven on a Unix agent.
                //sh "mvn clean test -Dcucumber.filter.tags=@Simplilearn"

                // To run Maven on a Windows agent, use
                bat "mvn clean test -Dcucumber.filter.tags=@user_login"
            }

            post {
                always {
                    cucumber '**/cucumber.json'
                }
            }

        }
    }
}



