package com.cloudframe.app.global.sharedvar;

/**
*  The class SortKey800 is used to handle fields declared in it
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

            @Component("global_sortKey800")

@Data
public class SortKey800 extends SortKey800Serialized  implements InitializingBean {
   

								@Getter @Setter private long skEndpoint800;

						@Getter @Setter private char[] skFrmtInd800 = Field.fillLowValue(1);

								@Getter @Setter private long skDestId800;

						@Getter @Setter private char[] skDestIdx800 = Field.fillLowValue(11);

								@Getter @Setter private int skTxnSortCd800;

								@Getter @Setter private long skOrgnId800;

						@Getter @Setter private char[] skRevInd800 = Field.fillLowValue(1);

						@Getter @Setter private char[] skSettleInd800 = Field.fillLowValue(1);

								@Getter @Setter private int skCurrencyCd800;

								@Getter @Setter private int skMcc800;

						@Getter @Setter private char[] skMccInfo800 = Field.fillLowValue(96);

						@Getter @Setter private char[] skDelCyc800 = Field.fillLowValue(1);

						@Getter @Setter private char[] skTipabroInd800 = Field.fillLowValue(1);

						@Getter @Setter private char[] skInbndFrmtInd800 = Field.fillLowValue(1);

						@Getter @Setter private char[] skInfileId800 = Field.fillLowValue(25);

						@Getter @Setter private char[] skInfileRevCd800 = Field.fillLowValue(1);

								@Getter @Setter private long skMsgCount800;

						@Getter @Setter private char[] skOutfileId800 = Field.fillLowValue(25);

						@Getter @Setter private char[] skAb800 = Field.fillLowValue(3);

						@Getter @Setter private char[] skPurgeDt800 = Field.fillLowValue(6);

						@Getter @Setter private char[] skFlexRouteInd800 = Field.fillLowValue(1);
	
	/**
	* Constructor for SortKey800
	**/
    public SortKey800() {
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
	 * 	initializes SortKey800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSkEndpoint800(0);
         setSkFrmtInd800(CONSTANTS.SPACE);
                     setSkDestId800(0);
                     setSkTxnSortCd800(0);
                     setSkOrgnId800(0);
         setSkRevInd800(CONSTANTS.SPACE);
         setSkSettleInd800(CONSTANTS.SPACE);
                     setSkCurrencyCd800(0);
                     setSkMcc800(0);
         setSkMccInfo800(CONSTANTS.SPACE_96);
         setSkDelCyc800(CONSTANTS.SPACE);
         setSkTipabroInd800(CONSTANTS.SPACE);
         setSkInbndFrmtInd800(CONSTANTS.SPACE);
         setSkInfileId800(CONSTANTS.SPACE_25);
         setSkInfileRevCd800(CONSTANTS.SPACE);
                     setSkMsgCount800(0);
         setSkOutfileId800(CONSTANTS.SPACE_25);
         setSkAb800(CONSTANTS.SPACE_3);
         setSkPurgeDt800(CONSTANTS.SPACE_6);
         setSkFlexRouteInd800(CONSTANTS.SPACE);
   }


}
  
