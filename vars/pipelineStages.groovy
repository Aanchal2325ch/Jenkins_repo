def initStage(s,params)
{     // read parameters from job
	for (param in params) {
        String[] paramArray = param.split(":", 2)
		println paramArray
		println paramArray.length
        String key = paramArray[0]
		println key
        if (paramArray.length == 2) {
            String value = paramArray[1]
            println value
		// load parameters and store it into map
		s.parameterMap.put(key.toString().trim(), value.toString().trim());
        } else if (paramArray.length == 1) {
           s.parameterMap.put(key.toString().trim(), "");
	}
		
	}	
	println s.parameterMap
	
	

}
def readPropertyFile(p){
	//  read data from property file
	def prop=readProperties file:'vars/my.properties'
	println prop
	// read yml file
	def datas = readYaml file: 'vars/property/jenkins.yml1'
	println datas
	
        //p.scan_path = p.scanpathMap.containsKey(pipeLineConstants.scan_path,p.scanpathMap)
	//println p.scan_path
	
        def String env = parent.parameterMap.get(pipeLineConstants.ENVIRONMENT)
        def line = env.substring(0, env.indexOf("-"))
        def line = line.toUpperCase()
	
	
	

	//String[] propArray=prop.line.toString()
	//println propArray
	//for(param in prop){
	//	String[] myArray=param.split(":", 2)
	//	prop.each
	//	line-> println line
	//	println p.prop.propertyFileMap.put(myArray[0],myArray[1])
	//	println p.prop.propertyFileMap
	//}
	//prop.each
	//{
	//	line-> println line
		
		// String[] myArray=param.split(":", 2)
		//println myparent.propertyFileMap.put(myArray[0],myArray[1])
		// println myparent.propertyFileMap
	//}
	
	

}
