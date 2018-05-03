set projectLocation=/d "D:\workspace\AutomationStructure"

cd %projectLocation%

mvn clean test -DsuiteXmlFile=testng.xml