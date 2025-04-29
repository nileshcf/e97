package com.cloudframe.app.global.sharedvar;

/**
*  The class LinkVariable800 is used to handle fields declared in it
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

            @Component("global_linkVariable800")

@Data
public class LinkVariable800 extends LinkVariable800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] lnFacreqJobgrpName800 = Field.fillLowValue(6);

						@Getter @Setter private char[] lnFacreqJobgrpNum800 = Field.fillLowValue(2);

						@Getter @Setter private char[] lnCloneOwnerId800 = Field.fillLowValue(3);

								@Getter @Setter private int lnParm911Retry800;
	
	/**
	* Constructor for LinkVariable800
	**/
    public LinkVariable800() {
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
	 * 	initializes LinkVariable800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setLnFacreqJobgrpName800(CONSTANTS.SPACE_6);
         setLnFacreqJobgrpNum800(CONSTANTS.SPACE_2);
         setLnCloneOwnerId800(CONSTANTS.SPACE_3);
                     setLnParm911Retry800(0);
   }


}
  
