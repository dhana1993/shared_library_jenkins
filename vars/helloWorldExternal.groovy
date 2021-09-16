def call(){
    def DIR= libraryResource "com/planetpope/scripts/linux/hello-world.sh"
    sh'''   echo "Installing config files in ${DIR}..."
  cp ${DIR} .
    '''
}
