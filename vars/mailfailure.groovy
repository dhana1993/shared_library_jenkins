def call(){
    emailext body:'${SCRIPT,template="groovy-html.template"}\n SonarQube result URL:  "${MY_URL}" ',
                    mimeType: 'text/html',
                    to: "${EMAIL_TO}",
                    subject: 'Jenkins build information : $PROJECT_NAME - #$BUILD_NUMBER '
}
