package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921FacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip82921FacDataKey extends Ip82921FacDataKeySerialized { 
   

						@Getter @Setter private char[] ip82921PrimaryAcctNbr = Field.fillLowValue(19);
				@Getter @Setter private Ip82921ExpirationDate ip82921ExpirationDate = new Ip82921ExpirationDate();
	
	/**
	* Constructor for Ip82921FacDataKey
	**/
    public Ip82921FacDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip82921FacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp82921ExpirationDate().setParent(this,getStartOffset() + 19);
    } 

	/**
	 * 	initializes Ip82921FacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921PrimaryAcctNbr(CONSTANTS.SPACE_19);
          getIp82921ExpirationDate().initialize();
     
   }


}
  
