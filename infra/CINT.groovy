node ('master'){
    try {
        stage('Clonando do Repositório'){
            checkout scm            
            
        }       

        stage('Verificando a Versão do Java e JavaC'){            
            sh 'javac Test.java'
            sh 'java Test'
        }
       

    }catch(except){

        currentBuild.result = 'FAILURE'
        throw new Exception(exec)

    }finally {

    }
}