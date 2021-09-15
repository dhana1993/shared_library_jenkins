def call() {
     sh ''' sudo mkdir $(date +"%d-%m-%Y")-$BUILD_NUMBER   '''
}
