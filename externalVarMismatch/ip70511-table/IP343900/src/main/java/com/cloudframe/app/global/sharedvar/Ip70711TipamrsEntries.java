package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70711TipamrsEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip70711TipamrsEntries")

@Data
public class Ip70711TipamrsEntries extends Ip70711TipamrsEntriesSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip70711TipamrsKey ip70711TipamrsKey = new Ip70711TipamrsKey();
				@Getter @Setter private Ip70711ResponseData ip70711ResponseData = new Ip70711ResponseData();
	
	/**
	* Constructor for Ip70711TipamrsEntries
	**/
    public Ip70711TipamrsEntries() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp70711TipamrsKey().setParent(this,getStartOffset() + 0);
					getIp70711ResponseData().setParent(this,getStartOffset() + 57);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip70711TipamrsEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp70711TipamrsKey().initialize();
     
          getIp70711ResponseData().initialize();
     
   }


}
  
