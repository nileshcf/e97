package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas7aPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WMcas7aPe8090m extends WMcas7aPe8090mSerialized { 
   


								@Getter @Setter private int wMcas72Pe8090m;

	
	/**
	* Constructor for WMcas7aPe8090m
	**/
    public WMcas7aPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WMcas7aPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas7aPe8090m(Field parent,int begin) {
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
             , getStartOffset() + 3
             ,10
             );
    } 

	/**
	 * 	initializes WMcas7aPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas72Pe8090m(0);
   }


}
  
