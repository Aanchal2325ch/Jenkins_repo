def call(Map config =[:]){
  loadLinuxScript(name: "hello-world.bat")
  bat "./hello-world.bat ${config.name} ${config.dayOfWeek}."
}
