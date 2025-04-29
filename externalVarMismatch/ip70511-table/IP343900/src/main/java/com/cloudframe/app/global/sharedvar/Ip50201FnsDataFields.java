package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201FnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip50201FnsDataFields extends Ip50201FnsDataFieldsSerialized { 
   
				@Getter @Setter private Ip50201FaaData ip50201FaaData = new Ip50201FaaData();
	
	/**
	* Constructor for Ip50201FnsDataFields
	**/
    public Ip50201FnsDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50201FnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201FnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50201FaaData().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip50201FnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50201FaaData().initialize();
     
   }


}
  
