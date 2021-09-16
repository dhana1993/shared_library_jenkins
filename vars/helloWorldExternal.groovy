def call(){
    def request = libraryResource 'com'
    sh '  (  echo ${request}) '
}
