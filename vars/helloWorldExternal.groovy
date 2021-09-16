def call(){
    sh''' 
    def DIR= libraryResource "com"
   if [ -d "$DIR" ]; then
  ### Take action if $DIR exists ###
  echo "Installing config files in ${DIR}..."
else
  
  cp $DIR .
  exit 1
fi
    '''
}
