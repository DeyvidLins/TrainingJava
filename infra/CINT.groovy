node ('master'){
    try {
        stage('Clonando do Repositório'){
            checkout scm
            sh 'git clone https://github.com/DeyvidLins/TrainingJava.git'
            sh 'pwd'
        }

        stage('Instalando o Java'){            
            sh 'java Test.java'
        }

        stage('Verificando a Versão do Java e JavaC'){            
            sh 'java Test.java'
        }

        stage('Executando o comando Java'){            
            sh 'java Test.java'
        }

    }catch(except){

        currentBuild.result = 'FAILURE'
        throw new Exception(exec)

    }finally {

    }
}