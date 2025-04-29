package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201ExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50201ExpirationDate extends Ip50201ExpirationDateSerialized { 
   

						@Getter @Setter private char[] ip50201ExprMonth = Field.fillLowValue(2);
				@Getter @Setter private Ip50201ExprYear ip50201ExprYear = new Ip50201ExprYear();
	
	/**
	* Constructor for Ip50201ExpirationDate
	**/
    public Ip50201ExpirationDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50201ExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50201ExprYear().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip50201ExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201ExprMonth(CONSTANTS.SPACE_2);
          getIp50201ExprYear().initialize();
     
   }


}
  
