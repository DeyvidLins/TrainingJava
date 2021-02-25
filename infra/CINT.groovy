node ('master'){
    try {
        stage('Clonando do Repositório'){
            cleanWs()
            checkout scm            
            
        }       

        stage('Verificando a Versão do Java e JavaC'){            
            sh 'javac Test.java'
            sh 'java Test'
        }


        stage ('Listando as orgs'){
            sh 'sfdx force:org:list --all'
'

        }          
        
       

    }catch(except){

        currentBuild.result = 'FAILURE'
        throw new Exception(exec)

    }finally {

    }
}