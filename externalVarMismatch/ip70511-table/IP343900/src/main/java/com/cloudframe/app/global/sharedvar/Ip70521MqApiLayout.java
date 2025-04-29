package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70521MqApiLayout is used to handle fields declared in it
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

            @Component("global_ip70521MqApiLayout")

@Data
public class Ip70521MqApiLayout extends Ip70521MqApiLayoutSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip70521RequestCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip70521MqBypassSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip70521MqReturnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip70521MqTimestamp = Field.fillLowValue(26);

						@Getter @Setter private char[] ip70521QmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip70521QName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip70521TargetQmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip70521TargetQName = Field.fillLowValue(48);

								@Getter @Setter private int ip70521Hconn;

								@Getter @Setter private int ip70521Hobj;

								@Getter @Setter private int ip70521CompCd;

								@Getter @Setter private int ip70521ResnCd;

								@Getter @Setter private int ip70521Options;

								@Getter @Setter private int ip70521DataLength;

								@Getter @Setter private int ip70521MsgBufferLen;

						@Getter @Setter private char[] ip70521MsgBuffer = Field.fillLowValue(4000000);
				@Getter @Setter private Ip70521ProcDelay ip70521ProcDelay = new Ip70521ProcDelay();
	
	/**
	* Constructor for Ip70521MqApiLayout
	**/
    public Ip70521MqApiLayout() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp70521ProcDelay().setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip70521MqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70521RequestCd(CONSTANTS.SPACE_4);
         setIp70521MqBypassSw(CONSTANTS.SPACE);
         setIp70521MqReturnSw(CONSTANTS.SPACE);
         setIp70521MqTimestamp(CONSTANTS.SPACE_26);
         setIp70521QmgrName(CONSTANTS.SPACE_48);
         setIp70521QName(CONSTANTS.SPACE_48);
         setIp70521TargetQmgrName(CONSTANTS.SPACE_48);
         setIp70521TargetQName(CONSTANTS.SPACE_48);
                     setIp70521Hconn(0);
                     setIp70521Hobj(0);
                     setIp70521CompCd(0);
                     setIp70521ResnCd(0);
                     setIp70521Options(0);
                     setIp70521DataLength(0);
                     setIp70521MsgBufferLen(0);
         setIp70521MsgBuffer(CONSTANTS.SPACE_4000000);
          getIp70521ProcDelay().initialize();
     
   }


}
  
