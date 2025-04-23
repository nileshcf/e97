package com.cloudframe.app.cfsort09.file.records.serialize;

/**
*  The class TestdataRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TestdataRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TestdataRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TESTDATA_RECORD_LENGTH = 59;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTestdataKeyComp5;
	
	/**
	* Constructor for TestdataRecordSerialized
	**/
    public TestdataRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TestdataRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TESTDATA_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTestdataKeyComp5 = getStartOffset() + 55;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTestdataKeyComp5Counter = -1;
         public boolean isTestdataKeyComp5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTestdataKeyComp5Counter != sharedCounter;
            localTestdataKeyComp5Counter = sharedCounter; return hasModified; 
         }
   protected static final int TESTDATA_KEY_COMP_5_LEN = 4;
  	/**
	 * serializeTestdataKeyComp5
	 */
	protected void serializeTestdataKeyComp5(int testdataKeyComp5) {
           replaceValue( //  save the value as string
                   getBinaryString( testdataKeyComp5,TESTDATA_KEY_COMP_5_LEN)
                  ,beginTestdataKeyComp5
                  ,TESTDATA_KEY_COMP_5_LEN
                 );
            localTestdataKeyComp5Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTestdataKeyComp5MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTestdataKeyComp5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTestdataKeyComp5() {	 
			return (getInt(beginTestdataKeyComp5));
   	}




}
  
