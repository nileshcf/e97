package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501EiErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip43501EiErrorInfo extends Ip43501EiErrorInfoSerialized { 
   

								@Getter @Setter private long ip43501EiSourceAmount;

						@Getter @Setter private char[] ip43501EiSourceCurrency = Field.fillLowValue(3);

								@Getter @Setter private int ip43501EiSourceCurrExp;

						@Getter @Setter private char[] ip43501EiSourceMtiFunc = Field.fillLowValue(8);
				@Getter @Setter private Ip43501EiElemId ip43501EiElemId = new Ip43501EiElemId();
				@Getter @Setter private Ip43501EiData ip43501EiData = new Ip43501EiData();
	
	/**
	* Constructor for Ip43501EiErrorInfo
	**/
    public Ip43501EiErrorInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip43501EiErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp43501EiElemId().setParent(this,getStartOffset() + 30);
					getIp43501EiData().setParent(this,getStartOffset() + 40);
    } 

	/**
	 * 	initializes Ip43501EiErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp43501EiSourceAmount(0);
         setIp43501EiSourceCurrency(CONSTANTS.SPACE_3);
                     setIp43501EiSourceCurrExp(0);
         setIp43501EiSourceMtiFunc(CONSTANTS.SPACE_8);
          getIp43501EiElemId().initialize();
     
          getIp43501EiData().initialize();
     
   }


}
  
