def call(Map config =[:]){
  def scriptcontents = libraryResource 'scripts/Linux/$config.name'
  writeFile file="${config.name}", text: scriptcontents
  println "chmod a+x ./${config.name}"

  
}
