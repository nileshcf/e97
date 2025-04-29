package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iOneDayRec is used to handle fields declared in it
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

            @Component("global_ip50004iOneDayRec")

@Data
public class Ip50004iOneDayRec extends Ip50004iOneDayRecSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip50004iTableKey ip50004iTableKey = new Ip50004iTableKey();

						@Getter @Setter private char[] ip50004iTableData = Field.fillLowValue(27973);
	
	/**
	* Constructor for Ip50004iOneDayRec
	**/
    public Ip50004iOneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp50004iTableKey().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip50004iOneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50004iTableKey().initialize();
     
         setIp50004iTableData(CONSTANTS.SPACE_27973);
   }


}
  
