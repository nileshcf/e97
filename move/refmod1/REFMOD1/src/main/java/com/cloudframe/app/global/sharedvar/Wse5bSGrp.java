package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse5bSGrp")

@Data
public class Wse5bSGrp extends Wse5bSGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wseFiller01 = Field.fillLowValue(3);
				@Getter @Setter private Wse5bS wse5bS = new Wse5bS();
	
	/**
	* Constructor for Wse5bSGrp
	**/
    public Wse5bSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse5bS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Wse5bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller01(CONSTANTS.SPACE_3);
          getWse5bS().initialize();
     
   }


}
  
