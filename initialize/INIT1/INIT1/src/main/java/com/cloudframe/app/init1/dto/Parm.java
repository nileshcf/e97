package com.cloudframe.app.init1.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Parm extends ParmSerialized { 
   

						@Getter @Setter private char[] parmType = new char[3];

						@Getter @Setter private char[] parmIdentifier = new char[3];

								@Getter @Setter private long parmThreshold;
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Parm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setParmType(fillSpace(3));
								setParmIdentifier(fillSpace(3));
								setParmThreshold(0L);
    } 

	/**
	 * 	initializes Parm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setParmType(CONSTANTS.SPACE_3);
         setParmIdentifier(CONSTANTS.SPACE_3);
                     setParmThreshold(0);
   }


}
  
