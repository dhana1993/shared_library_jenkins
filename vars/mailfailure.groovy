def call(){
    emailext body: "Hi team   \n Build is failed in  ${FAILED_STAGE} stage \n BUILD URL : ${BUILD_URL}  \n ",
            to: "${EMAIL_TO}",
            subject: 'Jenkins build information : $PROJECT_NAME - #$BUILD_NUMBER '
}