def call(Map config =[:]){
  loadLinuxScript(name: "helloWorld.groovy")
  bat './helloWorld.groovy ${config.name} ${config.dayOfWeek}.'
}
