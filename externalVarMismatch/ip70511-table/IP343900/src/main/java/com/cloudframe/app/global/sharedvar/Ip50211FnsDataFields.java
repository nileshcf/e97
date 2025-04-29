package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211FnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip50211FnsDataFields extends Ip50211FnsDataFieldsSerialized { 
   
				@Getter @Setter private Ip50211FacDataKey ip50211FacDataKey = new Ip50211FacDataKey();
				@Getter @Setter private Ip50211FacData ip50211FacData = new Ip50211FacData();
	
	/**
	* Constructor for Ip50211FnsDataFields
	**/
    public Ip50211FnsDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50211FnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50211FacDataKey().setParent(this,getStartOffset() + 0);
					getIp50211FacData().setParent(this,getStartOffset() + 25);
    } 

	/**
	 * 	initializes Ip50211FnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50211FacDataKey().initialize();
     
          getIp50211FacData().initialize();
     
   }


}
  
