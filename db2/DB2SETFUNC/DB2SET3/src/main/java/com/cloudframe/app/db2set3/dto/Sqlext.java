package com.cloudframe.app.db2set3.dto;

/**
*  The class Sqlext is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sqlext extends SqlextSerialized { 
   

						@Getter @Setter private char[] sqlwarn8 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarn9 = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlwarna = Field.fillLowValue(1);

						@Getter @Setter private char[] sqlstate = Field.fillLowValue(5);
	
	/**
	* Constructor for Sqlext
	**/
    public Sqlext() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sqlext. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlext(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
