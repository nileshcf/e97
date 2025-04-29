package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxaTrgtTaskUsr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TarafxaTrgtTaskUsr extends TarafxaTrgtTaskUsrSerialized { 
   

								@Getter @Setter private short tarafxaTrgtTaskUsrLen;

						@Getter @Setter private char[] tarafxaTrgtTaskUsrTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TarafxaTrgtTaskUsr
	**/
    public TarafxaTrgtTaskUsr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TarafxaTrgtTaskUsr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaTrgtTaskUsr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
