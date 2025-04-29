package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331FaFileIdStatusTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip30331FaFileIdStatusTbl extends Ip30331FaFileIdStatusTblSerialized { 
   

								@Getter @Setter private long ip30331MessageNumber;
				@Getter @Setter private Ip30331ErrorInfo ip30331ErrorInfo = new Ip30331ErrorInfo();
				@Getter @Setter private Ip30331Pds501Value ip30331Pds501Value = new Ip30331Pds501Value();

						@Getter @Setter private char[] ip30331EditStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] ip30331CorpIncentFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ip303312ndlvlCorpIncntFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip30331FaFileIdStatusTbl
	**/
    public Ip30331FaFileIdStatusTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip30331FaFileIdStatusTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331FaFileIdStatusTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp30331ErrorInfo().setParent(this,getStartOffset() + 8);
					getIp30331Pds501Value().setParent(this,getStartOffset() + 18);
    } 

	/**
	 * 	initializes Ip30331FaFileIdStatusTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30331MessageNumber(0);
          getIp30331ErrorInfo().initialize();
     
          getIp30331Pds501Value().initialize();
     
         setIp30331EditStatus(CONSTANTS.SPACE);
         setIp30331CorpIncentFlag(CONSTANTS.SPACE);
         setIp303312ndlvlCorpIncntFlag(CONSTANTS.SPACE);
   }


}
  
