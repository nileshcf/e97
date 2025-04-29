package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uRetRuleIpa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRuleIpa extends D51uRetRuleIpaSerialized { 
   

						@Getter @Setter private char[] d51uRipaSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] d51uRipaDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uRipaDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uRipaDrvCau = Field.fillLowValue(1);

								@Getter @Setter private int d51uRipaClmIpa1Cd;

								@Getter @Setter private int d51uRipaClmIpa2Cd;

								@Getter @Setter private int d51uRipaClmIpa3Cd;

						@Getter @Setter private char[] d51uRipaGrpTbl1Nbr = Field.fillLowValue(4);

						@Getter @Setter private char[] d51uRipaGrpTbl2Nbr = Field.fillLowValue(4);

						@Getter @Setter private char[] d51uRipaGrpTbl3Nbr = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uRetRuleIpa
	**/
    public D51uRetRuleIpa() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRuleIpa. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleIpa(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
