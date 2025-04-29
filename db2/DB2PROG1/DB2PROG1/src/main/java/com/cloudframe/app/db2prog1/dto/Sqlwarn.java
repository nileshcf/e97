package com.cloudframe.app.db2prog1.dto;

/**
*  The class Sqlwarn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sqlwarn extends SqlwarnSerialized { 
   

						@Getter @Setter private char[] sqlwarn0 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn1 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn2 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn3 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn4 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn5 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn6 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn7 = Field.fillLowValue(1);
	
	/**
	* Constructor for Sqlwarn
	**/
    public Sqlwarn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sqlwarn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlwarn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
