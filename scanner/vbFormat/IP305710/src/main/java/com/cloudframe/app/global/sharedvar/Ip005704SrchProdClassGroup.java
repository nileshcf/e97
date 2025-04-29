package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip005704SrchProdClassGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip005704SrchProdClassGroup")

@Data
public class Ip005704SrchProdClassGroup extends Ip005704SrchProdClassGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip005704SrchProdClass = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip005704SrchProdClassGroup
	**/
    public Ip005704SrchProdClassGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }




}
  
