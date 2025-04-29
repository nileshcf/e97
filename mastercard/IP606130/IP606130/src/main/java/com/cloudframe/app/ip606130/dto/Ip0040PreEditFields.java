package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040PreEditFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0040PreEditFields extends Ip0040PreEditFieldsSerialized { 
   
				@Getter @Setter private Ip0040TableDataKey ip0040TableDataKey = new Ip0040TableDataKey();
				@Getter @Setter private Ip0040TableDataFields ip0040TableDataFields = new Ip0040TableDataFields();
	
	/**
	* Constructor for Ip0040PreEditFields
	**/
    public Ip0040PreEditFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040PreEditFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040PreEditFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0040TableDataKey().setParent(this,getStartOffset() + 0);
					getIp0040TableDataFields().setParent(this,getStartOffset() + 22);
    } 

	/**
	 * 	initializes Ip0040PreEditFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp0040TableDataKey().initialize();
     
          getIp0040TableDataFields().initialize();
     
   }


}
  
