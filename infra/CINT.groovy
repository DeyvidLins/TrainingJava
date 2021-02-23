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

        stage('Instalação do sfdx'){
            sh 'wget https://developer.salesforce.com/media/salesforce-cli/sfdx-cli/channels/stable/sfdx-cli-linux-x64.tar.xz'
            sh 'pwd'
        }

        stage('Instalação do sfdx'){            
            sh 'mkdir sfdx'
            sh 'apt-get install xz-utils'
            sh 'tar xJf sfdx-cli-linux-x64.tar.xz -C sfdx --strip-components 1'
            sh './sfdx/install'
            sh 'sfdx'
        }


        
        
       

    }catch(except){

        currentBuild.result = 'FAILURE'
        throw new Exception(exec)

    }finally {

    }
}