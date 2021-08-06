def call{Map config =[:]}{
  loadLinuxScript(name: "hello-world.groovy")
  echo "./hello-world.sh ${config.name} ${config.dayOfWeek}."
