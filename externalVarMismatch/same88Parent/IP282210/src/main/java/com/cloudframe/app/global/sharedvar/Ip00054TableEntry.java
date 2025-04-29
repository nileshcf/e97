package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00054TableEntry is used to handle fields declared in it
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

            @Component("global_ip00054TableEntry")

@Data
public class Ip00054TableEntry extends Ip00054TableEntrySerialized  implements InitializingBean {
   
				@Getter @Setter private Ip00054Table5Key1 ip00054Table5Key1 = new Ip00054Table5Key1();

						@Getter @Setter private char[] ip00054ReloadDtTm = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip00054TableEntry
	**/
    public Ip00054TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp00054Table5Key1().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00054TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00054Table5Key1().initialize();
     
         setIp00054ReloadDtTm(CONSTANTS.SPACE_10);
   }


}
  
