package com.cloudframe.app.gp004760.dto;

/**
*  The class Gp004760CabTccArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class Gp004760CabTccArray extends Gp004760CabTccArraySerialized { 
   
      private List<char[]> gp004760AuthTxnCatCd; 

	
	/**
	* Constructor for Gp004760CabTccArray
	**/
    public Gp004760CabTccArray() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Gp004760CabTccArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Gp004760CabTccArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
