package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar649UserParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ar649UserParms extends Ar649UserParmsSerialized { 
   

						@Getter @Setter private char[] ar649UserBulkId = new char[4];

						@Getter @Setter private char[] ar649UserEndptId = new char[7];

						@Getter @Setter private char[] ar649UserCyclNum = new char[3];
	
	/**
	* Constructor for Ar649UserParms
	**/
    public Ar649UserParms() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ar649UserParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar649UserParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr649UserBulkId(fillSpace(4));
								setAr649UserEndptId(fillSpace(7));
								setAr649UserCyclNum(fillSpace(3));
    } 



}
  
