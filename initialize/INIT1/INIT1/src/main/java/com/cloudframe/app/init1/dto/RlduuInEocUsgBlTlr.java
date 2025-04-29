package com.cloudframe.app.init1.dto;

/**
*  The class RlduuInEocUsgBlTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlduuInEocUsgBlTlr extends RlduuInEocUsgBlTlrSerialized { 
   

						@Getter @Setter private char[] rlduuFiller = Field.fillLowValue(971);
	
	/**
	* Constructor for RlduuInEocUsgBlTlr
	**/
    public RlduuInEocUsgBlTlr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlduuInEocUsgBlTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
