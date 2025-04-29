package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4TagArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip655o4TagArea extends Ip655o4TagAreaSerialized { 
   
				@Getter @Setter private Ip655o4TagId ip655o4TagId = new Ip655o4TagId();
	
	/**
	* Constructor for Ip655o4TagArea
	**/
    public Ip655o4TagArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip655o4TagArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip655o4TagArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp655o4TagId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip655o4TagArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp655o4TagId().initialize();
     
   }


}
  
