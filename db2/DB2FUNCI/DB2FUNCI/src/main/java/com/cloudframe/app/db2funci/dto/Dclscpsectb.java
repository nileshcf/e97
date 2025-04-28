package com.cloudframe.app.db2funci.dto;

/**
*  The class Dclscpsectb is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dclscpsectb extends DclscpsectbSerialized {
   

						private char[] scpsecAdpSecurityNo = Field.fillLowValue(8);

						private char[] scpsecPriceCd = Field.fillLowValue(3);

						private char[] scpsecSourceCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Dclscpsectb
	**/
    public Dclscpsectb() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of scpsecAdpSecurityNo
	 *	@return scpsecAdpSecurityNo
	 */
   public char[] getScpsecAdpSecurityNo() throws CFException{
     if (isScpsecAdpSecurityNoModified()) { 
        scpsecAdpSecurityNo = refreshScpsecAdpSecurityNo();
     }
   		return scpsecAdpSecurityNo;
   }

  
	/**
	*  set variable scpsecAdpSecurityNo
	*  Corresponding COBOL Variable is SCPSEC-ADP-SECURITY-NO
	*  @param value
	**/
   public void setScpsecAdpSecurityNo(char[] value) {
      scpsecAdpSecurityNo = checkScpsecAdpSecurityNoConstraints(value);
      serializeScpsecAdpSecurityNo(scpsecAdpSecurityNo);
   } 

     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginScpsecAdpSecurityNo,scpsecAdpSecurityNo.length);
   	
   }
   
   public void setScpsecAdpSecurityNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecAdpSecurityNo,scpsecAdpSecurityNo.length);
   	
   }
   
     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecAdpSecurityNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ScpsecAdpSecurityNo with another Field
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(Field source) {
       replace(source,0,source.length(),beginScpsecAdpSecurityNo,SCPSEC_ADP_SECURITY_NO_LEN);
   	
   }  
   
     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginScpsecAdpSecurityNo,SCPSEC_ADP_SECURITY_NO_LEN);
   	
   }
   
     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecAdpSecurityNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of scpsecPriceCd
	 *	@return scpsecPriceCd
	 */
   public char[] getScpsecPriceCd() throws CFException{
     if (isScpsecPriceCdModified()) { 
        scpsecPriceCd = refreshScpsecPriceCd();
     }
   		return scpsecPriceCd;
   }

  
	/**
	*  set variable scpsecPriceCd
	*  Corresponding COBOL Variable is SCPSEC-PRICE-CD
	*  @param value
	**/
   public void setScpsecPriceCd(char[] value) {
      scpsecPriceCd = checkScpsecPriceCdConstraints(value);
      serializeScpsecPriceCd(scpsecPriceCd);
   } 

     /**
	 * 	Update ScpsecPriceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScpsecPriceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginScpsecPriceCd,scpsecPriceCd.length);
   	
   }
   
   public void setScpsecPriceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecPriceCd,scpsecPriceCd.length);
   	
   }
   
     /**
	 * 	Update ScpsecPriceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScpsecPriceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecPriceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ScpsecPriceCd with another Field
	 *	@param value
	 */
   public void setScpsecPriceCd(Field source) {
       replace(source,0,source.length(),beginScpsecPriceCd,SCPSEC_PRICE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ScpsecPriceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScpsecPriceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginScpsecPriceCd,SCPSEC_PRICE_CD_LEN);
   	
   }
   
     /**
	 * 	Update ScpsecPriceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScpsecPriceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecPriceCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of scpsecSourceCd
	 *	@return scpsecSourceCd
	 */
   public char[] getScpsecSourceCd() throws CFException{
     if (isScpsecSourceCdModified()) { 
        scpsecSourceCd = refreshScpsecSourceCd();
     }
   		return scpsecSourceCd;
   }

  
	/**
	*  set variable scpsecSourceCd
	*  Corresponding COBOL Variable is SCPSEC-SOURCE-CD
	*  @param value
	**/
   public void setScpsecSourceCd(char[] value) {
      scpsecSourceCd = checkScpsecSourceCdConstraints(value);
      serializeScpsecSourceCd(scpsecSourceCd);
   } 

     /**
	 * 	Update ScpsecSourceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScpsecSourceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginScpsecSourceCd,scpsecSourceCd.length);
   	
   }
   
   public void setScpsecSourceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecSourceCd,scpsecSourceCd.length);
   	
   }
   
     /**
	 * 	Update ScpsecSourceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScpsecSourceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecSourceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ScpsecSourceCd with another Field
	 *	@param value
	 */
   public void setScpsecSourceCd(Field source) {
       replace(source,0,source.length(),beginScpsecSourceCd,SCPSEC_SOURCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ScpsecSourceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScpsecSourceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginScpsecSourceCd,SCPSEC_SOURCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update ScpsecSourceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScpsecSourceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScpsecSourceCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDclscpsectbFieldLength() {
			return DCLSCPSECTB_LENGTH;
		}

}
  
