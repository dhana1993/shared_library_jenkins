def call(){

    sh ''' sudo mkdir ${BACKUP_PATH} && cp dist/NewFaveo.war ${BACKUP_PATH} '''

}