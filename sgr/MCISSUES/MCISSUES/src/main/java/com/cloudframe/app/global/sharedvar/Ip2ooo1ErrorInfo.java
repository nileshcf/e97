package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1ErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip2ooo1ErrorInfo extends Ip2ooo1ErrorInfoSerialized { 
   
				@Getter @Setter private Ip2ooo1ErrorIndex ip2ooo1ErrorIndex = new Ip2ooo1ErrorIndex();

								@Getter @Setter private int ip2ooo1ErrorMsgNumber;

						@Getter @Setter private char[] ip2ooo1IpmFieldType = Field.fillLowValue(1);

								@Getter @Setter private long ip2ooo1IpmFieldNumber;

								@Getter @Setter private long ip2ooo1IpmSubfldNumber;
	
	/**
	* Constructor for Ip2ooo1ErrorInfo
	**/
    public Ip2ooo1ErrorInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip2ooo1ErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp2ooo1ErrorIndex().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip2ooo1ErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp2ooo1ErrorIndex().initialize();
     
                     setIp2ooo1ErrorMsgNumber(0);
         setIp2ooo1IpmFieldType(CONSTANTS.SPACE);
                     setIp2ooo1IpmFieldNumber(0);
                     setIp2ooo1IpmSubfldNumber(0);
   }


}
  
