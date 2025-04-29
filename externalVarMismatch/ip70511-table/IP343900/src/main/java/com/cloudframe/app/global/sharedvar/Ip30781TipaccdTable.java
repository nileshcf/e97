package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30781TipaccdTable is used to handle fields declared in it
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

            @Component("global_ip30781TipaccdTable")

@Data
public class Ip30781TipaccdTable extends Ip30781TipaccdTableSerialized  implements InitializingBean {
   

								@Getter @Setter private short ip30781ClrCyclId;

						@Getter @Setter private char[] ip30781EffTs = Field.fillLowValue(26);

						@Getter @Setter private char[] ip30781ClrCyclDt = Field.fillLowValue(10);

						@Getter @Setter private char[] ip30781ClrCyclTm = Field.fillLowValue(8);

						@Getter @Setter private char[] ip30781RecStatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip30781UtcDt = Field.fillLowValue(10);

						@Getter @Setter private char[] ip30781UtcTm = Field.fillLowValue(8);

						@Getter @Setter private char[] ip30781ClrCyclRpmSw = Field.fillLowValue(1);

								@Getter @Setter private int ip30781ClrCyclRpmNum;

						@Getter @Setter private char[] ip30781DfltDlvryCyclSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip30781MqRespCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip30781OvrdeTmoutSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip30781TipaccdTable
	**/
    public Ip30781TipaccdTable() {
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
	 * 	initializes Ip30781TipaccdTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp30781ClrCyclId((short)0);
         setIp30781EffTs(CONSTANTS.SPACE_26);
         setIp30781ClrCyclDt(CONSTANTS.SPACE_10);
         setIp30781ClrCyclTm(CONSTANTS.SPACE_8);
         setIp30781RecStatCd(CONSTANTS.SPACE);
         setIp30781UtcDt(CONSTANTS.SPACE_10);
         setIp30781UtcTm(CONSTANTS.SPACE_8);
         setIp30781ClrCyclRpmSw(CONSTANTS.SPACE);
                     setIp30781ClrCyclRpmNum(0);
         setIp30781DfltDlvryCyclSw(CONSTANTS.SPACE);
         setIp30781MqRespCd(CONSTANTS.SPACE);
         setIp30781OvrdeTmoutSw(CONSTANTS.SPACE);
   }


}
  
