package com.cloudframe.app.ip088030.file.records;

/**
*  The class Ip98152ClrSetlInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip98152ClrSetlInfo extends Ip98152ClrSetlInfoSerialized { 
   

						@Getter @Setter private char[] ip98152ClrMbrCurCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip98152ClrMbrCurExp = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip98152ClrSetlInfo
	**/
    public Ip98152ClrSetlInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip98152ClrSetlInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98152ClrSetlInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
