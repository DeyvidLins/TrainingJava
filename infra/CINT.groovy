node ('master'){
    try {
        stage('Clonando do Repositório'){
            sh 'git checkout scm'
        }

        stage('Executando o comando Java'){
            sh ''
        }

    }catch(exception e){

    }finally {

    }
}