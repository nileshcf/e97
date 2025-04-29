package com.cloudframe.app.o529351u.dto;

/**
*  The class XrfRpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class XrfRpData extends XrfRpDataSerialized { 
   

						@Getter @Setter private char[] xrfPlcyRp = Field.fillLowValue(6);

								@Getter @Setter private short xrfDivRp;

								@Getter @Setter private short xrfClsRp;

						@Getter @Setter private char[] xrfSuffRp = Field.fillLowValue(2);
	
	/**
	* Constructor for XrfRpData
	**/
    public XrfRpData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for XrfRpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfRpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
