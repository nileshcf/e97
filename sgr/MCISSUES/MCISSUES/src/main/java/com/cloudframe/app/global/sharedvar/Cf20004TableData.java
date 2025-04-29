package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_cf20004TableData")

@Data
public class Cf20004TableData extends Cf20004TableDataSerialized  implements InitializingBean {
   
				@Getter @Setter private Cf20004ValidValuesEntry cf20004ValidValuesEntry = new Cf20004ValidValuesEntry();
	
	/**
	* Constructor for Cf20004TableData
	**/
    public Cf20004TableData() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getCf20004ValidValuesEntry().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Cf20004TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getCf20004ValidValuesEntry().initialize();
     
   }


}
  
