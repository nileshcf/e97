package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioReturnMsg670 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class SeqioReturnMsg670 extends SeqioReturnMsg670Serialized {
   


								private char[] seqioReturnCode670 = new char[4];
							


							private char[] seqioReturnMsg670ConditionGroup3 = new char[23];
						
	
	/**
	* Constructor for SeqioReturnMsg670
	**/
    public SeqioReturnMsg670() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("7001-MCISEQIO-RETURN-CODE : ").toCharArray()
             , getStartOffset() + 0
             ,28
             );
								setSeqioReturnCode670(fillSpace(4));
       replaceValue( // serialize and save the value
             (", CONDITION INDICATED : ").toCharArray()
             , getStartOffset() + 32
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 56
             ,23
             );
    }


 

	/**
	 *	Returns the value of seqioReturnCode670
	 *	@return seqioReturnCode670
	 */
   public char[] getSeqioReturnCode670() throws CFException{
     if (isSeqioReturnCode670Modified()) { 
        seqioReturnCode670 = refreshSeqioReturnCode670();
     }
   		return seqioReturnCode670;
   }

  
	/**
	*  set variable seqioReturnCode670
	*  Corresponding COBOL Variable is 670-SEQIO-RETURN-CODE
	*  @param value
	**/
   public void setSeqioReturnCode670(char[] value) {
      seqioReturnCode670 = checkSeqioReturnCode670Constraints(value);
      serializeSeqioReturnCode670(seqioReturnCode670);
   } 

     /**
	 * 	Update SeqioReturnCode670 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeqioReturnCode670(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeqioReturnCode670,seqioReturnCode670.length);
   	
   }
   
   public void setSeqioReturnCode670(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioReturnCode670,seqioReturnCode670.length);
   	
   }
   
     /**
	 * 	Update SeqioReturnCode670 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeqioReturnCode670(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioReturnCode670+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeqioReturnCode670 with another Field
	 *	@param value
	 */
   public void setSeqioReturnCode670(Field source) {
       replace(source,0,source.length(),beginSeqioReturnCode670,SEQIO_RETURN_CODE_670_LEN);
   	
   }  
   
     /**
	 * 	Update SeqioReturnCode670 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeqioReturnCode670(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeqioReturnCode670,SEQIO_RETURN_CODE_670_LEN);
   	
   }
   
     /**
	 * 	Update SeqioReturnCode670 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeqioReturnCode670(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioReturnCode670+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of seqioReturnMsg670ConditionGroup3
	 *	@return seqioReturnMsg670ConditionGroup3
	 */
   public char[] getSeqioReturnMsg670ConditionGroup3() throws CFException{
     if (isSeqioReturnMsg670ConditionGroup3Modified()) { 
        seqioReturnMsg670ConditionGroup3 = refreshSeqioReturnMsg670ConditionGroup3();
     }
   		return seqioReturnMsg670ConditionGroup3;
   }

  
	/**
	*  set variable seqioReturnMsg670ConditionGroup3
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setSeqioReturnMsg670ConditionGroup3(char[] value) {
      seqioReturnMsg670ConditionGroup3 = checkSeqioReturnMsg670ConditionGroup3Constraints(value);
      serializeSeqioReturnMsg670ConditionGroup3(seqioReturnMsg670ConditionGroup3);
   } 

     /**
	 * 	Update SeqioReturnMsg670ConditionGroup3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeqioReturnMsg670ConditionGroup3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeqioReturnMsg670ConditionGroup3,seqioReturnMsg670ConditionGroup3.length);
   	
   }
   
   public void setSeqioReturnMsg670ConditionGroup3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioReturnMsg670ConditionGroup3,seqioReturnMsg670ConditionGroup3.length);
   	
   }
   
     /**
	 * 	Update SeqioReturnMsg670ConditionGroup3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeqioReturnMsg670ConditionGroup3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioReturnMsg670ConditionGroup3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeqioReturnMsg670ConditionGroup3 with another Field
	 *	@param value
	 */
   public void setSeqioReturnMsg670ConditionGroup3(Field source) {
       replace(source,0,source.length(),beginSeqioReturnMsg670ConditionGroup3,SEQIO_RETURN_MSG_670_CONDITION_GROUP_3_LEN);
   	
   }  
   
     /**
	 * 	Update SeqioReturnMsg670ConditionGroup3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeqioReturnMsg670ConditionGroup3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeqioReturnMsg670ConditionGroup3,SEQIO_RETURN_MSG_670_CONDITION_GROUP_3_LEN);
   	
   }
   
     /**
	 * 	Update SeqioReturnMsg670ConditionGroup3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeqioReturnMsg670ConditionGroup3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioReturnMsg670ConditionGroup3+targetIndex,targetLen);
    
   }
	char[] seqioEndAllTapes8867088Value = "MCISEQIO-END-ALL-TAPES ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-END-ALL-TAPES " for isSeqioEndAllTapes88670()
	 *	@return  Returns true if isSeqioEndAllTapes88670() is "MCISEQIO-END-ALL-TAPES "
	 */
   public boolean isSeqioEndAllTapes88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioEndAllTapes8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-END-ALL-TAPES "
	*/
   	public void setSeqioEndAllTapes88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioEndAllTapes8867088Value);
   	}
	char[] seqioEof8867088Value = "MCISEQIO-EOF           ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-EOF           " for isSeqioEof88670()
	 *	@return  Returns true if isSeqioEof88670() is "MCISEQIO-EOF           "
	 */
   public boolean isSeqioEof88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioEof8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-EOF           "
	*/
   	public void setSeqioEof88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioEof8867088Value);
   	}
	char[] seqioErrorIllreq8867088Value = "MCISEQIO-ERROR-ILLREQ  ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-ILLREQ  " for isSeqioErrorIllreq88670()
	 *	@return  Returns true if isSeqioErrorIllreq88670() is "MCISEQIO-ERROR-ILLREQ  "
	 */
   public boolean isSeqioErrorIllreq88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorIllreq8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-ILLREQ  "
	*/
   	public void setSeqioErrorIllreq88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorIllreq8867088Value);
   	}
	char[] seqioErrorInvreq8867088Value = "MCISEQIO-ERROR-INVREQ  ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-INVREQ  " for isSeqioErrorInvreq88670()
	 *	@return  Returns true if isSeqioErrorInvreq88670() is "MCISEQIO-ERROR-INVREQ  "
	 */
   public boolean isSeqioErrorInvreq88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorInvreq8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-INVREQ  "
	*/
   	public void setSeqioErrorInvreq88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorInvreq8867088Value);
   	}
	char[] seqioErrorOpen8867088Value = "MCISEQIO-ERROR-OPEN    ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-OPEN    " for isSeqioErrorOpen88670()
	 *	@return  Returns true if isSeqioErrorOpen88670() is "MCISEQIO-ERROR-OPEN    "
	 */
   public boolean isSeqioErrorOpen88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorOpen8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-OPEN    "
	*/
   	public void setSeqioErrorOpen88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorOpen8867088Value);
   	}
	char[] seqioVolSwitch8867088Value = "MCISEQIO-VOL-SWITCH    ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-VOL-SWITCH    " for isSeqioVolSwitch88670()
	 *	@return  Returns true if isSeqioVolSwitch88670() is "MCISEQIO-VOL-SWITCH    "
	 */
   public boolean isSeqioVolSwitch88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioVolSwitch8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-VOL-SWITCH    "
	*/
   	public void setSeqioVolSwitch88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioVolSwitch8867088Value);
   	}
	char[] seqioErrorGetmain8867088Value = "MCISEQIO-ERROR-GETMAIN ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-GETMAIN " for isSeqioErrorGetmain88670()
	 *	@return  Returns true if isSeqioErrorGetmain88670() is "MCISEQIO-ERROR-GETMAIN "
	 */
   public boolean isSeqioErrorGetmain88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorGetmain8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-GETMAIN "
	*/
   	public void setSeqioErrorGetmain88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorGetmain8867088Value);
   	}
	char[] seqioErrorDdname8867088Value = "MCISEQIO-ERROR-DDNAME  ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-DDNAME  " for isSeqioErrorDdname88670()
	 *	@return  Returns true if isSeqioErrorDdname88670() is "MCISEQIO-ERROR-DDNAME  "
	 */
   public boolean isSeqioErrorDdname88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorDdname8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-DDNAME  "
	*/
   	public void setSeqioErrorDdname88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorDdname8867088Value);
   	}
	char[] seqioErrorJfcb8867088Value = "MCISEQIO-ERROR-JFCB    ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-JFCB    " for isSeqioErrorJfcb88670()
	 *	@return  Returns true if isSeqioErrorJfcb88670() is "MCISEQIO-ERROR-JFCB    "
	 */
   public boolean isSeqioErrorJfcb88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorJfcb8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-JFCB    "
	*/
   	public void setSeqioErrorJfcb88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorJfcb8867088Value);
   	}
	char[] seqioErrorVsam8867088Value = "MCISEQIO-ERROR-VSAM    ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-VSAM    " for isSeqioErrorVsam88670()
	 *	@return  Returns true if isSeqioErrorVsam88670() is "MCISEQIO-ERROR-VSAM    "
	 */
   public boolean isSeqioErrorVsam88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorVsam8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-VSAM    "
	*/
   	public void setSeqioErrorVsam88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorVsam8867088Value);
   	}
	char[] seqioErrorTtcd8867088Value = "MCISEQIO-ERROR-TTCD    ".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-TTCD    " for isSeqioErrorTtcd88670()
	 *	@return  Returns true if isSeqioErrorTtcd88670() is "MCISEQIO-ERROR-TTCD    "
	 */
   public boolean isSeqioErrorTtcd88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorTtcd8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-TTCD    "
	*/
   	public void setSeqioErrorTtcd88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorTtcd8867088Value);
   	}
	char[] seqioErrorNumVols8867088Value = "MCISEQIO-ERROR-NUM-VOLS".toCharArray();
	/**
	 *	Test condition "MCISEQIO-ERROR-NUM-VOLS" for isSeqioErrorNumVols88670()
	 *	@return  Returns true if isSeqioErrorNumVols88670() is "MCISEQIO-ERROR-NUM-VOLS"
	 */
   public boolean isSeqioErrorNumVols88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioErrorNumVols8867088Value)  == 0  );
   }


	/**
	*  set values "MCISEQIO-ERROR-NUM-VOLS"
	*/
   	public void setSeqioErrorNumVols88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioErrorNumVols8867088Value);
   	}
	char[] seqioReturnUnknown8867088Value = "**** VALUE UNKNOWN ****".toCharArray();
	/**
	 *	Test condition "**** VALUE UNKNOWN ****" for isSeqioReturnUnknown88670()
	 *	@return  Returns true if isSeqioReturnUnknown88670() is "**** VALUE UNKNOWN ****"
	 */
   public boolean isSeqioReturnUnknown88670() throws CFException {
      return (  compareChars( getSeqioReturnMsg670ConditionGroup3() , seqioReturnUnknown8867088Value)  == 0  );
   }


	/**
	*  set values "**** VALUE UNKNOWN ****"
	*/
   	public void setSeqioReturnUnknown88670True() {  			
    	setSeqioReturnMsg670ConditionGroup3( seqioReturnUnknown8867088Value);
   	}

	
	
	

		public static int getSeqioReturnMsg670FieldLength() {
			return SEQIO_RETURN_MSG_670_LENGTH;
		}

}
  
