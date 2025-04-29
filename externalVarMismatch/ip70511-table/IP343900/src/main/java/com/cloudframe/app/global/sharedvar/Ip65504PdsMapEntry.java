package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsMapEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip65504PdsMapEntry extends Ip65504PdsMapEntrySerialized { 
   

								@Getter @Setter private short ip65504PdsStart;

								@Getter @Setter private short ip65504PdsLngth;

								@Getter @Setter private int ip65504PdsFirstSubfld;
	
	/**
	* Constructor for Ip65504PdsMapEntry
	**/
    public Ip65504PdsMapEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504PdsMapEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsMapEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip65504PdsMapEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504PdsStart((short)0);
         	setIp65504PdsLngth((short)0);
                     setIp65504PdsFirstSubfld(0);
   }


}
  
