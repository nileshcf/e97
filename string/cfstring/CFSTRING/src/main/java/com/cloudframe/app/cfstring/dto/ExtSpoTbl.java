package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtSpoTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExtSpoTbl extends ExtSpoTblSerialized { 
   

						private char[] extMfgNm = Field.fillLowValue(4);

						private char[] extPrdNme = Field.fillLowValue(12);

						private char[] extMacid = Field.fillLowValue(20);

						private char[] extActivationDate = Field.fillLowValue(10);
	
	/**
	* Constructor for ExtSpoTbl
	**/
    public ExtSpoTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtSpoTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtSpoTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of extMfgNm
	 *	@return extMfgNm
	 */
   public char[] getExtMfgNm() throws CFException{
     if (isExtMfgNmModified()) { 
        extMfgNm = refreshExtMfgNm();
     }
   		return extMfgNm;
   }

  
	/**
	*  set variable extMfgNm
	*  Corresponding COBOL Variable is WS-EXT-MFG-NM
	*  @param value
	**/
   public void setExtMfgNm(char[] value) {
      extMfgNm = checkExtMfgNmConstraints(value);
      serializeExtMfgNm(extMfgNm);
   } 

     /**
	 * 	Update ExtMfgNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMfgNm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtMfgNm,extMfgNm.length);
   	
   }
   
   public void setExtMfgNm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtMfgNm,extMfgNm.length);
   	
   }
   
     /**
	 * 	Update ExtMfgNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMfgNm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtMfgNm with another Field
	 *	@param value
	 */
   public void setExtMfgNm(Field source) {
       replace(source,0,source.length(),beginExtMfgNm,EXT_MFG_NM_LEN);
   	
   }  
   
     /**
	 * 	Update ExtMfgNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMfgNm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtMfgNm,EXT_MFG_NM_LEN);
   	
   }
   
     /**
	 * 	Update ExtMfgNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMfgNm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extPrdNme
	 *	@return extPrdNme
	 */
   public char[] getExtPrdNme() throws CFException{
     if (isExtPrdNmeModified()) { 
        extPrdNme = refreshExtPrdNme();
     }
   		return extPrdNme;
   }

  
	/**
	*  set variable extPrdNme
	*  Corresponding COBOL Variable is WS-EXT-PRD-NME
	*  @param value
	**/
   public void setExtPrdNme(char[] value) {
      extPrdNme = checkExtPrdNmeConstraints(value);
      serializeExtPrdNme(extPrdNme);
   } 

     /**
	 * 	Update ExtPrdNme 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtPrdNme(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtPrdNme,extPrdNme.length);
   	
   }
   
   public void setExtPrdNme(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtPrdNme,extPrdNme.length);
   	
   }
   
     /**
	 * 	Update ExtPrdNme 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtPrdNme(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtPrdNme+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtPrdNme with another Field
	 *	@param value
	 */
   public void setExtPrdNme(Field source) {
       replace(source,0,source.length(),beginExtPrdNme,EXT_PRD_NME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtPrdNme 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtPrdNme(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtPrdNme,EXT_PRD_NME_LEN);
   	
   }
   
     /**
	 * 	Update ExtPrdNme 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtPrdNme(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtPrdNme+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extMacid
	 *	@return extMacid
	 */
   public char[] getExtMacid() throws CFException{
     if (isExtMacidModified()) { 
        extMacid = refreshExtMacid();
     }
   		return extMacid;
   }

  
	/**
	*  set variable extMacid
	*  Corresponding COBOL Variable is WS-EXT-MACID
	*  @param value
	**/
   public void setExtMacid(char[] value) {
      extMacid = checkExtMacidConstraints(value);
      serializeExtMacid(extMacid);
   } 

     /**
	 * 	Update ExtMacid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMacid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtMacid,extMacid.length);
   	
   }
   
   public void setExtMacid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtMacid,extMacid.length);
   	
   }
   
     /**
	 * 	Update ExtMacid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMacid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMacid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtMacid with another Field
	 *	@param value
	 */
   public void setExtMacid(Field source) {
       replace(source,0,source.length(),beginExtMacid,EXT_MACID_LEN);
   	
   }  
   
     /**
	 * 	Update ExtMacid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMacid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtMacid,EXT_MACID_LEN);
   	
   }
   
     /**
	 * 	Update ExtMacid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMacid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMacid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extActivationDate
	 *	@return extActivationDate
	 */
   public char[] getExtActivationDate() throws CFException{
     if (isExtActivationDateModified()) { 
        extActivationDate = refreshExtActivationDate();
     }
   		return extActivationDate;
   }

  
	/**
	*  set variable extActivationDate
	*  Corresponding COBOL Variable is WS-EXT-ACTIVATION-DATE
	*  @param value
	**/
   public void setExtActivationDate(char[] value) {
      extActivationDate = checkExtActivationDateConstraints(value);
      serializeExtActivationDate(extActivationDate);
   } 

     /**
	 * 	Update ExtActivationDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtActivationDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtActivationDate,extActivationDate.length);
   	
   }
   
   public void setExtActivationDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtActivationDate,extActivationDate.length);
   	
   }
   
     /**
	 * 	Update ExtActivationDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActivationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtActivationDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtActivationDate with another Field
	 *	@param value
	 */
   public void setExtActivationDate(Field source) {
       replace(source,0,source.length(),beginExtActivationDate,EXT_ACTIVATION_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtActivationDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtActivationDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtActivationDate,EXT_ACTIVATION_DATE_LEN);
   	
   }
   
     /**
	 * 	Update ExtActivationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActivationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtActivationDate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExtSpoTblFieldLength() {
			return EXT_SPO_TBL_LENGTH;
		}

}
  
