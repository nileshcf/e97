package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201CalcFeeInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201CalcFeeInfo extends Sys201CalcFeeInfoSerialized { 
   

						@Getter @Setter private char[] sys201CalcPayParty = Field.fillLowValue(3);

								@Getter @Setter private long sys201CalcFeeSetlAmt;

								@Getter @Setter private int sys201CalcFeeSetlCur;

						@Getter @Setter private char[] sys201CalcFeeDrCrInd = Field.fillLowValue(2);
	
	/**
	* Constructor for Sys201CalcFeeInfo
	**/
    public Sys201CalcFeeInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys201CalcFeeInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201CalcFeeInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
