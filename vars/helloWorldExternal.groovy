def call(){
    def DIR= libraryResource "com"
    sh''' 
    
   if [ -d "$DIR" ]; then
  ### Take action if $DIR exists ###
  echo "Installing config files in ${DIR}..."
else
  
  cp $DIR .
  exit 1
fi
    '''
}
