package com.cloudframe.app.o529351u.dto;

/**
*  The class XrfEeDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class XrfEeDataKey extends XrfEeDataKeySerialized { 
   

								@Getter @Setter private int xrfMvdEe;

						@Getter @Setter private char[] xrfPlcyEe = Field.fillLowValue(6);


								@Getter @Setter private short xrfDivEe;

								@Getter @Setter private short xrfClsEe;
	
	/**
	* Constructor for XrfEeDataKey
	**/
    public XrfEeDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for XrfEeDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfEeDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
