package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321CurrEditInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00321CurrEditInfo extends Ip00321CurrEditInfoSerialized { 
   

						@Getter @Setter private char[] ip00321EditType = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00321EditModule = Field.fillLowValue(8);

						@Getter @Setter private char[] ip00321EditModulePtr = Field.fillLowValue(8);
				@Getter @Setter private Ip00321ErrorInfo ip00321ErrorInfo = new Ip00321ErrorInfo();

						@Getter @Setter private char[] ip00321ModuleLocationInd = Field.fillLowValue(1);
				@Getter @Setter private Ip00321ReplErrTextInfo ip00321ReplErrTextInfo = new Ip00321ReplErrTextInfo();

						@Getter @Setter private char[] ip00321BypEditIrddrvSrv = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00321CurrEditInfo
	**/
    public Ip00321CurrEditInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00321CurrEditInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321CurrEditInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00321ErrorInfo().setParent(this,getStartOffset() + 17);
					getIp00321ReplErrTextInfo().setParent(this,getStartOffset() + 37);
    } 

	/**
	 * 	initializes Ip00321CurrEditInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00321EditType(CONSTANTS.SPACE);
         setIp00321EditModule(CONSTANTS.SPACE_8);
         setIp00321EditModulePtr(CONSTANTS.SPACE_8);
          getIp00321ErrorInfo().initialize();
     
         setIp00321ModuleLocationInd(CONSTANTS.SPACE);
          getIp00321ReplErrTextInfo().initialize();
     
         setIp00321BypEditIrddrvSrv(CONSTANTS.SPACE);
   }


}
  
