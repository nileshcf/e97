package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66601UserTagInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip66601UserTagInformation")

@Data
public class Ip66601UserTagInformation extends Ip66601UserTagInformationSerialized  implements InitializingBean {
   

								@Getter @Setter private short ip66601UserTcnt;
				@Getter @Setter private Ip66601UserTagTable ip66601UserTagTable = new Ip66601UserTagTable();
	
	/**
	* Constructor for Ip66601UserTagInformation
	**/
    public Ip66601UserTagInformation() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp66601UserTagTable().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip66601UserTagInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp66601UserTcnt((short)0);
          getIp66601UserTagTable().initialize();
     
   }


}
  
