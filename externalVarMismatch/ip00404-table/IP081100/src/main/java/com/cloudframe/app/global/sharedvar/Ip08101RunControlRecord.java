package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08101RunControlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.util.List;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip08101RunControlRecord")

@Data
public class Ip08101RunControlRecord extends Ip08101RunControlRecordSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip08101RunOption = Field.fillLowValue(1);

								@Getter @Setter private long ip08101ProcessDate;
				@Getter @Setter private Ip08101RptInds ip08101RptInds = new Ip08101RptInds();
      private List<char[]> ip08101RptIndValues; 

				@Getter @Setter private Ip08101MsgTbl ip08101MsgTbl = new Ip08101MsgTbl();
      private List<char[]> ip08101MsgThreshValues; 


						@Getter @Setter private char[] ip08101RptUtcSign = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101RptUtcOffset = Field.fillLowValue(4);

						@Getter @Setter private char[] ip08101RptProcessTime = Field.fillLowValue(4);

								@Getter @Setter private int ip08101MaxNumCycles;

						@Getter @Setter private char[] ip08101Filler = Field.fillLowValue(29);
	
	/**
	* Constructor for Ip08101RunControlRecord
	**/
    public Ip08101RunControlRecord() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp08101RptInds().setParent(this,getStartOffset() + 9);
					getIp08101MsgTbl().setParent(this,getStartOffset() + 24);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip08101RunControlRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp08101RunOption(CONSTANTS.SPACE);
                     setIp08101ProcessDate(0);
          getIp08101RptInds().initialize();
     
          getIp08101MsgTbl().initialize();
     
         setIp08101RptUtcSign(CONSTANTS.SPACE);
         setIp08101RptUtcOffset(CONSTANTS.SPACE_4);
         setIp08101RptProcessTime(CONSTANTS.SPACE_4);
                     setIp08101MaxNumCycles(0);
         setIp08101Filler(CONSTANTS.SPACE_29);
   }


}
  
