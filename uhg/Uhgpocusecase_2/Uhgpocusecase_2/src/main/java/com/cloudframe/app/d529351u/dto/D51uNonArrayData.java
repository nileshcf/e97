package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uNonArrayData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uNonArrayData extends D51uNonArrayDataSerialized { 
   

								@Getter @Setter private int d51uReturnCode;

								@Getter @Setter private int d51uInvReason;

								@Getter @Setter private int d51uErrTable;
				@Getter @Setter private D51uErrorTrace d51uErrorTrace = new D51uErrorTrace();

						@Getter @Setter private char[] d51uMoreRecordsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uMoreIcdRecords = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uMoreIcdSwitch = Field.fillLowValue(1);

								@Getter @Setter private long d51uNbrOfEntries;
				@Getter @Setter private D51uReturnSw d51uReturnSw = new D51uReturnSw();
	
	/**
	* Constructor for D51uNonArrayData
	**/
    public D51uNonArrayData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uNonArrayData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uNonArrayData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getD51uErrorTrace().setParent(this,getStartOffset() + 6);
					getD51uReturnSw().setParent(this,getStartOffset() + 38);
    } 



}
  
