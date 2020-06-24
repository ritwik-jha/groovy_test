pipeline{
    agent any

    stages{
        stage('stage1'){
            steps{
                scripts{
                    echo 'stage1'
                }
            }
        }
        stage('stage2'){
            steps{
                scripts{
                    echo 'stage2'
                }
            }
        }
    }
}