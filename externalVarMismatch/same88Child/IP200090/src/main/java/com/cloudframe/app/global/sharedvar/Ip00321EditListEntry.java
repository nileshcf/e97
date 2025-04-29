package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321EditListEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00321EditListEntry extends Ip00321EditListEntrySerialized { 
   

	
	/**
	* Constructor for Ip00321EditListEntry
	**/
    public Ip00321EditListEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00321EditListEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321EditListEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00321EditListEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
   }


}
  
