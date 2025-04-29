package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211ExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50211ExpirationDate extends Ip50211ExpirationDateSerialized { 
   

						@Getter @Setter private char[] ip50211ExprMonth = Field.fillLowValue(2);
				@Getter @Setter private Ip50211ExprYear ip50211ExprYear = new Ip50211ExprYear();
	
	/**
	* Constructor for Ip50211ExpirationDate
	**/
    public Ip50211ExpirationDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50211ExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211ExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50211ExprYear().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip50211ExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211ExprMonth(CONSTANTS.SPACE_2);
          getIp50211ExprYear().initialize();
     
   }


}
  
