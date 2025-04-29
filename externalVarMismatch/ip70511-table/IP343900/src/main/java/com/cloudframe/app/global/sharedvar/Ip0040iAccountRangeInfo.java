package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iAccountRangeInfo is used to handle fields declared in it
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

            @Component("global_ip0040iAccountRangeInfo")

@Data
public class Ip0040iAccountRangeInfo extends Ip0040iAccountRangeInfoSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip0040iMpePeRecData ip0040iMpePeRecData = new Ip0040iMpePeRecData();
				@Getter @Setter private Ip0040iMpePeRecDataCs ip0040iMpePeRecDataCs = new Ip0040iMpePeRecDataCs();

						@Getter @Setter private char[] ip0040iFiller01 = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip0040iAccountRangeInfo
	**/
    public Ip0040iAccountRangeInfo() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp0040iMpePeRecData().setParent(this,getStartOffset() + 0);
					getIp0040iMpePeRecDataCs().setParent(this,getStartOffset() + 25);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip0040iAccountRangeInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp0040iMpePeRecData().initialize();
     
          getIp0040iMpePeRecDataCs().initialize();
     
         setIp0040iFiller01(CONSTANTS.SPACE_2);
   }


}
  
