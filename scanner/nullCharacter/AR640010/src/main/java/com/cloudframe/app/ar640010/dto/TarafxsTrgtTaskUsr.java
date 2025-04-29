package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxsTrgtTaskUsr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TarafxsTrgtTaskUsr extends TarafxsTrgtTaskUsrSerialized { 
   

								@Getter @Setter private short tarafxsTrgtTaskUsrLen;

						@Getter @Setter private char[] tarafxsTrgtTaskUsrTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TarafxsTrgtTaskUsr
	**/
    public TarafxsTrgtTaskUsr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TarafxsTrgtTaskUsr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsTrgtTaskUsr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
