package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oOneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip50005oOneDayRec")

@Data
public class Ip50005oOneDayRec extends Ip50005oOneDayRecSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip50005oTableKeyAll ip50005oTableKeyAll = new Ip50005oTableKeyAll();

						@Getter @Setter private char[] ip50005oTableData = Field.fillLowValue(32730);
	
	/**
	* Constructor for Ip50005oOneDayRec
	**/
    public Ip50005oOneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp50005oTableKeyAll().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip50005oOneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50005oTableKeyAll().initialize();
     
         setIp50005oTableData(CONSTANTS.SPACE_32730);
   }


}
  
