package com.cloudframe.app.cfsort09.file.records;

/**
*  The class TestdataRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TestdataRecord extends TestdataRecordSerialized {
   

								@Getter @Setter private int testdataKeyComp5;
	
	/**
	* Constructor for TestdataRecord
	**/
    public TestdataRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
