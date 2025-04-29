package com.cloudframe.app.db2funci.dto;

/**
*  The class HostAppCodeTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HostAppCodeTbl extends HostAppCodeTblSerialized { 
   

						@Getter @Setter private char[] hostAppCode01 = Field.fillLowValue(3);

						@Getter @Setter private char[] hostAppCode02 = Field.fillLowValue(3);

						@Getter @Setter private char[] hostAppCode03 = Field.fillLowValue(3);

						@Getter @Setter private char[] hostAppCode04 = Field.fillLowValue(3);

						@Getter @Setter private char[] hostAppCode05 = Field.fillLowValue(3);

						@Getter @Setter private char[] hostAppCode06 = Field.fillLowValue(3);

						@Getter @Setter private char[] hostAppCode07 = Field.fillLowValue(3);
	
	/**
	* Constructor for HostAppCodeTbl
	**/
    public HostAppCodeTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HostAppCodeTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HostAppCodeTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
