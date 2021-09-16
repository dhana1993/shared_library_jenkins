def call(){
    def request = libraryResource 'com'
    sh "
    if [ -d "${request}" ]; then
  ### Take action if $DIR exists ###
  echo "Installing config files in ccccccccccoooooommm "${request}"..."
else
  ###  Control will jump here if $DIR does NOT exists ###
  echo "Error: COCMMMMMMMMMM not found. Can not continue."
   cp "${request}" .
  exit 1
fi
"
}
