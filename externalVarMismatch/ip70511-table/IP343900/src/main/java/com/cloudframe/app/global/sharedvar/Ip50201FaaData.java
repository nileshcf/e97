package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201FaaData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50201FaaData extends Ip50201FaaDataSerialized { 
   

						@Getter @Setter private char[] ip50201PrimaryAcctNbr = Field.fillLowValue(19);
				@Getter @Setter private Ip50201ExpirationDate ip50201ExpirationDate = new Ip50201ExpirationDate();

						@Getter @Setter private char[] ip50201AccntStatus = Field.fillLowValue(1);
				@Getter @Setter private Ip50201ClosedDate ip50201ClosedDate = new Ip50201ClosedDate();

						@Getter @Setter private char[] ip50201VrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip50201FaaData
	**/
    public Ip50201FaaData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50201FaaData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201FaaData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50201ExpirationDate().setParent(this,getStartOffset() + 19);
					getIp50201ClosedDate().setParent(this,getStartOffset() + 26);
    } 

	/**
	 * 	initializes Ip50201FaaData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201PrimaryAcctNbr(CONSTANTS.SPACE_19);
          getIp50201ExpirationDate().initialize();
     
         setIp50201AccntStatus(CONSTANTS.SPACE);
          getIp50201ClosedDate().initialize();
     
         setIp50201VrtlAcctNum(CONSTANTS.SPACE_19);
   }


}
  
