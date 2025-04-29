package com.cloudframe.app.d529351u.dto;

/**
*  The class Db2ReqDosDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Db2ReqDosDateRedefined extends Db2ReqDosDateRedefinedSerialized { 
   

						@Getter @Setter private char[] db2DosYyyy = Field.fillLowValue(4);

						@Getter @Setter private char[] db2Dash1 = Field.fillLowValue(1);

						@Getter @Setter private char[] db2DosMm = Field.fillLowValue(2);

						@Getter @Setter private char[] db2Dash2 = Field.fillLowValue(1);

						@Getter @Setter private char[] db2DosDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Db2ReqDosDateRedefined
	**/
    public Db2ReqDosDateRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Db2ReqDosDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Db2ReqDosDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
