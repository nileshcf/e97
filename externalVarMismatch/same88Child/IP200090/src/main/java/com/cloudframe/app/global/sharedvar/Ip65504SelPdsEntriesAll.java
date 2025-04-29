package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504SelPdsEntriesAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip65504SelPdsEntriesAll")

@Data
public class Ip65504SelPdsEntriesAll extends Ip65504SelPdsEntriesAllSerialized  implements InitializingBean {
   
      private List<char[]> ip65504SelPdsEnt; 

	
	/**
	* Constructor for Ip65504SelPdsEntriesAll
	**/
    public Ip65504SelPdsEntriesAll() {
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
	 * 	initializes Ip65504SelPdsEntriesAll
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_65504_SEL_PDS_ENT_SIZE;index++) {
             setIp65504SelPdsEnt(index, CONSTANTS.SPACE);
         }
   }


}
  
