def call(Map config = [:]) {
    sh "echo NAME: ${config.name}  . PASSWORD: ${config.password}."
}