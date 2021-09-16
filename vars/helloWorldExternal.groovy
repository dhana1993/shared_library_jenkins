def call(){
    sh''' 
    def DIR= libraryResource 'com'
   if [ -d "$DIR" ]; then
  ### Take action if $DIR exists ###
  echo "Installing config files in ${DIR}..."
else
  ###  Control will jump here if $DIR does NOT exists ###
  echo "Error: ${DIR} not found. Can not continue."
  cp $DIR .
  exit 1
fi
    '''
}
