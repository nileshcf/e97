package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921FnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip82921FnsDataFields extends Ip82921FnsDataFieldsSerialized { 
   
				@Getter @Setter private Ip82921FacDataKey ip82921FacDataKey = new Ip82921FacDataKey();
				@Getter @Setter private Ip82921FacData ip82921FacData = new Ip82921FacData();
	
	/**
	* Constructor for Ip82921FnsDataFields
	**/
    public Ip82921FnsDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip82921FnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp82921FacDataKey().setParent(this,getStartOffset() + 0);
					getIp82921FacData().setParent(this,getStartOffset() + 25);
    } 

	/**
	 * 	initializes Ip82921FnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp82921FacDataKey().initialize();
     
          getIp82921FacData().initialize();
     
   }


}
  
