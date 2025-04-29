package com.cloudframe.app.move0.dto;

/**
*  The class Parent5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Parent5 extends Parent5Serialized { 
   
				@Getter @Setter private Parent51 parent51 = new Parent51();
	
	/**
	* Constructor for Parent5
	**/
    public Parent5() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Parent5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getParent51().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Parent5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getParent51().initialize();
     
   }


}
  
