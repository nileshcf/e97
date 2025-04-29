package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat6bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WMcat6bPe8090m extends WMcat6bPe8090mSerialized { 
   


								@Getter @Setter private int wMcat63Pe8090m;

	
	/**
	* Constructor for WMcat6bPe8090m
	**/
    public WMcat6bPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WMcat6bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat6bPe8090m(Field parent,int begin) {
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
       replaceValue( // serialize and save the value
             (" PERSONES ").toCharArray()
             , getStartOffset() + 7
             ,10
             );
    } 

	/**
	 * 	initializes WMcat6bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat63Pe8090m(0);
   }


}
  
