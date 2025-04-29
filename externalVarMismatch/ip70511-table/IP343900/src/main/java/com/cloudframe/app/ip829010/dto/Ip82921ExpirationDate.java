package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip82921ExpirationDate extends Ip82921ExpirationDateSerialized { 
   

						@Getter @Setter private char[] ip82921ExprMonth = Field.fillLowValue(2);
				@Getter @Setter private Ip82921ExprYear ip82921ExprYear = new Ip82921ExprYear();
	
	/**
	* Constructor for Ip82921ExpirationDate
	**/
    public Ip82921ExpirationDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip82921ExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp82921ExprYear().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip82921ExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921ExprMonth(CONSTANTS.SPACE_2);
          getIp82921ExprYear().initialize();
     
   }


}
  
