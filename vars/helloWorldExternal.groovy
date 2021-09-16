def call(){
    loadLinuxScript(name: 'com')
   
if [ -d "com" ]; then
  ### Take action if $DIR exists ###
  echo "Installing config files in ccccccccccoooooommm..."
else
  ###  Control will jump here if $DIR does NOT exists ###
  echo "Error: COCMMMMMMMMMM not found. Can not continue."
    sh '''cp com .'''
  exit 1
fi
}
