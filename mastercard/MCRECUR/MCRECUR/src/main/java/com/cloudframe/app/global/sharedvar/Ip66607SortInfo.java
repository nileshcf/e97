package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66607SortInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip66607SortInfo")

@Data
public class Ip66607SortInfo extends Ip66607SortInfoSerialized  implements InitializingBean {
   

								@Getter @Setter private int ip66607Start;

								@Getter @Setter private int ip66607End;
	
	/**
	* Constructor for Ip66607SortInfo
	**/
    public Ip66607SortInfo() {
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
	 * 	initializes Ip66607SortInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp66607Start(0);
                     setIp66607End(0);
   }


}
  
