def initStage(s,params)
{     
	for (param in params) {
        String[] paramArray = param.split(":", 2)
		println paramArray
		println paramArray.length
        String key = paramArray[0]
		println key
        if (paramArray.length == 2) {
            String value = paramArray[1]
            println value
		s.parameterMap.put(key.toString().trim(), value.toString().trim());
        } else if (paramArray.length == 1) {
           s.parameterMap.put(key.toString().trim(), "");
	}
		
	}	
	println s.parameterMap
	

}
