pipeline {
    agent any

    tools {
        jdk 'jdk-21'
        maven 'Maven3.9.11'
    }

    environment {
            VERSION = "1.0.0" // Define la variable de versión
        }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/patriciasfo/ExamenMOC_PSF.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                }
            }
        }

        stage('Move jar') {
            steps{
                bat 'echo "Eliminando directorio versiones...."'
                bat 'if exist "versiones" (rd /s /q "versiones")'
                //bat 'rd /s /q "versiones" 2>null' // 2>null redirige los errores
            }
            post {
                success{
                    bat 'echo "Se crea el directorio versiones con la última versión de la api"'
                    bat 'mkdir versiones'
                    bat 'copy /Y "target/ExamenMOC_PSF-${VERSION}.jar" "versiones"'
                }
            }
        }

        /*stage('Deploy') {
            steps {
                bat """
                    echo "Starting deploy..."
                    java -jar target/ExamenMOC_PSF-${VERSION}.jar
                """
            }
        }*/
    }
}
