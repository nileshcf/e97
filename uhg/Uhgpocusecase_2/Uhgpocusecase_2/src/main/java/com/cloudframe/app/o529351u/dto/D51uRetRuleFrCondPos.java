package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uRetRuleFrCondPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRuleFrCondPos extends D51uRetRuleFrCondPosSerialized { 
   

						@Getter @Setter private char[] d51uFcndDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uFcndDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uFcndDrvCau = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uFcndFromCondPos = Field.fillLowValue(3);
	
	/**
	* Constructor for D51uRetRuleFrCondPos
	**/
    public D51uRetRuleFrCondPos() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRuleFrCondPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleFrCondPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
