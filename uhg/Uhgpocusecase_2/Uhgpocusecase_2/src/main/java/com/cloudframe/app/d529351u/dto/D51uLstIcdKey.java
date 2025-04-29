package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uLstIcdKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uLstIcdKey extends D51uLstIcdKeySerialized { 
   

						@Getter @Setter private char[] d51uLstClmIcdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uLstClmIcdPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uLstClmIcdSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uLstClmIcdCau = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uLstIcdKey
	**/
    public D51uLstIcdKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uLstIcdKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uLstIcdKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
