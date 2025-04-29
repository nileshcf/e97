package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01Fc2DataIndRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Bdms01Fc2DataIndRedefined extends Bdms01Fc2DataIndRedefinedSerialized { 
   

						@Getter @Setter private char[] bdms01Fc2Ind1 = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2Ind2 = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2Ind3 = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2Ind4 = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2Ind5 = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2Ind6 = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2Ind7 = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2Ind8 = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01Fc2DataIndRedefined
	**/
    public Bdms01Fc2DataIndRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01Fc2DataIndRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01Fc2DataIndRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
