def call(Map config =[:]){
  def scriptcontents = libraryResource "resource/script/linux/${config.name}"
  writeFile file="${config.name}", text: scriptcontents
  
  
}
