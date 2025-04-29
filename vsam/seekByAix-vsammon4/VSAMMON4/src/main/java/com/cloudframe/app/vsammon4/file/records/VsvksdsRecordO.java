package com.cloudframe.app.vsammon4.file.records;

/**
*  The class VsvksdsRecordO is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class VsvksdsRecordO extends VsvksdsRecordOSerialized {
   

								@Getter @Setter private long vskOPrimaryKey;

						@Getter @Setter private char[] vskOSysid = Field.fillLowValue(4);

								@Getter @Setter private int vskOTaskNo;

								@Getter @Setter private int vskOReqSize;

						@Getter @Setter private char[] vskOVarStruct = Field.fillLowValue(200);
	
	/**
	* Constructor for VsvksdsRecordO
	**/
    public VsvksdsRecordO() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
