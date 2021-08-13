def initStage(super,params)
{     
	for (param in params) {
        String[] paramArray = param.split(":", 2)
        String key = paramArray[0]
		println key
        if (paramArray.length == 2) {
            String value = paramArray[1]
            println value
		super.parameterMap.put(key.toString().trim(), value.toString().trim());
        } else if (paramArray.length == 1) {
           super.parameterMap.put(key.toString().trim(), "");
	}
		
	}	
	println super.parameterMap
	

}
