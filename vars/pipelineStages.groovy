def initStage(params)
{     
	for (param in params) {
        String[] paramArray = param.split(":", 2)
        String key = paramArray[0]
		println key
        if (paramArray.length == 2) {
            String value = paramArray[1]
            println value
		parameterMap.put(key.toString().trim(), value.toString().trim());
	}
	}	
	

}
