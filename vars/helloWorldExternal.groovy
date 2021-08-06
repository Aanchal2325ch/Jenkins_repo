def call{Map config =[:]}{
  loadLinuxScript(name: "hello-world.groovy")
  bat "./hello-world.sh ${config.name} ${config.dayOfWeek}."
