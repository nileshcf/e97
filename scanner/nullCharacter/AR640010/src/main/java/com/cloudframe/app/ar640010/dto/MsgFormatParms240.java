package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgFormatParms240 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MsgFormatParms240 extends MsgFormatParms240Serialized { 
   

						private char[] gftSubsystemId240 = new char[4];

						private char[] msgNum240 = new char[3];

						private char[] msgSeverityInd240 = new char[1];

						private char[] msgTypeInd240 = new char[4];

						private char[] msgBulkid240 = new char[4];

						private char[] msgEndpt240 = new char[7];

								private short msgCyclNum240;

						private char[] msgFilename240 = new char[44];

						private char[] xferMthd240 = new char[3];

						private char[] xferMthdNode240 = new char[20];

						private char[] xferProcId240 = new char[20];

						private char[] xferMthdMsgId240 = new char[20];

						private char[] msgErrCd240 = new char[4];

						private char[] msgStatRefId240 = new char[4];

						private char[] msgStatRefDesc240 = new char[80];

						private char[] msgErrorDescription240 = new char[400];
			private List<MsgErr240> msgErr240 = new ArrayList<>();
    	

						private char[] msgProgName240 = new char[8];

						private char[] msgParaName240 = new char[30];

						private char[] msgBusPrtnrId240 = new char[6];

						private char[] msgAbendCd240 = new char[5];
	
	/**
	* Constructor for MsgFormatParms240
	**/
    public MsgFormatParms240() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < MSG_ERR_240_SIZE;arrayIndex++) {
						msgErr240.add(new MsgErr240(this, beginMsgErr240 + 
						arrayIndex * MsgErr240.getMsgErr240FieldLength()));
				}
	   	/*  end of offset */
								setGftSubsystemId240(fillSpace(4));
								setMsgNum240(fillSpace(3));
								setMsgSeverityInd240(fillSpace(1));
								setMsgTypeInd240(fillSpace(4));
								setMsgBulkid240(fillSpace(4));
								setMsgEndpt240(fillSpace(7));
								setMsgCyclNum240((short)0);
								setMsgFilename240(fillSpace(44));
								setXferMthd240(fillSpace(3));
								setXferMthdNode240(fillSpace(20));
								setXferProcId240(fillSpace(20));
								setXferMthdMsgId240(fillSpace(20));
								setMsgErrCd240(fillSpace(4));
								setMsgStatRefId240(fillSpace(4));
								setMsgStatRefDesc240(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setMsgErrorDescription240(pad(400," ".toCharArray(),' ',RIGHT_PAD));
								setMsgProgName240(fillSpace(8));
								setMsgParaName240(fillSpace(30));
								setMsgBusPrtnrId240(fillSpace(6));
								setMsgAbendCd240(fillSpace(5));
    }


 

	/**
	 *	Returns the value of gftSubsystemId240
	 *	@return gftSubsystemId240
	 */
   public char[] getGftSubsystemId240() throws CFException{
     if (isGftSubsystemId240Modified()) { 
        gftSubsystemId240 = refreshGftSubsystemId240();
     }
   		return gftSubsystemId240;
   }

  
	/**
	*  set variable gftSubsystemId240
	*  Corresponding COBOL Variable is 240-GFT-SUBSYSTEM-ID
	*  @param value
	**/
   public void setGftSubsystemId240(char[] value) {
      gftSubsystemId240 = checkGftSubsystemId240Constraints(value);
      serializeGftSubsystemId240(gftSubsystemId240);
   } 

     /**
	 * 	Update GftSubsystemId240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftSubsystemId240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftSubsystemId240,gftSubsystemId240.length);
   	
   }
   
   public void setGftSubsystemId240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftSubsystemId240,gftSubsystemId240.length);
   	
   }
   
     /**
	 * 	Update GftSubsystemId240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftSubsystemId240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftSubsystemId240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftSubsystemId240 with another Field
	 *	@param value
	 */
   public void setGftSubsystemId240(Field source) {
       replace(source,0,source.length(),beginGftSubsystemId240,GFT_SUBSYSTEM_ID_240_LEN);
   	
   }  
   
     /**
	 * 	Update GftSubsystemId240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftSubsystemId240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftSubsystemId240,GFT_SUBSYSTEM_ID_240_LEN);
   	
   }
   
     /**
	 * 	Update GftSubsystemId240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftSubsystemId240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftSubsystemId240+targetIndex,targetLen);
    
   }
	char[] gftClassic8824088Value = "GFTC".toCharArray();
	/**
	 *	Test condition "GFTC" for isGftClassic88240()
	 *	@return  Returns true if isGftClassic88240() is "GFTC"
	 */
   public boolean isGftClassic88240() throws CFException {
      return (  compareChars( getGftSubsystemId240() , gftClassic8824088Value)  == 0  );
   }


	/**
	*  set values "GFTC"
	*/
   	public void setGftClassic88240True() {  			
    	setGftSubsystemId240( gftClassic8824088Value);
   	}
	char[] gftHub8824088Value = "GFTH".toCharArray();
	/**
	 *	Test condition "GFTH" for isGftHub88240()
	 *	@return  Returns true if isGftHub88240() is "GFTH"
	 */
   public boolean isGftHub88240() throws CFException {
      return (  compareChars( getGftSubsystemId240() , gftHub8824088Value)  == 0  );
   }


	/**
	*  set values "GFTH"
	*/
   	public void setGftHub88240True() {  			
    	setGftSubsystemId240( gftHub8824088Value);
   	}
	char[] gftMainframe8824088Value = "GFTM".toCharArray();
	/**
	 *	Test condition "GFTM" for isGftMainframe88240()
	 *	@return  Returns true if isGftMainframe88240() is "GFTM"
	 */
   public boolean isGftMainframe88240() throws CFException {
      return (  compareChars( getGftSubsystemId240() , gftMainframe8824088Value)  == 0  );
   }


	/**
	*  set values "GFTM"
	*/
   	public void setGftMainframe88240True() {  			
    	setGftSubsystemId240( gftMainframe8824088Value);
   	}
	char[] gftMfts8824088Value = "MFTS".toCharArray();
	/**
	 *	Test condition "MFTS" for isGftMfts88240()
	 *	@return  Returns true if isGftMfts88240() is "MFTS"
	 */
   public boolean isGftMfts88240() throws CFException {
      return (  compareChars( getGftSubsystemId240() , gftMfts8824088Value)  == 0  );
   }


	/**
	*  set values "MFTS"
	*/
   	public void setGftMfts88240True() {  			
    	setGftSubsystemId240( gftMfts8824088Value);
   	}
	/**
	 *	Returns the value of msgNum240
	 *	@return msgNum240
	 */
   public char[] getMsgNum240() throws CFException{
     if (isMsgNum240Modified()) { 
        msgNum240 = refreshMsgNum240();
     }
   		return msgNum240;
   }

  
	/**
	*  set variable msgNum240
	*  Corresponding COBOL Variable is 240-MSG-NUM
	*  @param value
	**/
   public void setMsgNum240(char[] value) {
      msgNum240 = checkMsgNum240Constraints(value);
      serializeMsgNum240(msgNum240);
   } 

     /**
	 * 	Update MsgNum240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgNum240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgNum240,msgNum240.length);
   	
   }
   
   public void setMsgNum240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgNum240,msgNum240.length);
   	
   }
   
     /**
	 * 	Update MsgNum240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgNum240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgNum240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgNum240 with another Field
	 *	@param value
	 */
   public void setMsgNum240(Field source) {
       replace(source,0,source.length(),beginMsgNum240,MSG_NUM_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgNum240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgNum240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgNum240,MSG_NUM_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgNum240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgNum240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgNum240+targetIndex,targetLen);
    
   }
	char[] cdOutbMgr8824088Value = "101".toCharArray();
	/**
	 *	Test condition "101" for isCdOutbMgr88240()
	 *	@return  Returns true if isCdOutbMgr88240() is "101"
	 */
   public boolean isCdOutbMgr88240() throws CFException {
      return (  compareChars( getMsgNum240() , cdOutbMgr8824088Value)  == 0  );
   }


	/**
	*  set values "101"
	*/
   	public void setCdOutbMgr88240True() {  			
    	setMsgNum240( cdOutbMgr8824088Value);
   	}
	char[] cdActvtyMgr8824088Value = "102".toCharArray();
	/**
	 *	Test condition "102" for isCdActvtyMgr88240()
	 *	@return  Returns true if isCdActvtyMgr88240() is "102"
	 */
   public boolean isCdActvtyMgr88240() throws CFException {
      return (  compareChars( getMsgNum240() , cdActvtyMgr8824088Value)  == 0  );
   }


	/**
	*  set values "102"
	*/
   	public void setCdActvtyMgr88240True() {  			
    	setMsgNum240( cdActvtyMgr8824088Value);
   	}
	char[] cdAcvtyPrcTrmUpd8824088Value = "112".toCharArray();
	/**
	 *	Test condition "112" for isCdAcvtyPrcTrmUpd88240()
	 *	@return  Returns true if isCdAcvtyPrcTrmUpd88240() is "112"
	 */
   public boolean isCdAcvtyPrcTrmUpd88240() throws CFException {
      return (  compareChars( getMsgNum240() , cdAcvtyPrcTrmUpd8824088Value)  == 0  );
   }


	/**
	*  set values "112"
	*/
   	public void setCdAcvtyPrcTrmUpd88240True() {  			
    	setMsgNum240( cdAcvtyPrcTrmUpd8824088Value);
   	}
	char[] cdAcvtyPrcTrmNoupd8824088Value = "122".toCharArray();
	/**
	 *	Test condition "122" for isCdAcvtyPrcTrmNoupd88240()
	 *	@return  Returns true if isCdAcvtyPrcTrmNoupd88240() is "122"
	 */
   public boolean isCdAcvtyPrcTrmNoupd88240() throws CFException {
      return (  compareChars( getMsgNum240() , cdAcvtyPrcTrmNoupd8824088Value)  == 0  );
   }


	/**
	*  set values "122"
	*/
   	public void setCdAcvtyPrcTrmNoupd88240True() {  			
    	setMsgNum240( cdAcvtyPrcTrmNoupd8824088Value);
   	}
	char[] cdActvtyMissSite8824088Value = "132".toCharArray();
	/**
	 *	Test condition "132" for isCdActvtyMissSite88240()
	 *	@return  Returns true if isCdActvtyMissSite88240() is "132"
	 */
   public boolean isCdActvtyMissSite88240() throws CFException {
      return (  compareChars( getMsgNum240() , cdActvtyMissSite8824088Value)  == 0  );
   }


	/**
	*  set values "132"
	*/
   	public void setCdActvtyMissSite88240True() {  			
    	setMsgNum240( cdActvtyMissSite8824088Value);
   	}
	char[] cdAcvtyMissEfp8824088Value = "142".toCharArray();
	/**
	 *	Test condition "142" for isCdAcvtyMissEfp88240()
	 *	@return  Returns true if isCdAcvtyMissEfp88240() is "142"
	 */
   public boolean isCdAcvtyMissEfp88240() throws CFException {
      return (  compareChars( getMsgNum240() , cdAcvtyMissEfp8824088Value)  == 0  );
   }


	/**
	*  set values "142"
	*/
   	public void setCdAcvtyMissEfp88240True() {  			
    	setMsgNum240( cdAcvtyMissEfp8824088Value);
   	}
	char[] applExitMgr8824088Value = "103".toCharArray();
	/**
	 *	Test condition "103" for isApplExitMgr88240()
	 *	@return  Returns true if isApplExitMgr88240() is "103"
	 */
   public boolean isApplExitMgr88240() throws CFException {
      return (  compareChars( getMsgNum240() , applExitMgr8824088Value)  == 0  );
   }


	/**
	*  set values "103"
	*/
   	public void setApplExitMgr88240True() {  			
    	setMsgNum240( applExitMgr8824088Value);
   	}
	char[] ipelOutbMgr8824088Value = "104".toCharArray();
	/**
	 *	Test condition "104" for isIpelOutbMgr88240()
	 *	@return  Returns true if isIpelOutbMgr88240() is "104"
	 */
   public boolean isIpelOutbMgr88240() throws CFException {
      return (  compareChars( getMsgNum240() , ipelOutbMgr8824088Value)  == 0  );
   }


	/**
	*  set values "104"
	*/
   	public void setIpelOutbMgr88240True() {  			
    	setMsgNum240( ipelOutbMgr8824088Value);
   	}
	char[] ipelActvtyMgr8824088Value = "105".toCharArray();
	/**
	 *	Test condition "105" for isIpelActvtyMgr88240()
	 *	@return  Returns true if isIpelActvtyMgr88240() is "105"
	 */
   public boolean isIpelActvtyMgr88240() throws CFException {
      return (  compareChars( getMsgNum240() , ipelActvtyMgr8824088Value)  == 0  );
   }


	/**
	*  set values "105"
	*/
   	public void setIpelActvtyMgr88240True() {  			
    	setMsgNum240( ipelActvtyMgr8824088Value);
   	}
	char[] mfeOutbMgr8824088Value = "106".toCharArray();
	/**
	 *	Test condition "106" for isMfeOutbMgr88240()
	 *	@return  Returns true if isMfeOutbMgr88240() is "106"
	 */
   public boolean isMfeOutbMgr88240() throws CFException {
      return (  compareChars( getMsgNum240() , mfeOutbMgr8824088Value)  == 0  );
   }


	/**
	*  set values "106"
	*/
   	public void setMfeOutbMgr88240True() {  			
    	setMsgNum240( mfeOutbMgr8824088Value);
   	}
	char[] sdpushOutbMgr8824088Value = "107".toCharArray();
	/**
	 *	Test condition "107" for isSdpushOutbMgr88240()
	 *	@return  Returns true if isSdpushOutbMgr88240() is "107"
	 */
   public boolean isSdpushOutbMgr88240() throws CFException {
      return (  compareChars( getMsgNum240() , sdpushOutbMgr8824088Value)  == 0  );
   }


	/**
	*  set values "107"
	*/
   	public void setSdpushOutbMgr88240True() {  			
    	setMsgNum240( sdpushOutbMgr8824088Value);
   	}
	char[] gftFtApi8824088Value = "108".toCharArray();
	/**
	 *	Test condition "108" for isGftFtApi88240()
	 *	@return  Returns true if isGftFtApi88240() is "108"
	 */
   public boolean isGftFtApi88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftFtApi8824088Value)  == 0  );
   }


	/**
	*  set values "108"
	*/
   	public void setGftFtApi88240True() {  			
    	setMsgNum240( gftFtApi8824088Value);
   	}
	char[] gftFtApiMissEpt8824088Value = "118".toCharArray();
	/**
	 *	Test condition "118" for isGftFtApiMissEpt88240()
	 *	@return  Returns true if isGftFtApiMissEpt88240() is "118"
	 */
   public boolean isGftFtApiMissEpt88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftFtApiMissEpt8824088Value)  == 0  );
   }


	/**
	*  set values "118"
	*/
   	public void setGftFtApiMissEpt88240True() {  			
    	setMsgNum240( gftFtApiMissEpt8824088Value);
   	}
	char[] gftFtApiMissEfp8824088Value = "128".toCharArray();
	/**
	 *	Test condition "128" for isGftFtApiMissEfp88240()
	 *	@return  Returns true if isGftFtApiMissEfp88240() is "128"
	 */
   public boolean isGftFtApiMissEfp88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftFtApiMissEfp8824088Value)  == 0  );
   }


	/**
	*  set values "128"
	*/
   	public void setGftFtApiMissEfp88240True() {  			
    	setMsgNum240( gftFtApiMissEfp8824088Value);
   	}
	char[] gftFtApiApplTkn8824088Value = "109".toCharArray();
	/**
	 *	Test condition "109" for isGftFtApiApplTkn88240()
	 *	@return  Returns true if isGftFtApiApplTkn88240() is "109"
	 */
   public boolean isGftFtApiApplTkn88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftFtApiApplTkn8824088Value)  == 0  );
   }


	/**
	*  set values "109"
	*/
   	public void setGftFtApiApplTkn88240True() {  			
    	setMsgNum240( gftFtApiApplTkn8824088Value);
   	}
	char[] gftStatUpdateUtlt8824088Value = "201".toCharArray();
	/**
	 *	Test condition "201" for isGftStatUpdateUtlt88240()
	 *	@return  Returns true if isGftStatUpdateUtlt88240() is "201"
	 */
   public boolean isGftStatUpdateUtlt88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftStatUpdateUtlt8824088Value)  == 0  );
   }


	/**
	*  set values "201"
	*/
   	public void setGftStatUpdateUtlt88240True() {  			
    	setMsgNum240( gftStatUpdateUtlt8824088Value);
   	}
	char[] gftStatUpdtUtltDb28824088Value = "202".toCharArray();
	/**
	 *	Test condition "202" for isGftStatUpdtUtltDb288240()
	 *	@return  Returns true if isGftStatUpdtUtltDb288240() is "202"
	 */
   public boolean isGftStatUpdtUtltDb288240() throws CFException {
      return (  compareChars( getMsgNum240() , gftStatUpdtUtltDb28824088Value)  == 0  );
   }


	/**
	*  set values "202"
	*/
   	public void setGftStatUpdtUtltDb288240True() {  			
    	setMsgNum240( gftStatUpdtUtltDb28824088Value);
   	}
	char[] gftJobNameNumReset8824088Value = "203".toCharArray();
	/**
	 *	Test condition "203" for isGftJobNameNumReset88240()
	 *	@return  Returns true if isGftJobNameNumReset88240() is "203"
	 */
   public boolean isGftJobNameNumReset88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftJobNameNumReset8824088Value)  == 0  );
   }


	/**
	*  set values "203"
	*/
   	public void setGftJobNameNumReset88240True() {  			
    	setMsgNum240( gftJobNameNumReset8824088Value);
   	}
	char[] gftKeyFilterReset8824088Value = "204".toCharArray();
	/**
	 *	Test condition "204" for isGftKeyFilterReset88240()
	 *	@return  Returns true if isGftKeyFilterReset88240() is "204"
	 */
   public boolean isGftKeyFilterReset88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftKeyFilterReset8824088Value)  == 0  );
   }


	/**
	*  set values "204"
	*/
   	public void setGftKeyFilterReset88240True() {  			
    	setMsgNum240( gftKeyFilterReset8824088Value);
   	}
	char[] netwrkMonMenu8824088Value = "205".toCharArray();
	/**
	 *	Test condition "205" for isNetwrkMonMenu88240()
	 *	@return  Returns true if isNetwrkMonMenu88240() is "205"
	 */
   public boolean isNetwrkMonMenu88240() throws CFException {
      return (  compareChars( getMsgNum240() , netwrkMonMenu8824088Value)  == 0  );
   }


	/**
	*  set values "205"
	*/
   	public void setNetwrkMonMenu88240True() {  			
    	setMsgNum240( netwrkMonMenu8824088Value);
   	}
	char[] fxsTrsholdViolation8824088Value = "301".toCharArray();
	/**
	 *	Test condition "301" for isFxsTrsholdViolation88240()
	 *	@return  Returns true if isFxsTrsholdViolation88240() is "301"
	 */
   public boolean isFxsTrsholdViolation88240() throws CFException {
      return (  compareChars( getMsgNum240() , fxsTrsholdViolation8824088Value)  == 0  );
   }


	/**
	*  set values "301"
	*/
   	public void setFxsTrsholdViolation88240True() {  			
    	setMsgNum240( fxsTrsholdViolation8824088Value);
   	}
	char[] scdTrsholdViolation8824088Value = "302".toCharArray();
	/**
	 *	Test condition "302" for isScdTrsholdViolation88240()
	 *	@return  Returns true if isScdTrsholdViolation88240() is "302"
	 */
   public boolean isScdTrsholdViolation88240() throws CFException {
      return (  compareChars( getMsgNum240() , scdTrsholdViolation8824088Value)  == 0  );
   }


	/**
	*  set values "302"
	*/
   	public void setScdTrsholdViolation88240True() {  			
    	setMsgNum240( scdTrsholdViolation8824088Value);
   	}
	char[] gf1TrsholdViolation8824088Value = "303".toCharArray();
	/**
	 *	Test condition "303" for isGf1TrsholdViolation88240()
	 *	@return  Returns true if isGf1TrsholdViolation88240() is "303"
	 */
   public boolean isGf1TrsholdViolation88240() throws CFException {
      return (  compareChars( getMsgNum240() , gf1TrsholdViolation8824088Value)  == 0  );
   }


	/**
	*  set values "303"
	*/
   	public void setGf1TrsholdViolation88240True() {  			
    	setMsgNum240( gf1TrsholdViolation8824088Value);
   	}
	char[] procTrsholdViolation8824088Value = "304".toCharArray();
	/**
	 *	Test condition "304" for isProcTrsholdViolation88240()
	 *	@return  Returns true if isProcTrsholdViolation88240() is "304"
	 */
   public boolean isProcTrsholdViolation88240() throws CFException {
      return (  compareChars( getMsgNum240() , procTrsholdViolation8824088Value)  == 0  );
   }


	/**
	*  set values "304"
	*/
   	public void setProcTrsholdViolation88240True() {  			
    	setMsgNum240( procTrsholdViolation8824088Value);
   	}
	char[] flWaitTshldViolatn8824088Value = "305".toCharArray();
	/**
	 *	Test condition "305" for isFlWaitTshldViolatn88240()
	 *	@return  Returns true if isFlWaitTshldViolatn88240() is "305"
	 */
   public boolean isFlWaitTshldViolatn88240() throws CFException {
      return (  compareChars( getMsgNum240() , flWaitTshldViolatn8824088Value)  == 0  );
   }


	/**
	*  set values "305"
	*/
   	public void setFlWaitTshldViolatn88240True() {  			
    	setMsgNum240( flWaitTshldViolatn8824088Value);
   	}
	char[] ipsTrsholdViolation8824088Value = "306".toCharArray();
	/**
	 *	Test condition "306" for isIpsTrsholdViolation88240()
	 *	@return  Returns true if isIpsTrsholdViolation88240() is "306"
	 */
   public boolean isIpsTrsholdViolation88240() throws CFException {
      return (  compareChars( getMsgNum240() , ipsTrsholdViolation8824088Value)  == 0  );
   }


	/**
	*  set values "306"
	*/
   	public void setIpsTrsholdViolation88240True() {  			
    	setMsgNum240( ipsTrsholdViolation8824088Value);
   	}
	char[] gftHostInterface8824088Value = "401".toCharArray();
	/**
	 *	Test condition "401" for isGftHostInterface88240()
	 *	@return  Returns true if isGftHostInterface88240() is "401"
	 */
   public boolean isGftHostInterface88240() throws CFException {
      return (  compareChars( getMsgNum240() , gftHostInterface8824088Value)  == 0  );
   }


	/**
	*  set values "401"
	*/
   	public void setGftHostInterface88240True() {  			
    	setMsgNum240( gftHostInterface8824088Value);
   	}
	/**
	 *	Returns the value of msgSeverityInd240
	 *	@return msgSeverityInd240
	 */
   public char[] getMsgSeverityInd240() throws CFException{
     if (isMsgSeverityInd240Modified()) { 
        msgSeverityInd240 = refreshMsgSeverityInd240();
     }
   		return msgSeverityInd240;
   }

  
	/**
	*  set variable msgSeverityInd240
	*  Corresponding COBOL Variable is 240-MSG-SEVERITY-IND
	*  @param value
	**/
   public void setMsgSeverityInd240(char[] value) {
      msgSeverityInd240 = checkMsgSeverityInd240Constraints(value);
      serializeMsgSeverityInd240(msgSeverityInd240);
   } 

     /**
	 * 	Update MsgSeverityInd240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgSeverityInd240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgSeverityInd240,msgSeverityInd240.length);
   	
   }
   
   public void setMsgSeverityInd240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgSeverityInd240,msgSeverityInd240.length);
   	
   }
   
     /**
	 * 	Update MsgSeverityInd240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgSeverityInd240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgSeverityInd240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgSeverityInd240 with another Field
	 *	@param value
	 */
   public void setMsgSeverityInd240(Field source) {
       replace(source,0,source.length(),beginMsgSeverityInd240,MSG_SEVERITY_IND_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgSeverityInd240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgSeverityInd240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgSeverityInd240,MSG_SEVERITY_IND_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgSeverityInd240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgSeverityInd240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgSeverityInd240+targetIndex,targetLen);
    
   }
	char[] msgSeverityClr8824088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isMsgSeverityClr88240()
	 *	@return  Returns true if isMsgSeverityClr88240() is "C"
	 */
   public boolean isMsgSeverityClr88240() throws CFException {
      return (  compareChars( getMsgSeverityInd240() , msgSeverityClr8824088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setMsgSeverityClr88240True() {  			
    	setMsgSeverityInd240( msgSeverityClr8824088Value);
   	}
	char[] msgSeverityInf8824088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isMsgSeverityInf88240()
	 *	@return  Returns true if isMsgSeverityInf88240() is "I"
	 */
   public boolean isMsgSeverityInf88240() throws CFException {
      return (  compareChars( getMsgSeverityInd240() , msgSeverityInf8824088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setMsgSeverityInf88240True() {  			
    	setMsgSeverityInd240( msgSeverityInf8824088Value);
   	}
	char[] msgSeverityMinor8824088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isMsgSeverityMinor88240()
	 *	@return  Returns true if isMsgSeverityMinor88240() is "M"
	 */
   public boolean isMsgSeverityMinor88240() throws CFException {
      return (  compareChars( getMsgSeverityInd240() , msgSeverityMinor8824088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setMsgSeverityMinor88240True() {  			
    	setMsgSeverityInd240( msgSeverityMinor8824088Value);
   	}
	char[] msgSeverityWrn8824088Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isMsgSeverityWrn88240()
	 *	@return  Returns true if isMsgSeverityWrn88240() is "W"
	 */
   public boolean isMsgSeverityWrn88240() throws CFException {
      return (  compareChars( getMsgSeverityInd240() , msgSeverityWrn8824088Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setMsgSeverityWrn88240True() {  			
    	setMsgSeverityInd240( msgSeverityWrn8824088Value);
   	}
	char[] msgSeverityErr8824088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isMsgSeverityErr88240()
	 *	@return  Returns true if isMsgSeverityErr88240() is "E"
	 */
   public boolean isMsgSeverityErr88240() throws CFException {
      return (  compareChars( getMsgSeverityInd240() , msgSeverityErr8824088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setMsgSeverityErr88240True() {  			
    	setMsgSeverityInd240( msgSeverityErr8824088Value);
   	}
	char[] msgSeverityFatal8824088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isMsgSeverityFatal88240()
	 *	@return  Returns true if isMsgSeverityFatal88240() is "F"
	 */
   public boolean isMsgSeverityFatal88240() throws CFException {
      return (  compareChars( getMsgSeverityInd240() , msgSeverityFatal8824088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setMsgSeverityFatal88240True() {  			
    	setMsgSeverityInd240( msgSeverityFatal8824088Value);
   	}
	/**
	 *	Returns the value of msgTypeInd240
	 *	@return msgTypeInd240
	 */
   public char[] getMsgTypeInd240() throws CFException{
     if (isMsgTypeInd240Modified()) { 
        msgTypeInd240 = refreshMsgTypeInd240();
     }
   		return msgTypeInd240;
   }

  
	/**
	*  set variable msgTypeInd240
	*  Corresponding COBOL Variable is 240-MSG-TYPE-IND
	*  @param value
	**/
   public void setMsgTypeInd240(char[] value) {
      msgTypeInd240 = checkMsgTypeInd240Constraints(value);
      serializeMsgTypeInd240(msgTypeInd240);
   } 

     /**
	 * 	Update MsgTypeInd240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgTypeInd240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgTypeInd240,msgTypeInd240.length);
   	
   }
   
   public void setMsgTypeInd240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgTypeInd240,msgTypeInd240.length);
   	
   }
   
     /**
	 * 	Update MsgTypeInd240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgTypeInd240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgTypeInd240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgTypeInd240 with another Field
	 *	@param value
	 */
   public void setMsgTypeInd240(Field source) {
       replace(source,0,source.length(),beginMsgTypeInd240,MSG_TYPE_IND_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgTypeInd240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgTypeInd240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgTypeInd240,MSG_TYPE_IND_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgTypeInd240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgTypeInd240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgTypeInd240+targetIndex,targetLen);
    
   }
	char[] errWithClrng8824088Value = "0100".toCharArray();
	/**
	 *	Test condition "0100" for isErrWithClrng88240()
	 *	@return  Returns true if isErrWithClrng88240() is "0100"
	 */
   public boolean isErrWithClrng88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , errWithClrng8824088Value)  == 0  );
   }


	/**
	*  set values "0100"
	*/
   	public void setErrWithClrng88240True() {  			
    	setMsgTypeInd240( errWithClrng8824088Value);
   	}
	char[] errClred8824088Value = "0110".toCharArray();
	/**
	 *	Test condition "0110" for isErrClred88240()
	 *	@return  Returns true if isErrClred88240() is "0110"
	 */
   public boolean isErrClred88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , errClred8824088Value)  == 0  );
   }


	/**
	*  set values "0110"
	*/
   	public void setErrClred88240True() {  			
    	setMsgTypeInd240( errClred8824088Value);
   	}
	char[] errWoutClrng8824088Value = "0200".toCharArray();
	/**
	 *	Test condition "0200" for isErrWoutClrng88240()
	 *	@return  Returns true if isErrWoutClrng88240() is "0200"
	 */
   public boolean isErrWoutClrng88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , errWoutClrng8824088Value)  == 0  );
   }


	/**
	*  set values "0200"
	*/
   	public void setErrWoutClrng88240True() {  			
    	setMsgTypeInd240( errWoutClrng8824088Value);
   	}
	char[] tsholdViolate8824088Value = "0300".toCharArray();
	/**
	 *	Test condition "0300" for isTsholdViolate88240()
	 *	@return  Returns true if isTsholdViolate88240() is "0300"
	 */
   public boolean isTsholdViolate88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , tsholdViolate8824088Value)  == 0  );
   }


	/**
	*  set values "0300"
	*/
   	public void setTsholdViolate88240True() {  			
    	setMsgTypeInd240( tsholdViolate8824088Value);
   	}
	char[] ftTsholdViolate8824088Value = "0310".toCharArray();
	/**
	 *	Test condition "0310" for isFtTsholdViolate88240()
	 *	@return  Returns true if isFtTsholdViolate88240() is "0310"
	 */
   public boolean isFtTsholdViolate88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , ftTsholdViolate8824088Value)  == 0  );
   }


	/**
	*  set values "0310"
	*/
   	public void setFtTsholdViolate88240True() {  			
    	setMsgTypeInd240( ftTsholdViolate8824088Value);
   	}
	char[] faTsholdViolate8824088Value = "0320".toCharArray();
	/**
	 *	Test condition "0320" for isFaTsholdViolate88240()
	 *	@return  Returns true if isFaTsholdViolate88240() is "0320"
	 */
   public boolean isFaTsholdViolate88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , faTsholdViolate8824088Value)  == 0  );
   }


	/**
	*  set values "0320"
	*/
   	public void setFaTsholdViolate88240True() {  			
    	setMsgTypeInd240( faTsholdViolate8824088Value);
   	}
	char[] peTsholdViolate8824088Value = "0330".toCharArray();
	/**
	 *	Test condition "0330" for isPeTsholdViolate88240()
	 *	@return  Returns true if isPeTsholdViolate88240() is "0330"
	 */
   public boolean isPeTsholdViolate88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , peTsholdViolate8824088Value)  == 0  );
   }


	/**
	*  set values "0330"
	*/
   	public void setPeTsholdViolate88240True() {  			
    	setMsgTypeInd240( peTsholdViolate8824088Value);
   	}
	char[] msgControl8824088Value = "0900".toCharArray();
	/**
	 *	Test condition "0900" for isMsgControl88240()
	 *	@return  Returns true if isMsgControl88240() is "0900"
	 */
   public boolean isMsgControl88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , msgControl8824088Value)  == 0  );
   }


	/**
	*  set values "0900"
	*/
   	public void setMsgControl88240True() {  			
    	setMsgTypeInd240( msgControl8824088Value);
   	}
	char[] msgDonotSend8824088Value = "0910".toCharArray();
	/**
	 *	Test condition "0910" for isMsgDonotSend88240()
	 *	@return  Returns true if isMsgDonotSend88240() is "0910"
	 */
   public boolean isMsgDonotSend88240() throws CFException {
      return (  compareChars( getMsgTypeInd240() , msgDonotSend8824088Value)  == 0  );
   }


	/**
	*  set values "0910"
	*/
   	public void setMsgDonotSend88240True() {  			
    	setMsgTypeInd240( msgDonotSend8824088Value);
   	}
	/**
	 *	Returns the value of msgBulkid240
	 *	@return msgBulkid240
	 */
   public char[] getMsgBulkid240() throws CFException{
     if (isMsgBulkid240Modified()) { 
        msgBulkid240 = refreshMsgBulkid240();
     }
   		return msgBulkid240;
   }

  
	/**
	*  set variable msgBulkid240
	*  Corresponding COBOL Variable is 240-MSG-BULKID
	*  @param value
	**/
   public void setMsgBulkid240(char[] value) {
      msgBulkid240 = checkMsgBulkid240Constraints(value);
      serializeMsgBulkid240(msgBulkid240);
   } 

     /**
	 * 	Update MsgBulkid240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgBulkid240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgBulkid240,msgBulkid240.length);
   	
   }
   
   public void setMsgBulkid240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgBulkid240,msgBulkid240.length);
   	
   }
   
     /**
	 * 	Update MsgBulkid240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgBulkid240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgBulkid240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgBulkid240 with another Field
	 *	@param value
	 */
   public void setMsgBulkid240(Field source) {
       replace(source,0,source.length(),beginMsgBulkid240,MSG_BULKID_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgBulkid240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgBulkid240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgBulkid240,MSG_BULKID_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgBulkid240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgBulkid240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgBulkid240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgEndpt240
	 *	@return msgEndpt240
	 */
   public char[] getMsgEndpt240() throws CFException{
     if (isMsgEndpt240Modified()) { 
        msgEndpt240 = refreshMsgEndpt240();
     }
   		return msgEndpt240;
   }

  
	/**
	*  set variable msgEndpt240
	*  Corresponding COBOL Variable is 240-MSG-ENDPT
	*  @param value
	**/
   public void setMsgEndpt240(char[] value) {
      msgEndpt240 = checkMsgEndpt240Constraints(value);
      serializeMsgEndpt240(msgEndpt240);
   } 

     /**
	 * 	Update MsgEndpt240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgEndpt240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgEndpt240,msgEndpt240.length);
   	
   }
   
   public void setMsgEndpt240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgEndpt240,msgEndpt240.length);
   	
   }
   
     /**
	 * 	Update MsgEndpt240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgEndpt240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgEndpt240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgEndpt240 with another Field
	 *	@param value
	 */
   public void setMsgEndpt240(Field source) {
       replace(source,0,source.length(),beginMsgEndpt240,MSG_ENDPT_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgEndpt240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgEndpt240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgEndpt240,MSG_ENDPT_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgEndpt240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgEndpt240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgEndpt240+targetIndex,targetLen);
    
   }
	public short getMsgCyclNum240() throws CFException {
        if (isMsgCyclNum240Modified()) { 
           msgCyclNum240 = refreshMsgCyclNum240();
        }
   		return msgCyclNum240;
	}
	
	/**
	 * 	Update MsgCyclNum240 with the passed value
	 *  Corresponding COBOL Variable is 240-MSG-CYCL-NUM
	 *	@param number
	 */
	public void setMsgCyclNum240(short number) {
			msgCyclNum240 = checkMsgCyclNum240MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMsgCyclNum240(msgCyclNum240);
	}

	public void setMsgCyclNum240(int number) {
	    number = checkMsgCyclNum240MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMsgCyclNum240((short)number);
	}
	public void setMsgCyclNum240(long number) {
	    number = checkMsgCyclNum240MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMsgCyclNum240((short)number);
	}
	

	/**
	 *	Returns the value of msgFilename240
	 *	@return msgFilename240
	 */
   public char[] getMsgFilename240() throws CFException{
     if (isMsgFilename240Modified()) { 
        msgFilename240 = refreshMsgFilename240();
     }
   		return msgFilename240;
   }

  
	/**
	*  set variable msgFilename240
	*  Corresponding COBOL Variable is 240-MSG-FILENAME
	*  @param value
	**/
   public void setMsgFilename240(char[] value) {
      msgFilename240 = checkMsgFilename240Constraints(value);
      serializeMsgFilename240(msgFilename240);
   } 

     /**
	 * 	Update MsgFilename240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgFilename240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgFilename240,msgFilename240.length);
   	
   }
   
   public void setMsgFilename240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgFilename240,msgFilename240.length);
   	
   }
   
     /**
	 * 	Update MsgFilename240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgFilename240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgFilename240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgFilename240 with another Field
	 *	@param value
	 */
   public void setMsgFilename240(Field source) {
       replace(source,0,source.length(),beginMsgFilename240,MSG_FILENAME_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgFilename240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgFilename240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgFilename240,MSG_FILENAME_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgFilename240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgFilename240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgFilename240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xferMthd240
	 *	@return xferMthd240
	 */
   public char[] getXferMthd240() throws CFException{
     if (isXferMthd240Modified()) { 
        xferMthd240 = refreshXferMthd240();
     }
   		return xferMthd240;
   }

  
	/**
	*  set variable xferMthd240
	*  Corresponding COBOL Variable is 240-XFER-MTHD
	*  @param value
	**/
   public void setXferMthd240(char[] value) {
      xferMthd240 = checkXferMthd240Constraints(value);
      serializeXferMthd240(xferMthd240);
   } 

     /**
	 * 	Update XferMthd240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXferMthd240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXferMthd240,xferMthd240.length);
   	
   }
   
   public void setXferMthd240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthd240,xferMthd240.length);
   	
   }
   
     /**
	 * 	Update XferMthd240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXferMthd240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthd240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XferMthd240 with another Field
	 *	@param value
	 */
   public void setXferMthd240(Field source) {
       replace(source,0,source.length(),beginXferMthd240,XFER_MTHD_240_LEN);
   	
   }  
   
     /**
	 * 	Update XferMthd240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXferMthd240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXferMthd240,XFER_MTHD_240_LEN);
   	
   }
   
     /**
	 * 	Update XferMthd240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXferMthd240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthd240+targetIndex,targetLen);
    
   }
	char[] connectDirect8824088Value = "C  ".toCharArray();
	/**
	 *	Test condition "C" for isConnectDirect88240()
	 *	@return  Returns true if isConnectDirect88240() is "C"
	 */
   public boolean isConnectDirect88240() throws CFException {
      return (  compareChars( getXferMthd240() , connectDirect8824088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setConnectDirect88240True() {  			
    	setXferMthd240( connectDirect8824088Value);
   	}
	char[] mfts8824088Value = "F  ".toCharArray();
	/**
	 *	Test condition "F" for isMfts88240()
	 *	@return  Returns true if isMfts88240() is "F"
	 */
   public boolean isMfts88240() throws CFException {
      return (  compareChars( getXferMthd240() , mfts8824088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setMfts88240True() {  			
    	setXferMthd240( mfts8824088Value);
   	}
	char[] mfe8824088Value = "M  ".toCharArray();
	/**
	 *	Test condition "M" for isMfe88240()
	 *	@return  Returns true if isMfe88240() is "M"
	 */
   public boolean isMfe88240() throws CFException {
      return (  compareChars( getXferMthd240() , mfe8824088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setMfe88240True() {  			
    	setXferMthd240( mfe8824088Value);
   	}
	char[] interpelPel8824088Value = "P  ".toCharArray();
	/**
	 *	Test condition "P" for isInterpelPel88240()
	 *	@return  Returns true if isInterpelPel88240() is "P"
	 */
   public boolean isInterpelPel88240() throws CFException {
      return (  compareChars( getXferMthd240() , interpelPel8824088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setInterpelPel88240True() {  			
    	setXferMthd240( interpelPel8824088Value);
   	}
	char[] sdpush8824088Value = "S  ".toCharArray();
	/**
	 *	Test condition "S" for isSdpush88240()
	 *	@return  Returns true if isSdpush88240() is "S"
	 */
   public boolean isSdpush88240() throws CFException {
      return (  compareChars( getXferMthd240() , sdpush8824088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSdpush88240True() {  			
    	setXferMthd240( sdpush8824088Value);
   	}
	char[] xcom8824088Value = "X  ".toCharArray();
	/**
	 *	Test condition "X" for isXcom88240()
	 *	@return  Returns true if isXcom88240() is "X"
	 */
   public boolean isXcom88240() throws CFException {
      return (  compareChars( getXferMthd240() , xcom8824088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setXcom88240True() {  			
    	setXferMthd240( xcom8824088Value);
   	}
	char[] interpelPesit8824088Value = "Y  ".toCharArray();
	/**
	 *	Test condition "Y" for isInterpelPesit88240()
	 *	@return  Returns true if isInterpelPesit88240() is "Y"
	 */
   public boolean isInterpelPesit88240() throws CFException {
      return (  compareChars( getXferMthd240() , interpelPesit8824088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setInterpelPesit88240True() {  			
    	setXferMthd240( interpelPesit8824088Value);
   	}
	char[] tmcNotApplicable8824088Value = "N/A".toCharArray();
	/**
	 *	Test condition "N/A" for isTmcNotApplicable88240()
	 *	@return  Returns true if isTmcNotApplicable88240() is "N/A"
	 */
   public boolean isTmcNotApplicable88240() throws CFException {
      return (  compareChars( getXferMthd240() , tmcNotApplicable8824088Value)  == 0  );
   }


	/**
	*  set values "N/A"
	*/
   	public void setTmcNotApplicable88240True() {  			
    	setXferMthd240( tmcNotApplicable8824088Value);
   	}
	/**
	 *	Returns the value of xferMthdNode240
	 *	@return xferMthdNode240
	 */
   public char[] getXferMthdNode240() throws CFException{
     if (isXferMthdNode240Modified()) { 
        xferMthdNode240 = refreshXferMthdNode240();
     }
   		return xferMthdNode240;
   }

  
	/**
	*  set variable xferMthdNode240
	*  Corresponding COBOL Variable is 240-XFER-MTHD-NODE
	*  @param value
	**/
   public void setXferMthdNode240(char[] value) {
      xferMthdNode240 = checkXferMthdNode240Constraints(value);
      serializeXferMthdNode240(xferMthdNode240);
   } 

     /**
	 * 	Update XferMthdNode240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXferMthdNode240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXferMthdNode240,xferMthdNode240.length);
   	
   }
   
   public void setXferMthdNode240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdNode240,xferMthdNode240.length);
   	
   }
   
     /**
	 * 	Update XferMthdNode240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXferMthdNode240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdNode240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XferMthdNode240 with another Field
	 *	@param value
	 */
   public void setXferMthdNode240(Field source) {
       replace(source,0,source.length(),beginXferMthdNode240,XFER_MTHD_NODE_240_LEN);
   	
   }  
   
     /**
	 * 	Update XferMthdNode240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXferMthdNode240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXferMthdNode240,XFER_MTHD_NODE_240_LEN);
   	
   }
   
     /**
	 * 	Update XferMthdNode240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXferMthdNode240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdNode240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xferProcId240
	 *	@return xferProcId240
	 */
   public char[] getXferProcId240() throws CFException{
     if (isXferProcId240Modified()) { 
        xferProcId240 = refreshXferProcId240();
     }
   		return xferProcId240;
   }

  
	/**
	*  set variable xferProcId240
	*  Corresponding COBOL Variable is 240-XFER-PROC-ID
	*  @param value
	**/
   public void setXferProcId240(char[] value) {
      xferProcId240 = checkXferProcId240Constraints(value);
      serializeXferProcId240(xferProcId240);
   } 

     /**
	 * 	Update XferProcId240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXferProcId240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXferProcId240,xferProcId240.length);
   	
   }
   
   public void setXferProcId240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXferProcId240,xferProcId240.length);
   	
   }
   
     /**
	 * 	Update XferProcId240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXferProcId240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferProcId240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XferProcId240 with another Field
	 *	@param value
	 */
   public void setXferProcId240(Field source) {
       replace(source,0,source.length(),beginXferProcId240,XFER_PROC_ID_240_LEN);
   	
   }  
   
     /**
	 * 	Update XferProcId240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXferProcId240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXferProcId240,XFER_PROC_ID_240_LEN);
   	
   }
   
     /**
	 * 	Update XferProcId240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXferProcId240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferProcId240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xferMthdMsgId240
	 *	@return xferMthdMsgId240
	 */
   public char[] getXferMthdMsgId240() throws CFException{
     if (isXferMthdMsgId240Modified()) { 
        xferMthdMsgId240 = refreshXferMthdMsgId240();
     }
   		return xferMthdMsgId240;
   }

  
	/**
	*  set variable xferMthdMsgId240
	*  Corresponding COBOL Variable is 240-XFER-MTHD-MSG-ID
	*  @param value
	**/
   public void setXferMthdMsgId240(char[] value) {
      xferMthdMsgId240 = checkXferMthdMsgId240Constraints(value);
      serializeXferMthdMsgId240(xferMthdMsgId240);
   } 

     /**
	 * 	Update XferMthdMsgId240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXferMthdMsgId240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXferMthdMsgId240,xferMthdMsgId240.length);
   	
   }
   
   public void setXferMthdMsgId240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdMsgId240,xferMthdMsgId240.length);
   	
   }
   
     /**
	 * 	Update XferMthdMsgId240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXferMthdMsgId240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdMsgId240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XferMthdMsgId240 with another Field
	 *	@param value
	 */
   public void setXferMthdMsgId240(Field source) {
       replace(source,0,source.length(),beginXferMthdMsgId240,XFER_MTHD_MSG_ID_240_LEN);
   	
   }  
   
     /**
	 * 	Update XferMthdMsgId240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXferMthdMsgId240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXferMthdMsgId240,XFER_MTHD_MSG_ID_240_LEN);
   	
   }
   
     /**
	 * 	Update XferMthdMsgId240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXferMthdMsgId240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdMsgId240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgErrCd240
	 *	@return msgErrCd240
	 */
   public char[] getMsgErrCd240() throws CFException{
     if (isMsgErrCd240Modified()) { 
        msgErrCd240 = refreshMsgErrCd240();
     }
   		return msgErrCd240;
   }

  
	/**
	*  set variable msgErrCd240
	*  Corresponding COBOL Variable is 240-MSG-ERR-CD
	*  @param value
	**/
   public void setMsgErrCd240(char[] value) {
      msgErrCd240 = checkMsgErrCd240Constraints(value);
      serializeMsgErrCd240(msgErrCd240);
   } 

     /**
	 * 	Update MsgErrCd240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgErrCd240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgErrCd240,msgErrCd240.length);
   	
   }
   
   public void setMsgErrCd240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrCd240,msgErrCd240.length);
   	
   }
   
     /**
	 * 	Update MsgErrCd240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgErrCd240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrCd240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgErrCd240 with another Field
	 *	@param value
	 */
   public void setMsgErrCd240(Field source) {
       replace(source,0,source.length(),beginMsgErrCd240,MSG_ERR_CD_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgErrCd240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgErrCd240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgErrCd240,MSG_ERR_CD_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgErrCd240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgErrCd240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrCd240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgStatRefId240
	 *	@return msgStatRefId240
	 */
   public char[] getMsgStatRefId240() throws CFException{
     if (isMsgStatRefId240Modified()) { 
        msgStatRefId240 = refreshMsgStatRefId240();
     }
   		return msgStatRefId240;
   }

  
	/**
	*  set variable msgStatRefId240
	*  Corresponding COBOL Variable is 240-MSG-STAT-REF-ID
	*  @param value
	**/
   public void setMsgStatRefId240(char[] value) {
      msgStatRefId240 = checkMsgStatRefId240Constraints(value);
      serializeMsgStatRefId240(msgStatRefId240);
   } 

     /**
	 * 	Update MsgStatRefId240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgStatRefId240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgStatRefId240,msgStatRefId240.length);
   	
   }
   
   public void setMsgStatRefId240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgStatRefId240,msgStatRefId240.length);
   	
   }
   
     /**
	 * 	Update MsgStatRefId240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgStatRefId240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgStatRefId240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgStatRefId240 with another Field
	 *	@param value
	 */
   public void setMsgStatRefId240(Field source) {
       replace(source,0,source.length(),beginMsgStatRefId240,MSG_STAT_REF_ID_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgStatRefId240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgStatRefId240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgStatRefId240,MSG_STAT_REF_ID_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgStatRefId240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgStatRefId240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgStatRefId240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgStatRefDesc240
	 *	@return msgStatRefDesc240
	 */
   public char[] getMsgStatRefDesc240() throws CFException{
     if (isMsgStatRefDesc240Modified()) { 
        msgStatRefDesc240 = refreshMsgStatRefDesc240();
     }
   		return msgStatRefDesc240;
   }

  
	/**
	*  set variable msgStatRefDesc240
	*  Corresponding COBOL Variable is 240-MSG-STAT-REF-DESC
	*  @param value
	**/
   public void setMsgStatRefDesc240(char[] value) {
      msgStatRefDesc240 = checkMsgStatRefDesc240Constraints(value);
      serializeMsgStatRefDesc240(msgStatRefDesc240);
   } 

     /**
	 * 	Update MsgStatRefDesc240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgStatRefDesc240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgStatRefDesc240,msgStatRefDesc240.length);
   	
   }
   
   public void setMsgStatRefDesc240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgStatRefDesc240,msgStatRefDesc240.length);
   	
   }
   
     /**
	 * 	Update MsgStatRefDesc240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgStatRefDesc240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgStatRefDesc240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgStatRefDesc240 with another Field
	 *	@param value
	 */
   public void setMsgStatRefDesc240(Field source) {
       replace(source,0,source.length(),beginMsgStatRefDesc240,MSG_STAT_REF_DESC_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgStatRefDesc240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgStatRefDesc240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgStatRefDesc240,MSG_STAT_REF_DESC_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgStatRefDesc240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgStatRefDesc240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgStatRefDesc240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgErrorDescription240
	 *	@return msgErrorDescription240
	 */
   public char[] getMsgErrorDescription240() throws CFException{
     if (isMsgErrorDescription240Modified()) { 
        msgErrorDescription240 = refreshMsgErrorDescription240();
     }
   		return msgErrorDescription240;
   }

  
	/**
	*  set variable msgErrorDescription240
	*  Corresponding COBOL Variable is 240-MSG-ERROR-DESCRIPTION
	*  @param value
	**/
   public void setMsgErrorDescription240(char[] value) {
      msgErrorDescription240 = checkMsgErrorDescription240Constraints(value);
      serializeMsgErrorDescription240(msgErrorDescription240);
   } 

     /**
	 * 	Update MsgErrorDescription240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgErrorDescription240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgErrorDescription240,msgErrorDescription240.length);
   	
   }
   
   public void setMsgErrorDescription240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrorDescription240,msgErrorDescription240.length);
   	
   }
   
     /**
	 * 	Update MsgErrorDescription240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgErrorDescription240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrorDescription240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgErrorDescription240 with another Field
	 *	@param value
	 */
   public void setMsgErrorDescription240(Field source) {
       replace(source,0,source.length(),beginMsgErrorDescription240,MSG_ERROR_DESCRIPTION_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgErrorDescription240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgErrorDescription240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgErrorDescription240,MSG_ERROR_DESCRIPTION_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgErrorDescription240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgErrorDescription240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrorDescription240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of msgErr240
	 *  Corresponding COBOL Variable is 240-MSG-ERR
	 *	@return msgErr240
	 */
   public List<MsgErr240> getMsgErr240() {
       return msgErr240;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return msgErr240
	 */
	public MsgErr240 getMsgErr240(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getMsgErr240(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= MSG_ERR_240_SIZE) {
             	index = MSG_ERR_240_SIZE -1; // can't exceed max array size
             	logger.trace("msgErr240 - Array index exceeded max Size {}, resetting it to max allowed",MSG_ERR_240_SIZE); 
	    }
		if (index >= msgErr240.size()) {
       		for (int fillIndex =  msgErr240.size() -1; fillIndex < index;fillIndex++) {
		       msgErr240.add(null);
		    }
			msgErr240.set(index,
			   	   	new MsgErr240(this,beginMsgErr240 + index * MsgErr240.getMsgErr240FieldLength()) 
				                        ); 	
		} 
   	   MsgErr240 value = msgErr240.get(index);
   	   if (value == null) {
   	      msgErr240.set(index,
			   	   	new MsgErr240(this,beginMsgErr240 + index * MsgErr240.getMsgErr240FieldLength()) 
				                        ); 
		  value = msgErr240.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update MsgErr240 at index with the passed value
	 *  Corresponding COBOL Variable is 240-MSG-ERR
	 *  @param index
	 *	@param value
	 */
  public void setMsgErr240(int index,char[] value) {
   	getMsgErr240(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of msgProgName240
	 *	@return msgProgName240
	 */
   public char[] getMsgProgName240() throws CFException{
     if (isMsgProgName240Modified()) { 
        msgProgName240 = refreshMsgProgName240();
     }
   		return msgProgName240;
   }

  
	/**
	*  set variable msgProgName240
	*  Corresponding COBOL Variable is 240-MSG-PROG-NAME
	*  @param value
	**/
   public void setMsgProgName240(char[] value) {
      msgProgName240 = checkMsgProgName240Constraints(value);
      serializeMsgProgName240(msgProgName240);
   } 

     /**
	 * 	Update MsgProgName240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgProgName240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgProgName240,msgProgName240.length);
   	
   }
   
   public void setMsgProgName240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgProgName240,msgProgName240.length);
   	
   }
   
     /**
	 * 	Update MsgProgName240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgProgName240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgProgName240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgProgName240 with another Field
	 *	@param value
	 */
   public void setMsgProgName240(Field source) {
       replace(source,0,source.length(),beginMsgProgName240,MSG_PROG_NAME_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgProgName240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgProgName240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgProgName240,MSG_PROG_NAME_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgProgName240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgProgName240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgProgName240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgParaName240
	 *	@return msgParaName240
	 */
   public char[] getMsgParaName240() throws CFException{
     if (isMsgParaName240Modified()) { 
        msgParaName240 = refreshMsgParaName240();
     }
   		return msgParaName240;
   }

  
	/**
	*  set variable msgParaName240
	*  Corresponding COBOL Variable is 240-MSG-PARA-NAME
	*  @param value
	**/
   public void setMsgParaName240(char[] value) {
      msgParaName240 = checkMsgParaName240Constraints(value);
      serializeMsgParaName240(msgParaName240);
   } 

     /**
	 * 	Update MsgParaName240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgParaName240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgParaName240,msgParaName240.length);
   	
   }
   
   public void setMsgParaName240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgParaName240,msgParaName240.length);
   	
   }
   
     /**
	 * 	Update MsgParaName240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgParaName240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgParaName240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgParaName240 with another Field
	 *	@param value
	 */
   public void setMsgParaName240(Field source) {
       replace(source,0,source.length(),beginMsgParaName240,MSG_PARA_NAME_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgParaName240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgParaName240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgParaName240,MSG_PARA_NAME_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgParaName240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgParaName240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgParaName240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgBusPrtnrId240
	 *	@return msgBusPrtnrId240
	 */
   public char[] getMsgBusPrtnrId240() throws CFException{
     if (isMsgBusPrtnrId240Modified()) { 
        msgBusPrtnrId240 = refreshMsgBusPrtnrId240();
     }
   		return msgBusPrtnrId240;
   }

  
	/**
	*  set variable msgBusPrtnrId240
	*  Corresponding COBOL Variable is 240-MSG-BUS-PRTNR-ID
	*  @param value
	**/
   public void setMsgBusPrtnrId240(char[] value) {
      msgBusPrtnrId240 = checkMsgBusPrtnrId240Constraints(value);
      serializeMsgBusPrtnrId240(msgBusPrtnrId240);
   } 

     /**
	 * 	Update MsgBusPrtnrId240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgBusPrtnrId240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgBusPrtnrId240,msgBusPrtnrId240.length);
   	
   }
   
   public void setMsgBusPrtnrId240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgBusPrtnrId240,msgBusPrtnrId240.length);
   	
   }
   
     /**
	 * 	Update MsgBusPrtnrId240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgBusPrtnrId240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgBusPrtnrId240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgBusPrtnrId240 with another Field
	 *	@param value
	 */
   public void setMsgBusPrtnrId240(Field source) {
       replace(source,0,source.length(),beginMsgBusPrtnrId240,MSG_BUS_PRTNR_ID_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgBusPrtnrId240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgBusPrtnrId240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgBusPrtnrId240,MSG_BUS_PRTNR_ID_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgBusPrtnrId240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgBusPrtnrId240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgBusPrtnrId240+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgAbendCd240
	 *	@return msgAbendCd240
	 */
   public char[] getMsgAbendCd240() throws CFException{
     if (isMsgAbendCd240Modified()) { 
        msgAbendCd240 = refreshMsgAbendCd240();
     }
   		return msgAbendCd240;
   }

  
	/**
	*  set variable msgAbendCd240
	*  Corresponding COBOL Variable is 240-MSG-ABEND-CD
	*  @param value
	**/
   public void setMsgAbendCd240(char[] value) {
      msgAbendCd240 = checkMsgAbendCd240Constraints(value);
      serializeMsgAbendCd240(msgAbendCd240);
   } 

     /**
	 * 	Update MsgAbendCd240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgAbendCd240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgAbendCd240,msgAbendCd240.length);
   	
   }
   
   public void setMsgAbendCd240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgAbendCd240,msgAbendCd240.length);
   	
   }
   
     /**
	 * 	Update MsgAbendCd240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgAbendCd240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgAbendCd240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgAbendCd240 with another Field
	 *	@param value
	 */
   public void setMsgAbendCd240(Field source) {
       replace(source,0,source.length(),beginMsgAbendCd240,MSG_ABEND_CD_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgAbendCd240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgAbendCd240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgAbendCd240,MSG_ABEND_CD_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgAbendCd240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgAbendCd240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgAbendCd240+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MsgFormatParms240
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setGftSubsystemId240(CONSTANTS.SPACE_4);
         setMsgNum240(CONSTANTS.SPACE_3);
         setMsgSeverityInd240(CONSTANTS.SPACE);
         setMsgTypeInd240(CONSTANTS.SPACE_4);
         setMsgBulkid240(CONSTANTS.SPACE_4);
         setMsgEndpt240(CONSTANTS.SPACE_7);
         	setMsgCyclNum240((short)0);
         setMsgFilename240(CONSTANTS.SPACE_44);
         setXferMthd240(CONSTANTS.SPACE_3);
         setXferMthdNode240(CONSTANTS.SPACE_20);
         setXferProcId240(CONSTANTS.SPACE_20);
         setXferMthdMsgId240(CONSTANTS.SPACE_20);
         setMsgErrCd240(CONSTANTS.SPACE_4);
         setMsgStatRefId240(CONSTANTS.SPACE_4);
         setMsgStatRefDesc240(CONSTANTS.SPACE_80);
         setMsgErrorDescription240(CONSTANTS.SPACE_400);
         setMsgProgName240(CONSTANTS.SPACE_8);
         setMsgParaName240(CONSTANTS.SPACE_30);
         setMsgBusPrtnrId240(CONSTANTS.SPACE_6);
         setMsgAbendCd240(CONSTANTS.SPACE_5);
   }

		public static int getMsgFormatParms240FieldLength() {
			return MSG_FORMAT_PARMS_240_LENGTH;
		}

}
  
