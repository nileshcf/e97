package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66601TipalrmEntries is used to handle fields declared in it
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

            @Component("global_ip66601TipalrmEntries")

@Data
public class Ip66601TipalrmEntries extends Ip66601TipalrmEntriesSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip66601JobGroup = Field.fillLowValue(6);

								@Getter @Setter private short ip66601JobSeqNumber;

								@Getter @Setter private short ip66601NumberOfRunning;

								@Getter @Setter private short ip66601NumberToRun;

								@Getter @Setter private short ip66601DefaultRunNumber;

								@Getter @Setter private short ip66601MaximumRunNumber;

						@Getter @Setter private char[] ip66601ShortSleep = Field.fillLowValue(8);

						@Getter @Setter private char[] ip66601LongSleep = Field.fillLowValue(8);

						@Getter @Setter private char[] ip66601TaskDesc = Field.fillLowValue(30);

						@Getter @Setter private char[] ip66601TaskTypeCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66601TipalrmEntries
	**/
    public Ip66601TipalrmEntries() {
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
	 * 	initializes Ip66601TipalrmEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66601JobGroup(CONSTANTS.SPACE_6);
         	setIp66601JobSeqNumber((short)0);
         	setIp66601NumberOfRunning((short)0);
         	setIp66601NumberToRun((short)0);
         	setIp66601DefaultRunNumber((short)0);
         	setIp66601MaximumRunNumber((short)0);
         setIp66601ShortSleep(CONSTANTS.SPACE_8);
         setIp66601LongSleep(CONSTANTS.SPACE_8);
         setIp66601TaskDesc(CONSTANTS.SPACE_30);
         setIp66601TaskTypeCd(CONSTANTS.SPACE);
   }


}
  
