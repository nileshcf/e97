package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgLogParms270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsgLogParms270 extends MsgLogParms270Serialized {
   

						@Getter @Setter private char[] opConsMsgLogInd270 = new char[1];

						@Getter @Setter private char[] jobSysoutMsgLogInd270 = new char[1];
	
	/**
	* Constructor for MsgLogParms270
	**/
    public MsgLogParms270() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setOpConsMsgLogInd270(fillSpace(1));
								setJobSysoutMsgLogInd270(fillSpace(1));
    }



	/**
	 * 	initializes MsgLogParms270
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setOpConsMsgLogInd270(CONSTANTS.SPACE);
         setJobSysoutMsgLogInd270(CONSTANTS.SPACE);
   }


}
  
