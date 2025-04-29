package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503BdBulkDataTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503BdBulkDataTranLog extends Sf503BdBulkDataTranLogSerialized { 
   

						@Getter @Setter private char[] sf503BdBulkId = Field.fillLowValue(14);

						@Getter @Setter private char[] sf503BdMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] sf503BdPathId = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503BdStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503BdErrorCode = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503BdJulianDay = Field.fillLowValue(3);

						@Getter @Setter private char[] sf503BdTime = Field.fillLowValue(6);

								@Getter @Setter private long sf503BdNbr1kSpoolRcds;

								@Getter @Setter private long sf503BdNbrBytesTrans;

								@Getter @Setter private long sf503BdNbrBlocksTrans;
	
	/**
	* Constructor for Sf503BdBulkDataTranLog
	**/
    public Sf503BdBulkDataTranLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503BdBulkDataTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503BdBulkDataTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
