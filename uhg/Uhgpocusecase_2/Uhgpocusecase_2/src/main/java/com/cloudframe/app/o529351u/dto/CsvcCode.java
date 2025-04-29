package com.cloudframe.app.o529351u.dto;

/**
*  The class CsvcCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CsvcCode extends CsvcCodeSerialized { 
   

								@Getter @Setter private long csvcCode1st5;

								@Getter @Setter private int csvcCodeLst1;
	
	/**
	* Constructor for CsvcCode
	**/
    public CsvcCode() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CsvcCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CsvcCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
