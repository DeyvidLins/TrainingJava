node ('master'){
    try {
        stage('Clonando do Repositório'){
            checkout scm
        }

        stage('Executando o comando Java'){
            sh 'cd ..'
            sh 'pwd'
        }

    }catch(except){

        currentBuild.result = 'FAILURE'
        throw new Exception(exec)

    }finally {

    }
}