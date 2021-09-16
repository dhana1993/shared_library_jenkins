def call(){
    def DIR= libraryResource "com"
    sh''' 
    
   if [ -d "$DIR" ]; then
  ### Take action if $DIR exists ###
  echo "Installing config files in ${DIR}..."
else
  
  cp libraryResource "com" .
  exit 1
fi
    '''
}
