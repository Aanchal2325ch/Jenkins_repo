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
		// load parameters
		s.parameterMap.put(key.toString().trim(), value.toString().trim());
        } else if (paramArray.length == 1) {
           s.parameterMap.put(key.toString().trim(), "");
	}
		
	}	
	println s.parameterMap
	
	

}
def readPropertyFile(p){
	def prop=readProperties file:'vars/my.properties'
	for(param in prop){
		String[] myArray=param.split(":", 2)
		println p.prop.propertyFileMap.put(myArray[0],myArray[1])
		println p.prop.propertyFileMap
	}
	//prop.each
	//{
	//	line-> println line
		
		// String[] myArray=param.split(":", 2)
		//println myparent.propertyFileMap.put(myArray[0],myArray[1])
		// println myparent.propertyFileMap
	//}

}
