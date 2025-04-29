package com.cloudframe.app.init1.dto;

/**
*  The class IypData6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class IypData6 extends IypData6Serialized {
   
				@Getter @Setter private IypInit6 iypInit6 = new IypInit6();
				@Getter @Setter private IypCurr6 iypCurr6 = new IypCurr6();

						@Getter @Setter private char[] ws6iypAddedSw = new char[1];

								@Getter @Setter private int iypPriorCnt6;
	
	/**
	* Constructor for IypData6
	**/
    public IypData6() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIypInit6().setParent(this,getStartOffset() + 0);
					getIypCurr6().setParent(this,getStartOffset() + 72);
	   	/*  end of offset */
								setWs6iypAddedSw(("N").toCharArray());
								setIypPriorCnt6(0);
    }



	/**
	 * 	initializes IypData6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIypInit6().initialize();
     
          getIypCurr6().initialize();
     
         setWs6iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt6(0);
   }


}
  
