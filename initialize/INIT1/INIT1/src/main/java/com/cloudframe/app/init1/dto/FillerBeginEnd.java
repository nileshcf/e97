package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEnd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FillerBeginEnd extends FillerBeginEndSerialized {
   
				@Getter @Setter private IypInit7 iypInit7 = new IypInit7();
				@Getter @Setter private IypCurr7 iypCurr7 = new IypCurr7();

						@Getter @Setter private char[] ws7iypAddedSw = new char[1];

								@Getter @Setter private int iypPriorCnt7;


	
	/**
	* Constructor for FillerBeginEnd
	**/
    public FillerBeginEnd() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIypInit7().setParent(this,getStartOffset() + 0);
					getIypCurr7().setParent(this,getStartOffset() + 72);
	   	/*  end of offset */
								setWs7iypAddedSw(("N").toCharArray());
								setIypPriorCnt7(0);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 99
             ,4
             );
    }



	/**
	 * 	initializes FillerBeginEnd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIypInit7().initialize();
     
          getIypCurr7().initialize();
     
         setWs7iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt7(0);
   }


}
  
