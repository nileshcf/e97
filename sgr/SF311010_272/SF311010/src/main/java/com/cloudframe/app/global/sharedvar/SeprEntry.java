package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SeprEntry extends SeprEntrySerialized { 
   

								@Getter @Setter private int seprLength;

								@Getter @Setter private int seprOffset;
	
	/**
	* Constructor for SeprEntry
	**/
    public SeprEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SeprEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeprEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes SeprEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSeprLength(0);
                     setSeprOffset(0);
   }


}
  
