package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504SelElemEntriesAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip65504SelElemEntriesAll")

@Data
public class Ip65504SelElemEntriesAll extends Ip65504SelElemEntriesAllSerialized  implements InitializingBean {
   
      private List<char[]> ip65504SelElemEnt; 

	
	/**
	* Constructor for Ip65504SelElemEntriesAll
	**/
    public Ip65504SelElemEntriesAll() {
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
	 * 	initializes Ip65504SelElemEntriesAll
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_65504_SEL_ELEM_ENT_SIZE;index++) {
             setIp65504SelElemEnt(index, CONSTANTS.SPACE);
         }
   }


}
  
