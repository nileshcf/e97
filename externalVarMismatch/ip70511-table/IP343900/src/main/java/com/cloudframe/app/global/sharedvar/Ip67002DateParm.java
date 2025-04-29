package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateParm is used to handle fields declared in it
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

            @Component("global_ip67002DateParm")

@Data
public class Ip67002DateParm extends Ip67002DateParmSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip67002Cntl = Field.fillLowValue(1);

								@Getter @Setter private long ip67002Date;
				@Getter @Setter private Ip67002DateRedefined ip67002DateRedefined = new Ip67002DateRedefined();
				@Getter @Setter private Ip67002DateRedefined01 ip67002DateRedefined01 = new Ip67002DateRedefined01();
				@Getter @Setter private Ip67002DateRedefined02 ip67002DateRedefined02 = new Ip67002DateRedefined02();

								@Getter @Setter private long ip67002Date2;
				@Getter @Setter private Ip67002Date2Redefined ip67002Date2Redefined = new Ip67002Date2Redefined();
				@Getter @Setter private Ip67002Date2Redefined01 ip67002Date2Redefined01 = new Ip67002Date2Redefined01();

								@Getter @Setter private int ip67002DayOfWeek;

						@Getter @Setter private char[] ip67002UtcOffsetSign = Field.fillLowValue(1);

								@Getter @Setter private short ip67002JulianDaysSpan;
	
	/**
	* Constructor for Ip67002DateParm
	**/
    public Ip67002DateParm() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp67002DateRedefined().setParent(this,getStartOffset() + 1);
					getIp67002DateRedefined01().setParent(this,getStartOffset() + 1);
					getIp67002DateRedefined02().setParent(this,getStartOffset() + 1);
					getIp67002Date2Redefined().setParent(this,getStartOffset() + 9);
					getIp67002Date2Redefined01().setParent(this,getStartOffset() + 9);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip67002DateParm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp67002Cntl(CONSTANTS.SPACE);
                     setIp67002Date(0);
                     setIp67002Date2(0);
                     setIp67002DayOfWeek(0);
         	setIp67002JulianDaysSpan((short)0);
   }


}
  
