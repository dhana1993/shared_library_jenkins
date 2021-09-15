//def call(Map config = [:]) {
  //  sh "echo NAME: ${config.name}  . PASSWORD: ${config.password}."
//}
def call(){
    sh 'echo NAME: ${EXAMPLE_CREDS_USR}  . PASSWORD:${EXAMPLE_CREDS_PSW}.'
}
