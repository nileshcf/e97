package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004TableDataInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip570004TableDataInfo")

@Data
public class Ip570004TableDataInfo extends Ip570004TableDataInfoSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip570004EffdtTm = Field.fillLowValue(10);

								@Getter @Setter private long ip570004Idx;

								@Getter @Setter private long ip570004IdxMax;
				@Getter @Setter private Ip570004TableEntries ip570004TableEntries = new Ip570004TableEntries();
	
	/**
	* Constructor for Ip570004TableDataInfo
	**/
    public Ip570004TableDataInfo() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp570004TableEntries().setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip570004TableDataInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp570004EffdtTm(CONSTANTS.SPACE_10);
                     setIp570004Idx(0);
                     setIp570004IdxMax(0);
          getIp570004TableEntries().initialize();
     
   }


}
  
