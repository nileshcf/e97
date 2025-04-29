package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrIpaCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesrIpaCode extends FesrIpaCodeSerialized { 
   

								@Getter @Setter private int fesrIpaCd;
	
	/**
	* Constructor for FesrIpaCode
	**/
    public FesrIpaCode() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FesrIpaCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrIpaCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
