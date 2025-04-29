package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRetRulCpeFlg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRulCpeFlg extends D51uRetRulCpeFlgSerialized { 
   

						@Getter @Setter private char[] d51uCflgDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uCflgDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uCflgDrvCau = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCflgCpeDescCd = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uRetRulCpeFlg
	**/
    public D51uRetRulCpeFlg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRulCpeFlg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCpeFlg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
