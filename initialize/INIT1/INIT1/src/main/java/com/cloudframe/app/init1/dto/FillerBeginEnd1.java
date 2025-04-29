package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEnd1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FillerBeginEnd1 extends FillerBeginEnd1Serialized {
   
				@Getter @Setter private IypInit9 iypInit9 = new IypInit9();
				@Getter @Setter private IypCurr9 iypCurr9 = new IypCurr9();

						@Getter @Setter private char[] ws9iypAddedSw = new char[1];

								@Getter @Setter private int iypPriorCnt9;

								@Getter @Setter private int filler6;

								@Getter @Setter private int filler7;
	
	/**
	* Constructor for FillerBeginEnd1
	**/
    public FillerBeginEnd1() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIypInit9().setParent(this,getStartOffset() + 0);
					getIypCurr9().setParent(this,getStartOffset() + 56);
	   	/*  end of offset */
								setWs9iypAddedSw(("N").toCharArray());
								setIypPriorCnt9(0);
    }



	/**
	 * 	initializes FillerBeginEnd1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIypInit9().initialize();
     
          getIypCurr9().initialize();
     
         setWs9iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt9(0);
   }


}
  
