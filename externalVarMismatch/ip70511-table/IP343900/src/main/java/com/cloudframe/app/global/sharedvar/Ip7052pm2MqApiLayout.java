package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pm2MqApiLayout is used to handle fields declared in it
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

            @Component("global_ip7052pm2MqApiLayout")

@Data
public class Ip7052pm2MqApiLayout extends Ip7052pm2MqApiLayoutSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip7052pm2RequestCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7052pm2MqBypassSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip7052pm2MqReturnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip7052pm2MqTimestamp = Field.fillLowValue(26);

						@Getter @Setter private char[] ip7052pm2QmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052pm2QName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052pm2TargetQmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052pm2TargetQName = Field.fillLowValue(48);

								@Getter @Setter private int ip7052pm2Hconn;

								@Getter @Setter private int ip7052pm2Hobj;

								@Getter @Setter private int ip7052pm2CompCd;

								@Getter @Setter private int ip7052pm2ResnCd;

								@Getter @Setter private int ip7052pm2Options;

								@Getter @Setter private int ip7052pm2DataLength;

								@Getter @Setter private int ip7052pm2MsgBufferLen;

						@Getter @Setter private char[] ip7052pm2MsgBuffer = Field.fillLowValue(4000000);
				@Getter @Setter private Ip7052pm2ProcDelay ip7052pm2ProcDelay = new Ip7052pm2ProcDelay();
	
	/**
	* Constructor for Ip7052pm2MqApiLayout
	**/
    public Ip7052pm2MqApiLayout() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp7052pm2ProcDelay().setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip7052pm2MqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7052pm2RequestCd(CONSTANTS.SPACE_4);
         setIp7052pm2MqBypassSw(CONSTANTS.SPACE);
         setIp7052pm2MqReturnSw(CONSTANTS.SPACE);
         setIp7052pm2MqTimestamp(CONSTANTS.SPACE_26);
         setIp7052pm2QmgrName(CONSTANTS.SPACE_48);
         setIp7052pm2QName(CONSTANTS.SPACE_48);
         setIp7052pm2TargetQmgrName(CONSTANTS.SPACE_48);
         setIp7052pm2TargetQName(CONSTANTS.SPACE_48);
                     setIp7052pm2Hconn(0);
                     setIp7052pm2Hobj(0);
                     setIp7052pm2CompCd(0);
                     setIp7052pm2ResnCd(0);
                     setIp7052pm2Options(0);
                     setIp7052pm2DataLength(0);
                     setIp7052pm2MsgBufferLen(0);
         setIp7052pm2MsgBuffer(CONSTANTS.SPACE_4000000);
          getIp7052pm2ProcDelay().initialize();
     
   }


}
  
