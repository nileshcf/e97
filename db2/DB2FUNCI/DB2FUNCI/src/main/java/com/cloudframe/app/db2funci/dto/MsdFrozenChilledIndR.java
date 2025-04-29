package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdFrozenChilledIndR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdFrozenChilledIndR extends MsdFrozenChilledIndRSerialized { 
   

						@Getter @Setter private char[] msdFcInd1 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdFcInd2 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdFcInd3 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdFcInd4 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdFcInd5 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdFcInd6 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdFcInd7 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdFcInd8 = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdFrozenChilledIndR
	**/
    public MsdFrozenChilledIndR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdFrozenChilledIndR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdFrozenChilledIndR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
