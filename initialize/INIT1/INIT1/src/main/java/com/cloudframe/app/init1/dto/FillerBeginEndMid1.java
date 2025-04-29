package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEndMid1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FillerBeginEndMid1 extends FillerBeginEndMid1Serialized {
   
				@Getter @Setter private AiypInit aiypInit = new AiypInit();


								@Getter @Setter private int filler9;
				@Getter @Setter private AiypCurr aiypCurr = new AiypCurr();

						@Getter @Setter private char[] wsaiypAddedSw = new char[1];

								@Getter @Setter private int aiypPriorCnt;

								@Getter @Setter private int fillera;

								@Getter @Setter private int fillerb;
	
	/**
	* Constructor for FillerBeginEndMid1
	**/
    public FillerBeginEndMid1() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAiypInit().setParent(this,getStartOffset() + 0);
					getAiypCurr().setParent(this,getStartOffset() + 64);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 56
             ,4
             );
								setWsaiypAddedSw(("N").toCharArray());
								setAiypPriorCnt(0);
    }



	/**
	 * 	initializes FillerBeginEndMid1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getAiypInit().initialize();
     
          getAiypCurr().initialize();
     
         setWsaiypAddedSw(CONSTANTS.SPACE);
                     setAiypPriorCnt(0);
   }


}
  
