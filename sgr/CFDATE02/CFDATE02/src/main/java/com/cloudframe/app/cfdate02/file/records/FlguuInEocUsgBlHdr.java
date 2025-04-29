package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlguuInEocUsgBlHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FlguuInEocUsgBlHdr extends FlguuInEocUsgBlHdrSerialized { 
   

						@Getter @Setter private char[] flguuCustomerHeaderRec = Field.fillLowValue(989);
	
	/**
	* Constructor for FlguuInEocUsgBlHdr
	**/
    public FlguuInEocUsgBlHdr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FlguuInEocUsgBlHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlguuInEocUsgBlHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
