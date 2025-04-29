package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas6Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WMcas6Pe8090m extends WMcas6Pe8090mSerialized { 
   


								@Getter @Setter private int wMcas61Pe8090m;

						@Getter @Setter private char[] wMcas6pPe8090m = Field.fillLowValue(10);
	
	/**
	* Constructor for WMcas6Pe8090m
	**/
    public WMcas6Pe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WMcas6Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas6Pe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (" DE ").toCharArray()
             , getStartOffset() + 0
             ,4
             );
    } 

	/**
	 * 	initializes WMcas6Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas61Pe8090m(0);
         setWMcas6pPe8090m(CONSTANTS.SPACE_10);
   }


}
  
