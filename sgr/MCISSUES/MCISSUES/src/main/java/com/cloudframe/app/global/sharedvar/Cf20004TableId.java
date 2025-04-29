package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Cf20004TableId extends Cf20004TableIdSerialized { 
   


								@Getter @Setter private int cf20004TableNo;

	
	/**
	* Constructor for Cf20004TableId
	**/
    public Cf20004TableId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Cf20004TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Cf20004TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCf20004TableNo(0);
   }


}
  
