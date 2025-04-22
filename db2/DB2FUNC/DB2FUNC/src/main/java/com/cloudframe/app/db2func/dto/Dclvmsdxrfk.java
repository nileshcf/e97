package com.cloudframe.app.db2func.dto;

/**
*  The class Dclvmsdxrfk is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dclvmsdxrfk extends DclvmsdxrfkSerialized {
   

						private char[] crossReferenceCd = Field.fillLowValue(12);

						private char[] typeXrefCd = Field.fillLowValue(2);

						private char[] securityAdpNbr01 = Field.fillLowValue(7);
	
	/**
	* Constructor for Dclvmsdxrfk
	**/
    public Dclvmsdxrfk() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of crossReferenceCd
	 *	@return crossReferenceCd
	 */
   public char[] getCrossReferenceCd() throws CFException{
     if (isCrossReferenceCdModified()) { 
        crossReferenceCd = refreshCrossReferenceCd();
     }
   		return crossReferenceCd;
   }

  
	/**
	*  set variable crossReferenceCd
	*  Corresponding COBOL Variable is CROSS-REFERENCE-CD
	*  @param value
	**/
   public void setCrossReferenceCd(char[] value) {
      crossReferenceCd = checkCrossReferenceCdConstraints(value);
      serializeCrossReferenceCd(crossReferenceCd);
   } 

     /**
	 * 	Update CrossReferenceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrossReferenceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCrossReferenceCd,crossReferenceCd.length);
   	
   }
   
   public void setCrossReferenceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCrossReferenceCd,crossReferenceCd.length);
   	
   }
   
     /**
	 * 	Update CrossReferenceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrossReferenceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrossReferenceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CrossReferenceCd with another Field
	 *	@param value
	 */
   public void setCrossReferenceCd(Field source) {
       replace(source,0,source.length(),beginCrossReferenceCd,CROSS_REFERENCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CrossReferenceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrossReferenceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCrossReferenceCd,CROSS_REFERENCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update CrossReferenceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrossReferenceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrossReferenceCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of typeXrefCd
	 *	@return typeXrefCd
	 */
   public char[] getTypeXrefCd() throws CFException{
     if (isTypeXrefCdModified()) { 
        typeXrefCd = refreshTypeXrefCd();
     }
   		return typeXrefCd;
   }

  
	/**
	*  set variable typeXrefCd
	*  Corresponding COBOL Variable is TYPE-XREF-CD
	*  @param value
	**/
   public void setTypeXrefCd(char[] value) {
      typeXrefCd = checkTypeXrefCdConstraints(value);
      serializeTypeXrefCd(typeXrefCd);
   } 

     /**
	 * 	Update TypeXrefCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTypeXrefCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTypeXrefCd,typeXrefCd.length);
   	
   }
   
   public void setTypeXrefCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTypeXrefCd,typeXrefCd.length);
   	
   }
   
     /**
	 * 	Update TypeXrefCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTypeXrefCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTypeXrefCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TypeXrefCd with another Field
	 *	@param value
	 */
   public void setTypeXrefCd(Field source) {
       replace(source,0,source.length(),beginTypeXrefCd,TYPE_XREF_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TypeXrefCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTypeXrefCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTypeXrefCd,TYPE_XREF_CD_LEN);
   	
   }
   
     /**
	 * 	Update TypeXrefCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTypeXrefCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTypeXrefCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of securityAdpNbr01
	 *	@return securityAdpNbr01
	 */
   public char[] getSecurityAdpNbr01() throws CFException{
     if (isSecurityAdpNbr01Modified()) { 
        securityAdpNbr01 = refreshSecurityAdpNbr01();
     }
   		return securityAdpNbr01;
   }

  
	/**
	*  set variable securityAdpNbr01
	*  Corresponding COBOL Variable is SECURITY-ADP-NBR
	*  @param value
	**/
   public void setSecurityAdpNbr01(char[] value) {
      securityAdpNbr01 = checkSecurityAdpNbr01Constraints(value);
      serializeSecurityAdpNbr01(securityAdpNbr01);
   } 

     /**
	 * 	Update SecurityAdpNbr01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityAdpNbr01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecurityAdpNbr01,securityAdpNbr01.length);
   	
   }
   
   public void setSecurityAdpNbr01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr01,securityAdpNbr01.length);
   	
   }
   
     /**
	 * 	Update SecurityAdpNbr01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecurityAdpNbr01 with another Field
	 *	@param value
	 */
   public void setSecurityAdpNbr01(Field source) {
       replace(source,0,source.length(),beginSecurityAdpNbr01,SECURITY_ADP_NBR_01_LEN);
   	
   }  
   
     /**
	 * 	Update SecurityAdpNbr01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityAdpNbr01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr01,SECURITY_ADP_NBR_01_LEN);
   	
   }
   
     /**
	 * 	Update SecurityAdpNbr01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr01+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDclvmsdxrfkFieldLength() {
			return DCLVMSDXRFK_LENGTH;
		}

}
  
