package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeMapEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip65504DeMapEntry extends Ip65504DeMapEntrySerialized { 
   

								@Getter @Setter private short ip65504DeStart;

								@Getter @Setter private short ip65504DeLngth;

								@Getter @Setter private int ip65504DeFirstSubfld;
	
	/**
	* Constructor for Ip65504DeMapEntry
	**/
    public Ip65504DeMapEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504DeMapEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeMapEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip65504DeMapEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504DeStart((short)0);
         	setIp65504DeLngth((short)0);
                     setIp65504DeFirstSubfld(0);
   }


}
  
