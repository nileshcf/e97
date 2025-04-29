package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEndMid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FillerBeginEndMid extends FillerBeginEndMidSerialized {
   
				@Getter @Setter private IypInit8 iypInit8 = new IypInit8();


				@Getter @Setter private IypCurr8 iypCurr8 = new IypCurr8();

						@Getter @Setter private char[] ws8iypAddedSw = new char[1];

								@Getter @Setter private int iypPriorCnt8;


	
	/**
	* Constructor for FillerBeginEndMid
	**/
    public FillerBeginEndMid() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIypInit8().setParent(this,getStartOffset() + 0);
					getIypCurr8().setParent(this,getStartOffset() + 80);
	   	/*  end of offset */
								setWs8iypAddedSw(("N").toCharArray());
								setIypPriorCnt8(0);
    }



	/**
	 * 	initializes FillerBeginEndMid
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIypInit8().initialize();
     
          getIypCurr8().initialize();
     
         setWs8iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt8(0);
   }


}
  
