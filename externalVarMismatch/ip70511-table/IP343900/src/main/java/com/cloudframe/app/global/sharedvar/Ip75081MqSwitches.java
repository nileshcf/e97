package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip75081MqSwitches is used to handle fields declared in it
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

            @Component("global_ip75081MqSwitches")

@Data
public class Ip75081MqSwitches extends Ip75081MqSwitchesSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip75081MqOptions = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081IsFromPgm = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081IsForTable = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PayloadPmtSentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081IdnPyldPmaSentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081IdnPyldPmiSentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081RusPyldPmaSentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081RusPyldPmiSentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PayloadPimSentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PayloadPmt1stTime = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PyldPmaIdn1stTime = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PyldPmiIdn1stTime = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PyldPmaRus1stTime = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PyldPmiRus1stTime = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081PayloadPim1stTime = Field.fillLowValue(1);

						@Getter @Setter private char[] ip75081AccntNum = Field.fillLowValue(19);

						@Getter @Setter private char[] ip75081IsItEndOfProcess = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip75081MqSwitches
	**/
    public Ip75081MqSwitches() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip75081MqSwitches
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp75081MqOptions(CONSTANTS.SPACE);
         setIp75081IsFromPgm(CONSTANTS.SPACE);
         setIp75081IsForTable(CONSTANTS.SPACE);
         setIp75081PayloadPmtSentSw(CONSTANTS.SPACE);
         setIp75081IdnPyldPmaSentSw(CONSTANTS.SPACE);
         setIp75081IdnPyldPmiSentSw(CONSTANTS.SPACE);
         setIp75081RusPyldPmaSentSw(CONSTANTS.SPACE);
         setIp75081RusPyldPmiSentSw(CONSTANTS.SPACE);
         setIp75081PayloadPimSentSw(CONSTANTS.SPACE);
         setIp75081PayloadPmt1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmaIdn1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmiIdn1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmaRus1stTime(CONSTANTS.SPACE);
         setIp75081PyldPmiRus1stTime(CONSTANTS.SPACE);
         setIp75081PayloadPim1stTime(CONSTANTS.SPACE);
         setIp75081AccntNum(CONSTANTS.SPACE_19);
         setIp75081IsItEndOfProcess(CONSTANTS.SPACE);
   }


}
  
