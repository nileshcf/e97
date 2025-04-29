package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1EditWorkRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip2ooo1EditWorkRecord")

@Data
public class Ip2ooo1EditWorkRecord extends Ip2ooo1EditWorkRecordSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip2ooo1ErrorInfoTable ip2ooo1ErrorInfoTable = new Ip2ooo1ErrorInfoTable();
	
	/**
	* Constructor for Ip2ooo1EditWorkRecord
	**/
    public Ip2ooo1EditWorkRecord() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp2ooo1ErrorInfoTable().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip2ooo1EditWorkRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp2ooo1ErrorInfoTable().initialize();
     
   }


}
  
