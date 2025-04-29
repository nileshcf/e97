package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pmrMqApiLayout is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip7052pmrMqApiLayout")

@Data
public class Ip7052pmrMqApiLayout extends Ip7052pmrMqApiLayoutSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip7052pmrRequestCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7052pmrMqBypassSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip7052pmrMqReturnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip7052pmrMqTimestamp = Field.fillLowValue(26);

						@Getter @Setter private char[] ip7052pmrQmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052pmrQName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052pmrTargetQmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052pmrTargetQName = Field.fillLowValue(48);

								@Getter @Setter private int ip7052pmrHconn;

								@Getter @Setter private int ip7052pmrHobj;

								@Getter @Setter private int ip7052pmrCompCd;

								@Getter @Setter private int ip7052pmrResnCd;

								@Getter @Setter private int ip7052pmrOptions;

								@Getter @Setter private int ip7052pmrDataLength;

								@Getter @Setter private int ip7052pmrMsgBufferLen;

						@Getter @Setter private char[] ip7052pmrMsgBuffer = Field.fillLowValue(4000000);
				@Getter @Setter private Ip7052pmrProcDelay ip7052pmrProcDelay = new Ip7052pmrProcDelay();
	
	/**
	* Constructor for Ip7052pmrMqApiLayout
	**/
    public Ip7052pmrMqApiLayout() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp7052pmrProcDelay().setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip7052pmrMqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7052pmrRequestCd(CONSTANTS.SPACE_4);
         setIp7052pmrMqBypassSw(CONSTANTS.SPACE);
         setIp7052pmrMqReturnSw(CONSTANTS.SPACE);
         setIp7052pmrMqTimestamp(CONSTANTS.SPACE_26);
         setIp7052pmrQmgrName(CONSTANTS.SPACE_48);
         setIp7052pmrQName(CONSTANTS.SPACE_48);
         setIp7052pmrTargetQmgrName(CONSTANTS.SPACE_48);
         setIp7052pmrTargetQName(CONSTANTS.SPACE_48);
                     setIp7052pmrHconn(0);
                     setIp7052pmrHobj(0);
                     setIp7052pmrCompCd(0);
                     setIp7052pmrResnCd(0);
                     setIp7052pmrOptions(0);
                     setIp7052pmrDataLength(0);
                     setIp7052pmrMsgBufferLen(0);
         setIp7052pmrMsgBuffer(CONSTANTS.SPACE_4000000);
          getIp7052pmrProcDelay().initialize();
     
   }


}
  
