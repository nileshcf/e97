package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052f4MqApiLayout is used to handle fields declared in it
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

            @Component("global_ip7052f4MqApiLayout")

@Data
public class Ip7052f4MqApiLayout extends Ip7052f4MqApiLayoutSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip7052f4RequestCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7052f4MqBypassSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip7052f4MqReturnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip7052f4MqTimestamp = Field.fillLowValue(26);

						@Getter @Setter private char[] ip7052f4QmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052f4QName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052f4TargetQmgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7052f4TargetQName = Field.fillLowValue(48);

								@Getter @Setter private int ip7052f4Hconn;

								@Getter @Setter private int ip7052f4Hobj;

								@Getter @Setter private int ip7052f4CompCd;

								@Getter @Setter private int ip7052f4ResnCd;

								@Getter @Setter private int ip7052f4Options;

								@Getter @Setter private int ip7052f4DataLength;

								@Getter @Setter private int ip7052f4MsgBufferLen;

						@Getter @Setter private char[] ip7052f4MsgBuffer = Field.fillLowValue(4000000);
				@Getter @Setter private Ip7052f4ProcDelay ip7052f4ProcDelay = new Ip7052f4ProcDelay();
	
	/**
	* Constructor for Ip7052f4MqApiLayout
	**/
    public Ip7052f4MqApiLayout() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp7052f4ProcDelay().setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip7052f4MqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7052f4RequestCd(CONSTANTS.SPACE_4);
         setIp7052f4MqBypassSw(CONSTANTS.SPACE);
         setIp7052f4MqReturnSw(CONSTANTS.SPACE);
         setIp7052f4MqTimestamp(CONSTANTS.SPACE_26);
         setIp7052f4QmgrName(CONSTANTS.SPACE_48);
         setIp7052f4QName(CONSTANTS.SPACE_48);
         setIp7052f4TargetQmgrName(CONSTANTS.SPACE_48);
         setIp7052f4TargetQName(CONSTANTS.SPACE_48);
                     setIp7052f4Hconn(0);
                     setIp7052f4Hobj(0);
                     setIp7052f4CompCd(0);
                     setIp7052f4ResnCd(0);
                     setIp7052f4Options(0);
                     setIp7052f4DataLength(0);
                     setIp7052f4MsgBufferLen(0);
         setIp7052f4MsgBuffer(CONSTANTS.SPACE_4000000);
          getIp7052f4ProcDelay().initialize();
     
   }


}
  
