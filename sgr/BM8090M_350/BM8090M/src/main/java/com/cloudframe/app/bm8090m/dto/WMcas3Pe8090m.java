package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas3Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WMcas3Pe8090m extends WMcas3Pe8090mSerialized { 
   


								@Getter @Setter private int wMcas31Pe8090m;

	
	/**
	* Constructor for WMcas3Pe8090m
	**/
    public WMcas3Pe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WMcas3Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas3Pe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (" Y ").toCharArray()
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             (" MAS ").toCharArray()
             , getStartOffset() + 4
             ,5
             );
    } 

	/**
	 * 	initializes WMcas3Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas31Pe8090m(0);
   }


}
  
