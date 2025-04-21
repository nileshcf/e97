package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC9Detail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC9Detail extends RpC9DetailSerialized {
   

						private char[] rpC9DetCc = Field.fillLowValue(1);


						private char[] rpC9DetLogType = Field.fillLowValue(2);


						private char[] rpC9DetLogDesc = Field.fillLowValue(45);


								private char[] rpC9DetTotal = Field.fillLowValue(9);

	
	/**
	* Constructor for RpC9Detail
	**/
    public RpC9Detail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 11
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 64
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(52)
             , getStartOffset() + 80
             ,52
             );
    }


 

	/**
	 *	Returns the value of rpC9DetCc
	 *	@return rpC9DetCc
	 */
   public char[] getRpC9DetCc() throws CFException{
     if (isRpC9DetCcModified()) { 
        rpC9DetCc = refreshRpC9DetCc();
     }
   		return rpC9DetCc;
   }

  
	/**
	*  set variable rpC9DetCc
	*  Corresponding COBOL Variable is RP-C9-DET-CC
	*  @param value
	**/
   public void setRpC9DetCc(char[] value) {
      rpC9DetCc = checkRpC9DetCcConstraints(value);
      serializeRpC9DetCc(rpC9DetCc);
   } 

     /**
	 * 	Update RpC9DetCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC9DetCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC9DetCc,rpC9DetCc.length);
   	
   }
   
   public void setRpC9DetCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetCc,rpC9DetCc.length);
   	
   }
   
     /**
	 * 	Update RpC9DetCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC9DetCc with another Field
	 *	@param value
	 */
   public void setRpC9DetCc(Field source) {
       replace(source,0,source.length(),beginRpC9DetCc,RP_C_9_DET_CC_LEN);
   	
   }  
   
     /**
	 * 	Update RpC9DetCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC9DetCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC9DetCc,RP_C_9_DET_CC_LEN);
   	
   }
   
     /**
	 * 	Update RpC9DetCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC9DetLogType
	 *	@return rpC9DetLogType
	 */
   public char[] getRpC9DetLogType() throws CFException{
     if (isRpC9DetLogTypeModified()) { 
        rpC9DetLogType = refreshRpC9DetLogType();
     }
   		return rpC9DetLogType;
   }

  
	/**
	*  set variable rpC9DetLogType
	*  Corresponding COBOL Variable is RP-C9-DET-LOG-TYPE
	*  @param value
	**/
   public void setRpC9DetLogType(char[] value) {
      rpC9DetLogType = checkRpC9DetLogTypeConstraints(value);
      serializeRpC9DetLogType(rpC9DetLogType);
   } 

     /**
	 * 	Update RpC9DetLogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC9DetLogType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC9DetLogType,rpC9DetLogType.length);
   	
   }
   
   public void setRpC9DetLogType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetLogType,rpC9DetLogType.length);
   	
   }
   
     /**
	 * 	Update RpC9DetLogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetLogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetLogType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC9DetLogType with another Field
	 *	@param value
	 */
   public void setRpC9DetLogType(Field source) {
       replace(source,0,source.length(),beginRpC9DetLogType,RP_C_9_DET_LOG_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update RpC9DetLogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC9DetLogType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC9DetLogType,RP_C_9_DET_LOG_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update RpC9DetLogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetLogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetLogType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC9DetLogDesc
	 *	@return rpC9DetLogDesc
	 */
   public char[] getRpC9DetLogDesc() throws CFException{
     if (isRpC9DetLogDescModified()) { 
        rpC9DetLogDesc = refreshRpC9DetLogDesc();
     }
   		return rpC9DetLogDesc;
   }

  
	/**
	*  set variable rpC9DetLogDesc
	*  Corresponding COBOL Variable is RP-C9-DET-LOG-DESC
	*  @param value
	**/
   public void setRpC9DetLogDesc(char[] value) {
      rpC9DetLogDesc = checkRpC9DetLogDescConstraints(value);
      serializeRpC9DetLogDesc(rpC9DetLogDesc);
   } 

     /**
	 * 	Update RpC9DetLogDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC9DetLogDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC9DetLogDesc,rpC9DetLogDesc.length);
   	
   }
   
   public void setRpC9DetLogDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetLogDesc,rpC9DetLogDesc.length);
   	
   }
   
     /**
	 * 	Update RpC9DetLogDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetLogDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetLogDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC9DetLogDesc with another Field
	 *	@param value
	 */
   public void setRpC9DetLogDesc(Field source) {
       replace(source,0,source.length(),beginRpC9DetLogDesc,RP_C_9_DET_LOG_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update RpC9DetLogDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC9DetLogDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC9DetLogDesc,RP_C_9_DET_LOG_DESC_LEN);
   	
   }
   
     /**
	 * 	Update RpC9DetLogDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetLogDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetLogDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC9DetTotal
	 *	@return rpC9DetTotal
	 */
   public char[] getRpC9DetTotal() throws CFException{
     if (isRpC9DetTotalModified()) { 
        rpC9DetTotal = refreshRpC9DetTotal();
     }
   		return rpC9DetTotal;
   }

  
	/**
	*  set variable rpC9DetTotal
	*  Corresponding COBOL Variable is RP-C9-DET-TOTAL
	*  @param value
	**/
   public void setRpC9DetTotal(char[] value) {
      rpC9DetTotal = checkRpC9DetTotalConstraints(value);
      serializeRpC9DetTotal(rpC9DetTotal);
   } 

     /**
	 * 	Update RpC9DetTotal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC9DetTotal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC9DetTotal,rpC9DetTotal.length);
   	
   }
   
   public void setRpC9DetTotal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetTotal,rpC9DetTotal.length);
   	
   }
   
     /**
	 * 	Update RpC9DetTotal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetTotal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetTotal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC9DetTotal with another Field
	 *	@param value
	 */
   public void setRpC9DetTotal(Field source) {
       replace(source,0,source.length(),beginRpC9DetTotal,RP_C_9_DET_TOTAL_LEN);
   	
   }  
   
     /**
	 * 	Update RpC9DetTotal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC9DetTotal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC9DetTotal,RP_C_9_DET_TOTAL_LEN);
   	
   }
   
     /**
	 * 	Update RpC9DetTotal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC9DetTotal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9DetTotal+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC9DetailFieldLength() {
			return RP_C_9_DETAIL_LENGTH;
		}

}
  
