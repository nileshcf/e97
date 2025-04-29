package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70701TipamrqEntries is used to handle fields declared in it
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

            @Component("global_ip70701TipamrqEntries")

@Data
public class Ip70701TipamrqEntries extends Ip70701TipamrqEntriesSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip70701TipamrqKey ip70701TipamrqKey = new Ip70701TipamrqKey();
				@Getter @Setter private Ip70701RequestData ip70701RequestData = new Ip70701RequestData();

						@Getter @Setter private char[] ip70701JobGrpId = Field.fillLowValue(6);

								@Getter @Setter private int ip70701JobGrpNum;
	
	/**
	* Constructor for Ip70701TipamrqEntries
	**/
    public Ip70701TipamrqEntries() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp70701TipamrqKey().setParent(this,getStartOffset() + 0);
					getIp70701RequestData().setParent(this,getStartOffset() + 57);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip70701TipamrqEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp70701TipamrqKey().initialize();
     
          getIp70701RequestData().initialize();
     
         setIp70701JobGrpId(CONSTANTS.SPACE_6);
                     setIp70701JobGrpNum(0);
   }


}
  
