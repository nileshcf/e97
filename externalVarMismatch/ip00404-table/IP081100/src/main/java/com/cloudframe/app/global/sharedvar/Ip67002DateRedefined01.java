package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002DateRedefined01 extends Ip67002DateRedefined01Serialized { 
   
				@Getter @Setter private Ip67002Ccyyddd ip67002Ccyyddd = new Ip67002Ccyyddd();

	
	/**
	* Constructor for Ip67002DateRedefined01
	**/
    public Ip67002DateRedefined01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002DateRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002DateRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp67002Ccyyddd().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip67002DateRedefined01
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp67002Ccyyddd().initialize();
     
   }


}
  
