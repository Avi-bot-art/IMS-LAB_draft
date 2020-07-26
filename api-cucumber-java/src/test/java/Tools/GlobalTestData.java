package Tools;

public class GlobalTestData{
	
	public static TestDriver com = new TestDriver();
	public static String TEST_DATA_SHEET = TestDriver.getConfiguration("TEST_ENVIRONMENT");
	public static String TEST_DATA_WORKBOOK=TestDriver.getProjectPath()+"\\TestData\\"+TestDriver.getConfiguration("TEST_DATA_WORKBOOK");
	public GlobalTestData()
	{		
	}	
	public static String TestScriptName = "";
	public static String RunStatus = "";
	
	
	public static void GetTestData(int Row) {

		RunStatus = TestDriver.getDatafromExcel(TEST_DATA_WORKBOOK,TEST_DATA_SHEET,Row, "RunStatus");
	    TestScriptName = TestDriver.getDatafromExcel(TEST_DATA_WORKBOOK,TEST_DATA_SHEET,Row, "TestScriptName");
	   
		
		
	}
}