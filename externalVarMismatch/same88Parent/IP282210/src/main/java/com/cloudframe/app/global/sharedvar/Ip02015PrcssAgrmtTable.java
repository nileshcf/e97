package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015PrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip02015PrcssAgrmtTable")

@Data
public class Ip02015PrcssAgrmtTable extends Ip02015PrcssAgrmtTableSerialized  implements InitializingBean {
   

								@Getter @Setter private int ip02015PasFoundCount;

						@Getter @Setter private char[] ip02015HostPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip02015HostGeoScopeCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015HostClrPrcssCd = Field.fillLowValue(4);
				@Getter @Setter private Ip02015PrcssAgrmtTabEnt ip02015PrcssAgrmtTabEnt = new Ip02015PrcssAgrmtTabEnt();
	
	/**
	* Constructor for Ip02015PrcssAgrmtTable
	**/
    public Ip02015PrcssAgrmtTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp02015PrcssAgrmtTabEnt().setParent(this,getStartOffset() + 20);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip02015PrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp02015PasFoundCount(0);
         setIp02015HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02015HostGeoScopeCode(CONSTANTS.SPACE);
         setIp02015HostClrPrcssCd(CONSTANTS.SPACE_4);
          getIp02015PrcssAgrmtTabEnt().initialize();
     
   }


}
  
