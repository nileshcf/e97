package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101TipackpTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip32101TipackpTable")

@Data
public class Ip32101TipackpTable extends Ip32101TipackpTableSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip32101ChkPointKeyText = Field.fillLowValue(17);
				@Getter @Setter private Ip32101ChkPtKeyCpt ip32101ChkPtKeyCpt = new Ip32101ChkPtKeyCpt();
				@Getter @Setter private Ip32101ChkPointDataText ip32101ChkPointDataText = new Ip32101ChkPointDataText();
				@Getter @Setter private Ip32101ChkPtDataCpt ip32101ChkPtDataCpt = new Ip32101ChkPtDataCpt();
				@Getter @Setter private Ip32101ChkPtDataRct ip32101ChkPtDataRct = new Ip32101ChkPtDataRct();
				@Getter @Setter private Ip32101ChkPtDataCbhf ip32101ChkPtDataCbhf = new Ip32101ChkPtDataCbhf();
	
	/**
	* Constructor for Ip32101TipackpTable
	**/
    public Ip32101TipackpTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp32101ChkPtKeyCpt().setParent(this,getStartOffset() + 0);
					getIp32101ChkPointDataText().setParent(this,getStartOffset() + 17);
					getIp32101ChkPtDataCpt().setParent(this,getStartOffset() + 17);
					getIp32101ChkPtDataRct().setParent(this,getStartOffset() + 17);
					getIp32101ChkPtDataCbhf().setParent(this,getStartOffset() + 17);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip32101TipackpTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101ChkPointKeyText(CONSTANTS.SPACE_17);
          getIp32101ChkPointDataText().initialize();
     
   }


}
  
