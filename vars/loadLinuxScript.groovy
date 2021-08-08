def call(Map config =[:]){
  def scriptcontents = libraryResource "script/linux/${config.name}"
  writeFile file="${config.name}", text: scriptcontents
  println "chmod a+x ./${config.name}"

  
}
