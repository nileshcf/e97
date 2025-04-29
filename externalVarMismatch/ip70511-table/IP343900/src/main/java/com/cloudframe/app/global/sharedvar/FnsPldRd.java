package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRd is used to handle fields declared in it
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

            @Component("global_fnsPldRd")

@Data
public class FnsPldRd extends FnsPldRdSerialized  implements InitializingBean {
   

								@Getter @Setter private short fnsPldRdQueryNo;

						@Getter @Setter private char[] fnsPldRdGftDsn = Field.fillLowValue(44);

								@Getter @Setter private int fnsPldRdLogicalSeq;

								@Getter @Setter private int fnsPldRdTxnNum;

								@Getter @Setter private short fnsPldRdCount;

						@Getter @Setter private char[] fnsPldRdFaaPanStatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPldRdFaaCloseDt = Field.fillLowValue(10);
				@Getter @Setter private FnsPldRdFnsDataFields fnsPldRdFnsDataFields = new FnsPldRdFnsDataFields();
	
	/**
	* Constructor for FnsPldRd
	**/
    public FnsPldRd() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getFnsPldRdFnsDataFields().setParent(this,getStartOffset() + 68);
	   	/*  end of offset */
    }


	/**
	 * 	initializes FnsPldRd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setFnsPldRdQueryNo((short)0);
         setFnsPldRdGftDsn(CONSTANTS.SPACE_44);
                     setFnsPldRdLogicalSeq(0);
                     setFnsPldRdTxnNum(0);
         	setFnsPldRdCount((short)0);
         setFnsPldRdFaaPanStatCd(CONSTANTS.SPACE);
         setFnsPldRdFaaCloseDt(CONSTANTS.SPACE_10);
          getFnsPldRdFnsDataFields().initialize();
     
   }


}
  
