package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00174TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip00174TableEntry")

@Data
public class Ip00174TableEntry extends Ip00174TableEntrySerialized  implements InitializingBean {
   
				@Getter @Setter private Ip00174CurrCdKey ip00174CurrCdKey = new Ip00174CurrCdKey();

						@Getter @Setter private char[] ip00174AlphaCurCode = Field.fillLowValue(3);

								@Getter @Setter private int ip00174CurExpCode;
				@Getter @Setter private Ip00174CentralSiteFields ip00174CentralSiteFields = new Ip00174CentralSiteFields();

						@Getter @Setter private char[] ip00174Filler = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip00174TableEntry
	**/
    public Ip00174TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp00174CurrCdKey().setParent(this,getStartOffset() + 0);
					getIp00174CentralSiteFields().setParent(this,getStartOffset() + 7);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00174TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00174CurrCdKey().initialize();
     
         setIp00174AlphaCurCode(CONSTANTS.SPACE_3);
                     setIp00174CurExpCode(0);
          getIp00174CentralSiteFields().initialize();
     
         setIp00174Filler(CONSTANTS.SPACE_5);
   }


}
  
