package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0040TableData extends Ip0040TableDataSerialized { 
   
				@Getter @Setter private Ip0040PreEditFields ip0040PreEditFields = new Ip0040PreEditFields();
				@Getter @Setter private Ip0040CentralSiteFields ip0040CentralSiteFields = new Ip0040CentralSiteFields();
	
	/**
	* Constructor for Ip0040TableData
	**/
    public Ip0040TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0040PreEditFields().setParent(this,getStartOffset() + 0);
					getIp0040CentralSiteFields().setParent(this,getStartOffset() + 173);
    } 

	/**
	 * 	initializes Ip0040TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp0040PreEditFields().initialize();
     
          getIp0040CentralSiteFields().initialize();
     
   }


}
  
