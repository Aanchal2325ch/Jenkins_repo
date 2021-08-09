def call(Map config =[:]){
  loadLinuxScript(name: 'hello-world.pipeline')
  echo './hello-world.pipeline ${config.name} ${config.dayOfWeek}'
}
