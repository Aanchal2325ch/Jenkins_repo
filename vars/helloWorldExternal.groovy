def call(Map config =[:]){
  loadLinuxScript(name: 'hello-world.pipeline')
  println "./hello-world.pipeline ${config.name} ${config.dayOfWeek}"
}
