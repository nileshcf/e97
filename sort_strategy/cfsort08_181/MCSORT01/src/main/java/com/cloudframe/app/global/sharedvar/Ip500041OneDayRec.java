package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041OneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip500041OneDayRec")

@Data
public class Ip500041OneDayRec extends Ip500041OneDayRecSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip500041TableKey ip500041TableKey = new Ip500041TableKey();

						@Getter @Setter private char[] ip500041TableData = Field.fillLowValue(27973);
	
	/**
	* Constructor for Ip500041OneDayRec
	**/
    public Ip500041OneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp500041TableKey().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip500041OneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp500041TableKey().initialize();
     
         setIp500041TableData(CONSTANTS.SPACE_27973);
   }


}
  
