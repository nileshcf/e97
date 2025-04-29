package com.cloudframe.app.db2varch.dto;

/**
*  The class BreqTitleGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BreqTitleGrp extends BreqTitleGrpSerialized { 
   

								@Getter @Setter private short breqTitleLen;

						@Getter @Setter private char[] breqTitleText = Field.fillLowValue(255);
	
	/**
	* Constructor for BreqTitleGrp
	**/
    public BreqTitleGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BreqTitleGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BreqTitleGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
