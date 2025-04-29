package com.cloudframe.app.global.sharedvar;

/**
*  The class IrdExtrFileRec800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_irdExtrFileRec800")

@Data
public class IrdExtrFileRec800 extends IrdExtrFileRec800Serialized  implements InitializingBean {
   
				@Getter @Setter private Key800 key800 = new Key800();
	
	/**
	* Constructor for IrdExtrFileRec800
	**/
    public IrdExtrFileRec800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getKey800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes IrdExtrFileRec800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getKey800().initialize();
     
   }


}
  
