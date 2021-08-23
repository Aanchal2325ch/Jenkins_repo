import org.yaml.snakeyaml.Yaml


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
	pipeLineUtil.validateMandatoryFields(prop)
	// configuring environment
        def  String env = p.parameterMap.get(pipeLineConstants.ENVIRONMENT)
        def line = env.substring(0, env.indexOf("-"))
         line = line.toUpperCase()
	println env
	println line
	// read yml file
	def datas = readYaml file: 'vars/property/jenkins.yml1'
	println datas
	
	 p.customTestJobsFilePath = pipeLineConstants.YML_FILE_NAME
	   p.customYMLTestConfig = readYaml file: p.customTestJobsFilePath
	    println pipeLineConstants.project_name
	
	// Validating key in pipeline constants
        p.scan_path = p.parameterMap.containsKey(pipeLineConstants.project_name)
	println p.scan_path
	println p.parameterMap
	 println pipeLineConstants.project_name
	
}
