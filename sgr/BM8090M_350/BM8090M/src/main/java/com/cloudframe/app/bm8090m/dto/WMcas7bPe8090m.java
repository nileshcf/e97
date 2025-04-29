package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas7bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WMcas7bPe8090m extends WMcas7bPe8090mSerialized { 
   


								@Getter @Setter private int wMcas73Pe8090m;

	
	/**
	* Constructor for WMcas7bPe8090m
	**/
    public WMcas7bPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WMcas7bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas7bPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             (" PERSONAS ").toCharArray()
             , getStartOffset() + 4
             ,10
             );
    } 

	/**
	 * 	initializes WMcas7bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas73Pe8090m(0);
   }


}
  
