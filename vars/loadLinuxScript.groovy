def call(Map config =[:]){
  def scriptcontents = libraryResource "script/linux/${config.name}"
  writeFile file="${config.name}", text: scriptcontents
  sh "chmod a+x ./${config.name}"

  
}
