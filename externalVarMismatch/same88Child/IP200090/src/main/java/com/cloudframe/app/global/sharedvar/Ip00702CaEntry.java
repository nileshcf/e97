package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00702CaEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00702CaEntry extends Ip00702CaEntrySerialized { 
   

								@Getter @Setter private short ip00702CaStart;

								@Getter @Setter private short ip00702CaLength;
	
	/**
	* Constructor for Ip00702CaEntry
	**/
    public Ip00702CaEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00702CaEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00702CaEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00702CaEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp00702CaStart((short)0);
         	setIp00702CaLength((short)0);
   }


}
  
