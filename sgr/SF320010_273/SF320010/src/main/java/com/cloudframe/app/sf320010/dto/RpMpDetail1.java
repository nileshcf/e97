package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpMpDetail1 extends RpMpDetail1Serialized { 
   

						private char[] rpMpCc1 = new char[1];


						private char[] rpMpMipId = Field.fillLowValue(3);


						private char[] rpMpLogDate = Field.fillLowValue(6);


						private char[] rpMpLogTime = Field.fillLowValue(6);


						private char[] rpMpRclFileInd = Field.fillLowValue(1);


						private char[] rpMpNegFileAvailInd = Field.fillLowValue(1);


						private char[] rpMpMbrDelayFileInd = Field.fillLowValue(1);


						private char[] rpMpLocalNegFileInd = Field.fillLowValue(1);

	
	/**
	* Constructor for RpMpDetail1
	**/
    public RpMpDetail1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc1("0".toCharArray());
       replaceValue( // serialize and save the value
             (" MIP ID - ").toCharArray()
             , getStartOffset() + 1
             ,10
             );
       replaceValue( // serialize and save the value
             ("      DATE - ").toCharArray()
             , getStartOffset() + 14
             ,13
             );
       replaceValue( // serialize and save the value
             ("      TIME - ").toCharArray()
             , getStartOffset() + 33
             ,13
             );
       replaceValue( // serialize and save the value
             ("  RCL AVL IND - ").toCharArray()
             , getStartOffset() + 52
             ,16
             );
       replaceValue( // serialize and save the value
             ("     NEG AVL IND - ").toCharArray()
             , getStartOffset() + 69
             ,19
             );
       replaceValue( // serialize and save the value
             ("        DELAY IND - ").toCharArray()
             , getStartOffset() + 89
             ,20
             );
       replaceValue( // serialize and save the value
             ("     NEG SUPPORT - ").toCharArray()
             , getStartOffset() + 110
             ,19
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 130
             ,3
             );
    }


 

	/**
	 *	Returns the value of rpMpCc1
	 *	@return rpMpCc1
	 */
   public char[] getRpMpCc1() throws CFException{
     if (isRpMpCc1Modified()) { 
        rpMpCc1 = refreshRpMpCc1();
     }
   		return rpMpCc1;
   }

  
	/**
	*  set variable rpMpCc1
	*  Corresponding COBOL Variable is RP-MP-CC-1
	*  @param value
	**/
   public void setRpMpCc1(char[] value) {
      rpMpCc1 = checkRpMpCc1Constraints(value);
      serializeRpMpCc1(rpMpCc1);
   } 

     /**
	 * 	Update RpMpCc1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpCc1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpCc1,rpMpCc1.length);
   	
   }
   
   public void setRpMpCc1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc1,rpMpCc1.length);
   	
   }
   
     /**
	 * 	Update RpMpCc1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpCc1 with another Field
	 *	@param value
	 */
   public void setRpMpCc1(Field source) {
       replace(source,0,source.length(),beginRpMpCc1,RP_MP_CC_1_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpCc1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpCc1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpCc1,RP_MP_CC_1_LEN);
   	
   }
   
     /**
	 * 	Update RpMpCc1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpMipId
	 *	@return rpMpMipId
	 */
   public char[] getRpMpMipId() throws CFException{
     if (isRpMpMipIdModified()) { 
        rpMpMipId = refreshRpMpMipId();
     }
   		return rpMpMipId;
   }

  
	/**
	*  set variable rpMpMipId
	*  Corresponding COBOL Variable is RP-MP-MIP-ID
	*  @param value
	**/
   public void setRpMpMipId(char[] value) {
      rpMpMipId = checkRpMpMipIdConstraints(value);
      serializeRpMpMipId(rpMpMipId);
   } 

     /**
	 * 	Update RpMpMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpMipId,rpMpMipId.length);
   	
   }
   
   public void setRpMpMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpMipId,rpMpMipId.length);
   	
   }
   
     /**
	 * 	Update RpMpMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpMipId with another Field
	 *	@param value
	 */
   public void setRpMpMipId(Field source) {
       replace(source,0,source.length(),beginRpMpMipId,RP_MP_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpMipId,RP_MP_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpMpMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpLogDate
	 *	@return rpMpLogDate
	 */
   public char[] getRpMpLogDate() throws CFException{
     if (isRpMpLogDateModified()) { 
        rpMpLogDate = refreshRpMpLogDate();
     }
   		return rpMpLogDate;
   }

  
	/**
	*  set variable rpMpLogDate
	*  Corresponding COBOL Variable is RP-MP-LOG-DATE
	*  @param value
	**/
   public void setRpMpLogDate(char[] value) {
      rpMpLogDate = checkRpMpLogDateConstraints(value);
      serializeRpMpLogDate(rpMpLogDate);
   } 

     /**
	 * 	Update RpMpLogDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpLogDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpLogDate,rpMpLogDate.length);
   	
   }
   
   public void setRpMpLogDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLogDate,rpMpLogDate.length);
   	
   }
   
     /**
	 * 	Update RpMpLogDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpLogDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLogDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpLogDate with another Field
	 *	@param value
	 */
   public void setRpMpLogDate(Field source) {
       replace(source,0,source.length(),beginRpMpLogDate,RP_MP_LOG_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpLogDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpLogDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpLogDate,RP_MP_LOG_DATE_LEN);
   	
   }
   
     /**
	 * 	Update RpMpLogDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpLogDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLogDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpLogTime
	 *	@return rpMpLogTime
	 */
   public char[] getRpMpLogTime() throws CFException{
     if (isRpMpLogTimeModified()) { 
        rpMpLogTime = refreshRpMpLogTime();
     }
   		return rpMpLogTime;
   }

  
	/**
	*  set variable rpMpLogTime
	*  Corresponding COBOL Variable is RP-MP-LOG-TIME
	*  @param value
	**/
   public void setRpMpLogTime(char[] value) {
      rpMpLogTime = checkRpMpLogTimeConstraints(value);
      serializeRpMpLogTime(rpMpLogTime);
   } 

     /**
	 * 	Update RpMpLogTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpLogTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpLogTime,rpMpLogTime.length);
   	
   }
   
   public void setRpMpLogTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLogTime,rpMpLogTime.length);
   	
   }
   
     /**
	 * 	Update RpMpLogTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpLogTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLogTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpLogTime with another Field
	 *	@param value
	 */
   public void setRpMpLogTime(Field source) {
       replace(source,0,source.length(),beginRpMpLogTime,RP_MP_LOG_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpLogTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpLogTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpLogTime,RP_MP_LOG_TIME_LEN);
   	
   }
   
     /**
	 * 	Update RpMpLogTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpLogTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLogTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpRclFileInd
	 *	@return rpMpRclFileInd
	 */
   public char[] getRpMpRclFileInd() throws CFException{
     if (isRpMpRclFileIndModified()) { 
        rpMpRclFileInd = refreshRpMpRclFileInd();
     }
   		return rpMpRclFileInd;
   }

  
	/**
	*  set variable rpMpRclFileInd
	*  Corresponding COBOL Variable is RP-MP-RCL-FILE-IND
	*  @param value
	**/
   public void setRpMpRclFileInd(char[] value) {
      rpMpRclFileInd = checkRpMpRclFileIndConstraints(value);
      serializeRpMpRclFileInd(rpMpRclFileInd);
   } 

     /**
	 * 	Update RpMpRclFileInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpRclFileInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpRclFileInd,rpMpRclFileInd.length);
   	
   }
   
   public void setRpMpRclFileInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpRclFileInd,rpMpRclFileInd.length);
   	
   }
   
     /**
	 * 	Update RpMpRclFileInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpRclFileInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpRclFileInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpRclFileInd with another Field
	 *	@param value
	 */
   public void setRpMpRclFileInd(Field source) {
       replace(source,0,source.length(),beginRpMpRclFileInd,RP_MP_RCL_FILE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpRclFileInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpRclFileInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpRclFileInd,RP_MP_RCL_FILE_IND_LEN);
   	
   }
   
     /**
	 * 	Update RpMpRclFileInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpRclFileInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpRclFileInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpNegFileAvailInd
	 *	@return rpMpNegFileAvailInd
	 */
   public char[] getRpMpNegFileAvailInd() throws CFException{
     if (isRpMpNegFileAvailIndModified()) { 
        rpMpNegFileAvailInd = refreshRpMpNegFileAvailInd();
     }
   		return rpMpNegFileAvailInd;
   }

  
	/**
	*  set variable rpMpNegFileAvailInd
	*  Corresponding COBOL Variable is RP-MP-NEG-FILE-AVAIL-IND
	*  @param value
	**/
   public void setRpMpNegFileAvailInd(char[] value) {
      rpMpNegFileAvailInd = checkRpMpNegFileAvailIndConstraints(value);
      serializeRpMpNegFileAvailInd(rpMpNegFileAvailInd);
   } 

     /**
	 * 	Update RpMpNegFileAvailInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpNegFileAvailInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpNegFileAvailInd,rpMpNegFileAvailInd.length);
   	
   }
   
   public void setRpMpNegFileAvailInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpNegFileAvailInd,rpMpNegFileAvailInd.length);
   	
   }
   
     /**
	 * 	Update RpMpNegFileAvailInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpNegFileAvailInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpNegFileAvailInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpNegFileAvailInd with another Field
	 *	@param value
	 */
   public void setRpMpNegFileAvailInd(Field source) {
       replace(source,0,source.length(),beginRpMpNegFileAvailInd,RP_MP_NEG_FILE_AVAIL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpNegFileAvailInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpNegFileAvailInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpNegFileAvailInd,RP_MP_NEG_FILE_AVAIL_IND_LEN);
   	
   }
   
     /**
	 * 	Update RpMpNegFileAvailInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpNegFileAvailInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpNegFileAvailInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpMbrDelayFileInd
	 *	@return rpMpMbrDelayFileInd
	 */
   public char[] getRpMpMbrDelayFileInd() throws CFException{
     if (isRpMpMbrDelayFileIndModified()) { 
        rpMpMbrDelayFileInd = refreshRpMpMbrDelayFileInd();
     }
   		return rpMpMbrDelayFileInd;
   }

  
	/**
	*  set variable rpMpMbrDelayFileInd
	*  Corresponding COBOL Variable is RP-MP-MBR-DELAY-FILE-IND
	*  @param value
	**/
   public void setRpMpMbrDelayFileInd(char[] value) {
      rpMpMbrDelayFileInd = checkRpMpMbrDelayFileIndConstraints(value);
      serializeRpMpMbrDelayFileInd(rpMpMbrDelayFileInd);
   } 

     /**
	 * 	Update RpMpMbrDelayFileInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpMbrDelayFileInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpMbrDelayFileInd,rpMpMbrDelayFileInd.length);
   	
   }
   
   public void setRpMpMbrDelayFileInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpMbrDelayFileInd,rpMpMbrDelayFileInd.length);
   	
   }
   
     /**
	 * 	Update RpMpMbrDelayFileInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpMbrDelayFileInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpMbrDelayFileInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpMbrDelayFileInd with another Field
	 *	@param value
	 */
   public void setRpMpMbrDelayFileInd(Field source) {
       replace(source,0,source.length(),beginRpMpMbrDelayFileInd,RP_MP_MBR_DELAY_FILE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpMbrDelayFileInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpMbrDelayFileInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpMbrDelayFileInd,RP_MP_MBR_DELAY_FILE_IND_LEN);
   	
   }
   
     /**
	 * 	Update RpMpMbrDelayFileInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpMbrDelayFileInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpMbrDelayFileInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpLocalNegFileInd
	 *	@return rpMpLocalNegFileInd
	 */
   public char[] getRpMpLocalNegFileInd() throws CFException{
     if (isRpMpLocalNegFileIndModified()) { 
        rpMpLocalNegFileInd = refreshRpMpLocalNegFileInd();
     }
   		return rpMpLocalNegFileInd;
   }

  
	/**
	*  set variable rpMpLocalNegFileInd
	*  Corresponding COBOL Variable is RP-MP-LOCAL-NEG-FILE-IND
	*  @param value
	**/
   public void setRpMpLocalNegFileInd(char[] value) {
      rpMpLocalNegFileInd = checkRpMpLocalNegFileIndConstraints(value);
      serializeRpMpLocalNegFileInd(rpMpLocalNegFileInd);
   } 

     /**
	 * 	Update RpMpLocalNegFileInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpLocalNegFileInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpLocalNegFileInd,rpMpLocalNegFileInd.length);
   	
   }
   
   public void setRpMpLocalNegFileInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLocalNegFileInd,rpMpLocalNegFileInd.length);
   	
   }
   
     /**
	 * 	Update RpMpLocalNegFileInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpLocalNegFileInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLocalNegFileInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpLocalNegFileInd with another Field
	 *	@param value
	 */
   public void setRpMpLocalNegFileInd(Field source) {
       replace(source,0,source.length(),beginRpMpLocalNegFileInd,RP_MP_LOCAL_NEG_FILE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpLocalNegFileInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpLocalNegFileInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpLocalNegFileInd,RP_MP_LOCAL_NEG_FILE_IND_LEN);
   	
   }
   
     /**
	 * 	Update RpMpLocalNegFileInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpLocalNegFileInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpLocalNegFileInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpMpDetail1FieldLength() {
			return RP_MP_DETAIL_1_LENGTH;
		}

}
  
