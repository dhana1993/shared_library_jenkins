def call() {
    loadLinuxScript(name: 'com')
    DIR="com"
if [ -d "$DIR" ]; then
  ### Take action if $DIR exists ###
  echo "Installing config files in ${DIR}..."
else
  ###  Control will jump here if $DIR does NOT exists ###
  echo "Error: ${DIR} not found. Can not continue."
    sh '''cp com .'''
  exit 1
fi
}
