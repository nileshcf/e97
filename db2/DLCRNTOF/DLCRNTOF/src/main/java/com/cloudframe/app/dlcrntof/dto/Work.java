package com.cloudframe.app.dlcrntof.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private char[] sqlcode_Ws = Field.fillLowValue(4);

								@Getter @Setter private short secnt;

								@Getter @Setter private char[] dispSecnt = Field.fillLowValue(4);

								@Getter @Setter private short chkpFreq;

								@Getter @Setter private short deleteCnt;

								@Getter @Setter private int recordsLoaded400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setChkpFreq((short)100);
								setRecordsLoaded400(0);
    }





}
  
