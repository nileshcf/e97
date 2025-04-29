package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30771TipacliTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip30771TipacliTable")

@Data
public class Ip30771TipacliTable extends Ip30771TipacliTableSerialized  implements InitializingBean {
   

								@Getter @Setter private short ip30771ClrCyclId;

								@Getter @Setter private short ip30771SetlCyclId;
	
	/**
	* Constructor for Ip30771TipacliTable
	**/
    public Ip30771TipacliTable() {
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
	 * 	initializes Ip30771TipacliTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp30771ClrCyclId((short)0);
         	setIp30771SetlCyclId((short)0);
   }


}
  
