package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRetRulCause is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRulCause extends D51uRetRulCauseSerialized { 
   

						@Getter @Setter private char[] d51uCausDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uCausDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uCausDrvCau = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd1 = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd2 = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd3 = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd4 = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd5 = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd6 = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd7 = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uCausClmCauseCd8 = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uRetRulCause
	**/
    public D51uRetRulCause() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRulCause. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCause(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
