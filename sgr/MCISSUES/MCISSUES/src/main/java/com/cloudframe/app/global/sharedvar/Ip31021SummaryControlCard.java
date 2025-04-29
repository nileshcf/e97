package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip31021SummaryControlCard is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip31021SummaryControlCard")

@Data
public class Ip31021SummaryControlCard extends Ip31021SummaryControlCardSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip31021InputSource = Field.fillLowValue(10);

						@Getter @Setter private char[] ip31021SummarySif = Field.fillLowValue(1);

								@Getter @Setter private int ip31021SummaryCycle;

	
	/**
	* Constructor for Ip31021SummaryControlCard
	**/
    public Ip31021SummaryControlCard() {
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
	 * 	initializes Ip31021SummaryControlCard
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp31021InputSource(CONSTANTS.SPACE_10);
         setIp31021SummarySif(CONSTANTS.SPACE);
                     setIp31021SummaryCycle(0);
   }


}
  
