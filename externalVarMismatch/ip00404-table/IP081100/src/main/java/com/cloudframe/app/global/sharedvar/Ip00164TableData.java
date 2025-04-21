package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00164TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00164TableData extends Ip00164TableDataSerialized { 
   

						private char[] ip00164LicensedProdId = Field.fillLowValue(3);

						private char[] ip00164ProdId = Field.fillLowValue(3);

						private char[] ip00164Ab = Field.fillLowValue(3);

						private char[] ip00164ProdClass = Field.fillLowValue(3);

						private char[] ip00164ProdType = Field.fillLowValue(1);

						private char[] ip00164ProdCatCd = Field.fillLowValue(1);

						private char[] ip00164EuroProdCatCd = Field.fillLowValue(1);

						private char[] ip00164CmrclProductInd = Field.fillLowValue(1);

						private char[] ip00164Filler = Field.fillLowValue(6);
	
	/**
	* Constructor for Ip00164TableData
	**/
    public Ip00164TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00164TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00164TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00164LicensedProdId
	 *	@return ip00164LicensedProdId
	 */
   public char[] getIp00164LicensedProdId() throws CFException{
     if (isIp00164LicensedProdIdModified()) { 
        ip00164LicensedProdId = refreshIp00164LicensedProdId();
     }
   		return ip00164LicensedProdId;
   }

  
	/**
	*  set variable ip00164LicensedProdId
	*  Corresponding COBOL Variable is IP00164-LICENSED-PROD-ID
	*  @param value
	**/
   public void setIp00164LicensedProdId(char[] value) {
      ip00164LicensedProdId = checkIp00164LicensedProdIdConstraints(value);
      serializeIp00164LicensedProdId(ip00164LicensedProdId);
   } 

     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164LicensedProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164LicensedProdId,ip00164LicensedProdId.length);
   	
   }
   
   public void setIp00164LicensedProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164LicensedProdId,ip00164LicensedProdId.length);
   	
   }
   
     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164LicensedProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164LicensedProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164LicensedProdId with another Field
	 *	@param value
	 */
   public void setIp00164LicensedProdId(Field source) {
       replace(source,0,source.length(),beginIp00164LicensedProdId,IP_00164_LICENSED_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164LicensedProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164LicensedProdId,IP_00164_LICENSED_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164LicensedProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164LicensedProdId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164ProdId
	 *	@return ip00164ProdId
	 */
   public char[] getIp00164ProdId() throws CFException{
     if (isIp00164ProdIdModified()) { 
        ip00164ProdId = refreshIp00164ProdId();
     }
   		return ip00164ProdId;
   }

  
	/**
	*  set variable ip00164ProdId
	*  Corresponding COBOL Variable is IP00164-PROD-ID
	*  @param value
	**/
   public void setIp00164ProdId(char[] value) {
      ip00164ProdId = checkIp00164ProdIdConstraints(value);
      serializeIp00164ProdId(ip00164ProdId);
   } 

     /**
	 * 	Update Ip00164ProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164ProdId,ip00164ProdId.length);
   	
   }
   
   public void setIp00164ProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdId,ip00164ProdId.length);
   	
   }
   
     /**
	 * 	Update Ip00164ProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164ProdId with another Field
	 *	@param value
	 */
   public void setIp00164ProdId(Field source) {
       replace(source,0,source.length(),beginIp00164ProdId,IP_00164_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164ProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164ProdId,IP_00164_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164ProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164Ab
	 *	@return ip00164Ab
	 */
   public char[] getIp00164Ab() throws CFException{
     if (isIp00164AbModified()) { 
        ip00164Ab = refreshIp00164Ab();
     }
   		return ip00164Ab;
   }

  
	/**
	*  set variable ip00164Ab
	*  Corresponding COBOL Variable is IP00164-AB
	*  @param value
	**/
   public void setIp00164Ab(char[] value) {
      ip00164Ab = checkIp00164AbConstraints(value);
      serializeIp00164Ab(ip00164Ab);
   } 

     /**
	 * 	Update Ip00164Ab 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164Ab(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164Ab,ip00164Ab.length);
   	
   }
   
   public void setIp00164Ab(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164Ab,ip00164Ab.length);
   	
   }
   
     /**
	 * 	Update Ip00164Ab 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164Ab(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164Ab+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164Ab with another Field
	 *	@param value
	 */
   public void setIp00164Ab(Field source) {
       replace(source,0,source.length(),beginIp00164Ab,IP_00164_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164Ab 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164Ab(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164Ab,IP_00164_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164Ab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164Ab(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164Ab+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164ProdClass
	 *	@return ip00164ProdClass
	 */
   public char[] getIp00164ProdClass() throws CFException{
     if (isIp00164ProdClassModified()) { 
        ip00164ProdClass = refreshIp00164ProdClass();
     }
   		return ip00164ProdClass;
   }

  
	/**
	*  set variable ip00164ProdClass
	*  Corresponding COBOL Variable is IP00164-PROD-CLASS
	*  @param value
	**/
   public void setIp00164ProdClass(char[] value) {
      ip00164ProdClass = checkIp00164ProdClassConstraints(value);
      serializeIp00164ProdClass(ip00164ProdClass);
   } 

     /**
	 * 	Update Ip00164ProdClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164ProdClass,ip00164ProdClass.length);
   	
   }
   
   public void setIp00164ProdClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdClass,ip00164ProdClass.length);
   	
   }
   
     /**
	 * 	Update Ip00164ProdClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164ProdClass with another Field
	 *	@param value
	 */
   public void setIp00164ProdClass(Field source) {
       replace(source,0,source.length(),beginIp00164ProdClass,IP_00164_PROD_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164ProdClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164ProdClass,IP_00164_PROD_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164ProdClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164ProdType
	 *	@return ip00164ProdType
	 */
   public char[] getIp00164ProdType() throws CFException{
     if (isIp00164ProdTypeModified()) { 
        ip00164ProdType = refreshIp00164ProdType();
     }
   		return ip00164ProdType;
   }

  
	/**
	*  set variable ip00164ProdType
	*  Corresponding COBOL Variable is IP00164-PROD-TYPE
	*  @param value
	**/
   public void setIp00164ProdType(char[] value) {
      ip00164ProdType = checkIp00164ProdTypeConstraints(value);
      serializeIp00164ProdType(ip00164ProdType);
   } 

     /**
	 * 	Update Ip00164ProdType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164ProdType,ip00164ProdType.length);
   	
   }
   
   public void setIp00164ProdType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdType,ip00164ProdType.length);
   	
   }
   
     /**
	 * 	Update Ip00164ProdType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164ProdType with another Field
	 *	@param value
	 */
   public void setIp00164ProdType(Field source) {
       replace(source,0,source.length(),beginIp00164ProdType,IP_00164_PROD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164ProdType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164ProdType,IP_00164_PROD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164ProdType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException{
     if (isIp00164ProdCatCdModified()) { 
        ip00164ProdCatCd = refreshIp00164ProdCatCd();
     }
   		return ip00164ProdCatCd;
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  Corresponding COBOL Variable is IP00164-PROD-CAT-CD
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) {
      ip00164ProdCatCd = checkIp00164ProdCatCdConstraints(value);
      serializeIp00164ProdCatCd(ip00164ProdCatCd);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164ProdCatCd,ip00164ProdCatCd.length);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdCatCd,ip00164ProdCatCd.length);
   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdCatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
       replace(source,0,source.length(),beginIp00164ProdCatCd,IP_00164_PROD_CAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164ProdCatCd,IP_00164_PROD_CAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164ProdCatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164EuroProdCatCd
	 *	@return ip00164EuroProdCatCd
	 */
   public char[] getIp00164EuroProdCatCd() throws CFException{
     if (isIp00164EuroProdCatCdModified()) { 
        ip00164EuroProdCatCd = refreshIp00164EuroProdCatCd();
     }
   		return ip00164EuroProdCatCd;
   }

  
	/**
	*  set variable ip00164EuroProdCatCd
	*  Corresponding COBOL Variable is IP00164-EURO-PROD-CAT-CD
	*  @param value
	**/
   public void setIp00164EuroProdCatCd(char[] value) {
      ip00164EuroProdCatCd = checkIp00164EuroProdCatCdConstraints(value);
      serializeIp00164EuroProdCatCd(ip00164EuroProdCatCd);
   } 

     /**
	 * 	Update Ip00164EuroProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164EuroProdCatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164EuroProdCatCd,ip00164EuroProdCatCd.length);
   	
   }
   
   public void setIp00164EuroProdCatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164EuroProdCatCd,ip00164EuroProdCatCd.length);
   	
   }
   
     /**
	 * 	Update Ip00164EuroProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164EuroProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164EuroProdCatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164EuroProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164EuroProdCatCd(Field source) {
       replace(source,0,source.length(),beginIp00164EuroProdCatCd,IP_00164_EURO_PROD_CAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164EuroProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164EuroProdCatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164EuroProdCatCd,IP_00164_EURO_PROD_CAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164EuroProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164EuroProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164EuroProdCatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164CmrclProductInd
	 *	@return ip00164CmrclProductInd
	 */
   public char[] getIp00164CmrclProductInd() throws CFException{
     if (isIp00164CmrclProductIndModified()) { 
        ip00164CmrclProductInd = refreshIp00164CmrclProductInd();
     }
   		return ip00164CmrclProductInd;
   }

  
	/**
	*  set variable ip00164CmrclProductInd
	*  Corresponding COBOL Variable is IP00164-CMRCL-PRODUCT-IND
	*  @param value
	**/
   public void setIp00164CmrclProductInd(char[] value) {
      ip00164CmrclProductInd = checkIp00164CmrclProductIndConstraints(value);
      serializeIp00164CmrclProductInd(ip00164CmrclProductInd);
   } 

     /**
	 * 	Update Ip00164CmrclProductInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164CmrclProductInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164CmrclProductInd,ip00164CmrclProductInd.length);
   	
   }
   
   public void setIp00164CmrclProductInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164CmrclProductInd,ip00164CmrclProductInd.length);
   	
   }
   
     /**
	 * 	Update Ip00164CmrclProductInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164CmrclProductInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164CmrclProductInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164CmrclProductInd with another Field
	 *	@param value
	 */
   public void setIp00164CmrclProductInd(Field source) {
       replace(source,0,source.length(),beginIp00164CmrclProductInd,IP_00164_CMRCL_PRODUCT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164CmrclProductInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164CmrclProductInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164CmrclProductInd,IP_00164_CMRCL_PRODUCT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164CmrclProductInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164CmrclProductInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164CmrclProductInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00164Filler
	 *	@return ip00164Filler
	 */
   public char[] getIp00164Filler() throws CFException{
     if (isIp00164FillerModified()) { 
        ip00164Filler = refreshIp00164Filler();
     }
   		return ip00164Filler;
   }

  
	/**
	*  set variable ip00164Filler
	*  Corresponding COBOL Variable is IP00164-FILLER
	*  @param value
	**/
   public void setIp00164Filler(char[] value) {
      ip00164Filler = checkIp00164FillerConstraints(value);
      serializeIp00164Filler(ip00164Filler);
   } 

     /**
	 * 	Update Ip00164Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164Filler,ip00164Filler.length);
   	
   }
   
   public void setIp00164Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164Filler,ip00164Filler.length);
   	
   }
   
     /**
	 * 	Update Ip00164Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164Filler with another Field
	 *	@param value
	 */
   public void setIp00164Filler(Field source) {
       replace(source,0,source.length(),beginIp00164Filler,IP_00164_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164Filler,IP_00164_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00164TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00164LicensedProdId(CONSTANTS.SPACE_3);
         setIp00164ProdId(CONSTANTS.SPACE_3);
         setIp00164Ab(CONSTANTS.SPACE_3);
         setIp00164ProdClass(CONSTANTS.SPACE_3);
         setIp00164ProdType(CONSTANTS.SPACE);
         setIp00164ProdCatCd(CONSTANTS.SPACE);
         setIp00164EuroProdCatCd(CONSTANTS.SPACE);
         setIp00164CmrclProductInd(CONSTANTS.SPACE);
         setIp00164Filler(CONSTANTS.SPACE_6);
   }

		public static int getIp00164TableDataFieldLength() {
			return IP_00164_TABLE_DATA_LENGTH;
		}

}
  
