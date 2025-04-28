package com.cloudframe.app.cfsort09.file.records;

/**
*  The class TestdataRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort09.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TestdataRecord extends TestdataRecordSerialized {
   

								private int testdataKeyComp5;
	
	/**
	* Constructor for TestdataRecord
	**/
    public TestdataRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of testdataKeyComp5
	 *	@return testdataKeyComp5
	 */
	public int getTestdataKeyComp5() throws CFException {
        if (isTestdataKeyComp5Modified()) { 
           testdataKeyComp5 = refreshTestdataKeyComp5();
        }
   		return testdataKeyComp5;
	}
	
	/**
	 * 	Update TestdataKeyComp5 with the passed value
	 *  Corresponding COBOL Variable is TESTDATA-KEY-COMP-5
	 *	@param number
	 */
	public void setTestdataKeyComp5(int number) {
	     // Truncate if the number is beyond +/- Max range
	    testdataKeyComp5 = checkTestdataKeyComp5MaxLimit(number); 
		serializeTestdataKeyComp5(testdataKeyComp5);
	}


	public void setTestdataKeyComp5(long number) {
	    number = checkTestdataKeyComp5MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTestdataKeyComp5((int)number);
	}
	

	
	
	

		public static int getTestdataRecordFieldLength() {
			return TESTDATA_RECORD_LENGTH;
		}

}
  
