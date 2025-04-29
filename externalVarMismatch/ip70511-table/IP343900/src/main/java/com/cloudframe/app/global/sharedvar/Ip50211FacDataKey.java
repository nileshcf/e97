package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211FacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50211FacDataKey extends Ip50211FacDataKeySerialized { 
   

						@Getter @Setter private char[] ip50211PrimaryAcctNbr = Field.fillLowValue(19);
				@Getter @Setter private Ip50211ExpirationDate ip50211ExpirationDate = new Ip50211ExpirationDate();
	
	/**
	* Constructor for Ip50211FacDataKey
	**/
    public Ip50211FacDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50211FacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50211ExpirationDate().setParent(this,getStartOffset() + 19);
    } 

	/**
	 * 	initializes Ip50211FacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211PrimaryAcctNbr(CONSTANTS.SPACE_19);
          getIp50211ExpirationDate().initialize();
     
   }


}
  
