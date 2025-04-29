package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRetRuleFromtoSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRuleFromtoSvc extends D51uRetRuleFromtoSvcSerialized { 
   

						@Getter @Setter private char[] d51uFrtoDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uFrtoDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uFrtoDrvCau = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uFrtoClmFrmSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uFrtoClmToSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uFrtoSvcTypCd = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uRetRuleFromtoSvc
	**/
    public D51uRetRuleFromtoSvc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRuleFromtoSvc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleFromtoSvc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
