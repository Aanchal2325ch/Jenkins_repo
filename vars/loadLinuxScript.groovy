def call(Map config =[:]){
  def scriptcontents = libraryResource 'scripts/Linux/hello-world.pipeline'
  writeFile file="${config.name}", text: scriptcontents
  println "chmod a+x ./${config.name}"

  
}
