package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ErrMsgOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip82921ErrMsgOut extends Ip82921ErrMsgOutSerialized {
   
				@Getter @Setter private Ip82921ErrPayloadMsg ip82921ErrPayloadMsg = new Ip82921ErrPayloadMsg();

						@Getter @Setter private char[] ip82921ErrRequestCd = new char[3];

						@Getter @Setter private char[] ip82921ErrTargetQmgrName = new char[4];

						@Getter @Setter private char[] ip82921ErrTargetQName = new char[11];

								@Getter @Setter private long ip82921ErrCompCd;

								@Getter @Setter private long ip82921ErrResnCd;

						@Getter @Setter private char[] ip82921ErrMsg = new char[30];
	
	/**
	* Constructor for Ip82921ErrMsgOut
	**/
    public Ip82921ErrMsgOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp82921ErrPayloadMsg().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIp82921ErrRequestCd(fillSpace(3));
								setIp82921ErrTargetQmgrName(fillSpace(4));
								setIp82921ErrTargetQName(fillSpace(11));
								setIp82921ErrCompCd(0L);
								setIp82921ErrResnCd(0L);
								setIp82921ErrMsg(fillSpace(30));
    }



	/**
	 * 	initializes Ip82921ErrMsgOut
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp82921ErrPayloadMsg().initialize();
     
         setIp82921ErrRequestCd(CONSTANTS.SPACE_3);
         setIp82921ErrTargetQmgrName(CONSTANTS.SPACE_4);
         setIp82921ErrTargetQName(CONSTANTS.SPACE_11);
                     setIp82921ErrCompCd(0);
                     setIp82921ErrResnCd(0);
         setIp82921ErrMsg(CONSTANTS.SPACE_30);
   }


}
  
