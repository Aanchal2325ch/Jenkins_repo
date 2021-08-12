def initStage(name)
{
	pipeLineUtil.validate(name)
	def property=readProperties file:'vars/my.properties'
	property.each
	{
		line-> println line
	}
	println property
	println property['var1']
	println "successful"
}
