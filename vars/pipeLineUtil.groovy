def validate(name)
{
	println "HI this is ${name} "
	println "method successfull run"
}
boolean validateMandatoryFields(prop)
{
	def propertyNames= prop.propertyNames()
	if(InputParameters==null || InputParameters.toString().trim().isEmpty())
	{
		throwError("InputParameter"+pipeLineConstants.ERROR_MESSAGE)
	}
	while (propertyNames.hasMoreElements()) {
	  String key = propertyNames.nextElement()
	  def err=key+pipeLineConstants.ERROR_MESSAGE
	  if(!InputParameters.toString().contains(key))
	  {
		  throwError(err)
	  } else {
		  String propertyName = InputParameters.substring(InputParameters.indexOf(key)+key.toString().length()+1)
		  println propertyName
		  if(propertyName.contains("\n")) {
			   propertyName = propertyName.substring(0,propertyName.indexOf("\n"))
			}else
		   {
		   propertyName = propertyName.substring(0)
		   }
		   if(propertyName==null || propertyName.toString().trim().isEmpty()|| propertyName.trim().contentEquals(";")) {
			 throwError(err)
	  }
	}
	}
}
