package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlduuInEocUsgBlHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlduuInEocUsgBlHdr extends RlduuInEocUsgBlHdrSerialized { 
   

						@Getter @Setter private char[] rlduuCustomerHeaderRec = Field.fillLowValue(989);
	
	/**
	* Constructor for RlduuInEocUsgBlHdr
	**/
    public RlduuInEocUsgBlHdr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlduuInEocUsgBlHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
