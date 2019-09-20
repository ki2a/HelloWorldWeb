pipeline
{
agent any

tools { 
        maven 'jenkins-maven' 
        jdk 'jdk8' 
    }
options {
  buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '10', daysToKeepStr: '', numToKeepStr: '10')
}

stages
{
    stage ("Checkout scm")
	{
		steps
		{
		   checkout scm
		}
	}
	stage ("Initialize")
	{ 	
	steps 
		{
		 sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
		}
	}
	
	
	stage ("build")
	{
	 steps {
	  	sh 	" mvn clean compile  package"
	  
	 } 
	}
}
post
{
	always
	{
		//cleanWs cleanWhenSuccess: false
		 cleanWs(
                cleanWhenAborted: false,
                cleanWhenFailure: false,
                cleanWhenNotBuilt: false,
                cleanWhenSuccess: false,
                cleanWhenUnstable: false,
                deleteDirs: false
            )
	}
}
}
