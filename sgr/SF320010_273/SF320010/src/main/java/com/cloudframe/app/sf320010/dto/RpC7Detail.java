package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC7Detail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC7Detail extends RpC7DetailSerialized {
   

						private char[] rpC7DetCc = Field.fillLowValue(1);


						private char[] rpC7DetLogType = Field.fillLowValue(1);


						private char[] rpC7DetLogDesc = Field.fillLowValue(45);


								private char[] rpC7DetTotal = Field.fillLowValue(9);

	
	/**
	* Constructor for RpC7Detail
	**/
    public RpC7Detail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 10
             ,9
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
	 *	Returns the value of rpC7DetCc
	 *	@return rpC7DetCc
	 */
   public char[] getRpC7DetCc() throws CFException{
     if (isRpC7DetCcModified()) { 
        rpC7DetCc = refreshRpC7DetCc();
     }
   		return rpC7DetCc;
   }

  
	/**
	*  set variable rpC7DetCc
	*  Corresponding COBOL Variable is RP-C7-DET-CC
	*  @param value
	**/
   public void setRpC7DetCc(char[] value) {
      rpC7DetCc = checkRpC7DetCcConstraints(value);
      serializeRpC7DetCc(rpC7DetCc);
   } 

     /**
	 * 	Update RpC7DetCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC7DetCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC7DetCc,rpC7DetCc.length);
   	
   }
   
   public void setRpC7DetCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetCc,rpC7DetCc.length);
   	
   }
   
     /**
	 * 	Update RpC7DetCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC7DetCc with another Field
	 *	@param value
	 */
   public void setRpC7DetCc(Field source) {
       replace(source,0,source.length(),beginRpC7DetCc,RP_C_7_DET_CC_LEN);
   	
   }  
   
     /**
	 * 	Update RpC7DetCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC7DetCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC7DetCc,RP_C_7_DET_CC_LEN);
   	
   }
   
     /**
	 * 	Update RpC7DetCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC7DetLogType
	 *	@return rpC7DetLogType
	 */
   public char[] getRpC7DetLogType() throws CFException{
     if (isRpC7DetLogTypeModified()) { 
        rpC7DetLogType = refreshRpC7DetLogType();
     }
   		return rpC7DetLogType;
   }

  
	/**
	*  set variable rpC7DetLogType
	*  Corresponding COBOL Variable is RP-C7-DET-LOG-TYPE
	*  @param value
	**/
   public void setRpC7DetLogType(char[] value) {
      rpC7DetLogType = checkRpC7DetLogTypeConstraints(value);
      serializeRpC7DetLogType(rpC7DetLogType);
   } 

     /**
	 * 	Update RpC7DetLogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC7DetLogType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC7DetLogType,rpC7DetLogType.length);
   	
   }
   
   public void setRpC7DetLogType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetLogType,rpC7DetLogType.length);
   	
   }
   
     /**
	 * 	Update RpC7DetLogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetLogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetLogType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC7DetLogType with another Field
	 *	@param value
	 */
   public void setRpC7DetLogType(Field source) {
       replace(source,0,source.length(),beginRpC7DetLogType,RP_C_7_DET_LOG_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update RpC7DetLogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC7DetLogType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC7DetLogType,RP_C_7_DET_LOG_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update RpC7DetLogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetLogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetLogType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC7DetLogDesc
	 *	@return rpC7DetLogDesc
	 */
   public char[] getRpC7DetLogDesc() throws CFException{
     if (isRpC7DetLogDescModified()) { 
        rpC7DetLogDesc = refreshRpC7DetLogDesc();
     }
   		return rpC7DetLogDesc;
   }

  
	/**
	*  set variable rpC7DetLogDesc
	*  Corresponding COBOL Variable is RP-C7-DET-LOG-DESC
	*  @param value
	**/
   public void setRpC7DetLogDesc(char[] value) {
      rpC7DetLogDesc = checkRpC7DetLogDescConstraints(value);
      serializeRpC7DetLogDesc(rpC7DetLogDesc);
   } 

     /**
	 * 	Update RpC7DetLogDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC7DetLogDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC7DetLogDesc,rpC7DetLogDesc.length);
   	
   }
   
   public void setRpC7DetLogDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetLogDesc,rpC7DetLogDesc.length);
   	
   }
   
     /**
	 * 	Update RpC7DetLogDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetLogDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetLogDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC7DetLogDesc with another Field
	 *	@param value
	 */
   public void setRpC7DetLogDesc(Field source) {
       replace(source,0,source.length(),beginRpC7DetLogDesc,RP_C_7_DET_LOG_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update RpC7DetLogDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC7DetLogDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC7DetLogDesc,RP_C_7_DET_LOG_DESC_LEN);
   	
   }
   
     /**
	 * 	Update RpC7DetLogDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetLogDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetLogDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC7DetTotal
	 *	@return rpC7DetTotal
	 */
   public char[] getRpC7DetTotal() throws CFException{
     if (isRpC7DetTotalModified()) { 
        rpC7DetTotal = refreshRpC7DetTotal();
     }
   		return rpC7DetTotal;
   }

  
	/**
	*  set variable rpC7DetTotal
	*  Corresponding COBOL Variable is RP-C7-DET-TOTAL
	*  @param value
	**/
   public void setRpC7DetTotal(char[] value) {
      rpC7DetTotal = checkRpC7DetTotalConstraints(value);
      serializeRpC7DetTotal(rpC7DetTotal);
   } 

     /**
	 * 	Update RpC7DetTotal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC7DetTotal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC7DetTotal,rpC7DetTotal.length);
   	
   }
   
   public void setRpC7DetTotal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetTotal,rpC7DetTotal.length);
   	
   }
   
     /**
	 * 	Update RpC7DetTotal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetTotal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetTotal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC7DetTotal with another Field
	 *	@param value
	 */
   public void setRpC7DetTotal(Field source) {
       replace(source,0,source.length(),beginRpC7DetTotal,RP_C_7_DET_TOTAL_LEN);
   	
   }  
   
     /**
	 * 	Update RpC7DetTotal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC7DetTotal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC7DetTotal,RP_C_7_DET_TOTAL_LEN);
   	
   }
   
     /**
	 * 	Update RpC7DetTotal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC7DetTotal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7DetTotal+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC7DetailFieldLength() {
			return RP_C_7_DETAIL_LENGTH;
		}

}
  
