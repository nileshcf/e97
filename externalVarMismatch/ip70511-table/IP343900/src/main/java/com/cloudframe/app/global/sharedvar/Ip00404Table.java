package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip00404Table")

@Data
public class Ip00404Table extends Ip00404TableSerialized  implements InitializingBean {
   

								@Getter @Setter private int ip00404EntriesFoundCount;
				@Getter @Setter private Ip00404ArRangeGrp ip00404ArRangeGrp = new Ip00404ArRangeGrp();
				@Getter @Setter private Ip00404ArRangeEntries ip00404ArRangeEntries = new Ip00404ArRangeEntries();
	
	/**
	* Constructor for Ip00404Table
	**/
    public Ip00404Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp00404ArRangeGrp().setParent(this,getStartOffset() + 4);
					getIp00404ArRangeEntries().setParent(this,getStartOffset() + 42);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00404Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404EntriesFoundCount(0);
          getIp00404ArRangeGrp().initialize();
     
          getIp00404ArRangeEntries().initialize();
     
   }


}
  
