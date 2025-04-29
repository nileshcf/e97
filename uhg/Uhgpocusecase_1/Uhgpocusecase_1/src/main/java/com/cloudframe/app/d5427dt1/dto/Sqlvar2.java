package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Sqlvar2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sqlvar2 extends Sqlvar2Serialized { 
   

								@Getter @Setter private int sqlvar2Reserved1;

								@Getter @Setter private int sqllonglen;
	
	/**
	* Constructor for Sqlvar2
	**/
    public Sqlvar2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sqlvar2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
