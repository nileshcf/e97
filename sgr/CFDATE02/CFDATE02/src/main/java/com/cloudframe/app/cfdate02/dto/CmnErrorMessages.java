package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnErrorMessages is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class CmnErrorMessages extends CmnErrorMessagesSerialized {
   

						@Getter @Setter private char[] cmnErrMsg1 = new char[80];
				@Getter @Setter private CmnErrMsg2 cmnErrMsg2 = new CmnErrMsg2();
				@Getter @Setter private CmnErrMsg3 cmnErrMsg3 = new CmnErrMsg3();
				@Getter @Setter private CmnPrtErrHdr cmnPrtErrHdr = new CmnPrtErrHdr();
			@Getter @Setter private List<CmnPrtErrMsg> cmnPrtErrMsg = new ArrayList<>();
    	
	
	/**
	* Constructor for CmnErrorMessages
	**/
    public CmnErrorMessages() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCmnErrMsg2().setParent(this,getStartOffset() + 80);
					getCmnErrMsg3().setParent(this,getStartOffset() + 160);
					getCmnPrtErrHdr().setParent(this,getStartOffset() + 240);
				for (int arrayIndex = 0; arrayIndex < CMN_PRT_ERR_MSG_SIZE;arrayIndex++) {
						getCmnPrtErrMsg().add(new CmnPrtErrMsg(this, beginCmnPrtErrMsg + 
						arrayIndex * CmnPrtErrMsg.getCmnPrtErrMsgFieldLength()));
				}
	   	/*  end of offset */
								setCmnErrMsg1("********************************************************************************".toCharArray());
			for (int arrayIndex = 0; arrayIndex < CMN_PRT_ERR_MSG_SIZE;arrayIndex++) {
					getCmnPrtErrMsg().add(new CmnPrtErrMsg(this, beginCmnPrtErrMsg + 
						arrayIndex * CmnPrtErrMsg.getCmnPrtErrMsgFieldLength()));
			}
    }





}
  
