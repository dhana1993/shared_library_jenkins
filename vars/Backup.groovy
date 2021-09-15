def call() {
     sh ''' sudo mkdir $(date +"%d-%m-%Y")-$BUILD_NUMBER && cp dist/NewFaveo.war $(date +"%d-%m-%Y")-$BUILD_NUMBER  '''
}
