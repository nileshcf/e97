package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uRetRuleProvTyp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRuleProvTyp extends D51uRetRuleProvTypSerialized { 
   

						@Getter @Setter private char[] d51uPtypDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uPtypDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uPtypDrvCau = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uPtypProvTyp = Field.fillLowValue(2);
	
	/**
	* Constructor for D51uRetRuleProvTyp
	**/
    public D51uRetRuleProvTyp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRuleProvTyp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleProvTyp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
