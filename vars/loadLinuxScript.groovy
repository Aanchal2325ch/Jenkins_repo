def call(Map config =[:]){
  def scriptcontents = libraryResource 'hello-world.pipeline'
  writeFile file="${config.name}", text: scriptcontents
  
}
