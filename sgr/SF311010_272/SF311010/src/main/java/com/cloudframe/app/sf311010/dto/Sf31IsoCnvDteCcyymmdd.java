package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoCnvDteCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf31IsoCnvDteCcyymmdd extends Sf31IsoCnvDteCcyymmddSerialized { 
   

						private char[] sf31IsoCnvDteCc = new char[2];

						private char[] sf31IsoCnvDteYy = new char[2];

						private char[] sf31IsoDe16CnvDteMmdd = new char[4];
	
	/**
	* Constructor for Sf31IsoCnvDteCcyymmdd
	**/
    public Sf31IsoCnvDteCcyymmdd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf31IsoCnvDteCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoCnvDteCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoCnvDteCc(fillSpace(2));
								setSf31IsoCnvDteYy(fillSpace(2));
								setSf31IsoDe16CnvDteMmdd(fillSpace(4));
    } 

	/**
	 *	Returns the value of sf31IsoCnvDteCc
	 *	@return sf31IsoCnvDteCc
	 */
   public char[] getSf31IsoCnvDteCc() throws CFException{
     if (isSf31IsoCnvDteCcModified()) { 
        sf31IsoCnvDteCc = refreshSf31IsoCnvDteCc();
     }
   		return sf31IsoCnvDteCc;
   }

  
	/**
	*  set variable sf31IsoCnvDteCc
	*  Corresponding COBOL Variable is SF31-ISO-CNV-DTE-CC
	*  @param value
	**/
   public void setSf31IsoCnvDteCc(char[] value) {
      sf31IsoCnvDteCc = checkSf31IsoCnvDteCcConstraints(value);
      serializeSf31IsoCnvDteCc(sf31IsoCnvDteCc);
   } 

     /**
	 * 	Update Sf31IsoCnvDteCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCnvDteCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoCnvDteCc,sf31IsoCnvDteCc.length);
   	
   }
   
   public void setSf31IsoCnvDteCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteCc,sf31IsoCnvDteCc.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoCnvDteCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCnvDteCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoCnvDteCc with another Field
	 *	@param value
	 */
   public void setSf31IsoCnvDteCc(Field source) {
       replace(source,0,source.length(),beginSf31IsoCnvDteCc,SF_31_ISO_CNV_DTE_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoCnvDteCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoCnvDteCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteCc,SF_31_ISO_CNV_DTE_CC_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoCnvDteCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCnvDteCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoCnvDteYy
	 *	@return sf31IsoCnvDteYy
	 */
   public char[] getSf31IsoCnvDteYy() throws CFException{
     if (isSf31IsoCnvDteYyModified()) { 
        sf31IsoCnvDteYy = refreshSf31IsoCnvDteYy();
     }
   		return sf31IsoCnvDteYy;
   }

  
	/**
	*  set variable sf31IsoCnvDteYy
	*  Corresponding COBOL Variable is SF31-ISO-CNV-DTE-YY
	*  @param value
	**/
   public void setSf31IsoCnvDteYy(char[] value) {
      sf31IsoCnvDteYy = checkSf31IsoCnvDteYyConstraints(value);
      serializeSf31IsoCnvDteYy(sf31IsoCnvDteYy);
   } 

     /**
	 * 	Update Sf31IsoCnvDteYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCnvDteYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoCnvDteYy,sf31IsoCnvDteYy.length);
   	
   }
   
   public void setSf31IsoCnvDteYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteYy,sf31IsoCnvDteYy.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoCnvDteYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCnvDteYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoCnvDteYy with another Field
	 *	@param value
	 */
   public void setSf31IsoCnvDteYy(Field source) {
       replace(source,0,source.length(),beginSf31IsoCnvDteYy,SF_31_ISO_CNV_DTE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoCnvDteYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoCnvDteYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteYy,SF_31_ISO_CNV_DTE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoCnvDteYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCnvDteYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCnvDteYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe16CnvDteMmdd
	 *	@return sf31IsoDe16CnvDteMmdd
	 */
   public char[] getSf31IsoDe16CnvDteMmdd() throws CFException{
     if (isSf31IsoDe16CnvDteMmddModified()) { 
        sf31IsoDe16CnvDteMmdd = refreshSf31IsoDe16CnvDteMmdd();
     }
   		return sf31IsoDe16CnvDteMmdd;
   }

  
	/**
	*  set variable sf31IsoDe16CnvDteMmdd
	*  Corresponding COBOL Variable is SF31-ISO-DE16-CNV-DTE-MMDD
	*  @param value
	**/
   public void setSf31IsoDe16CnvDteMmdd(char[] value) {
      sf31IsoDe16CnvDteMmdd = checkSf31IsoDe16CnvDteMmddConstraints(value);
      serializeSf31IsoDe16CnvDteMmdd(sf31IsoDe16CnvDteMmdd);
   } 

     /**
	 * 	Update Sf31IsoDe16CnvDteMmdd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe16CnvDteMmdd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe16CnvDteMmdd,sf31IsoDe16CnvDteMmdd.length);
   	
   }
   
   public void setSf31IsoDe16CnvDteMmdd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe16CnvDteMmdd,sf31IsoDe16CnvDteMmdd.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe16CnvDteMmdd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe16CnvDteMmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe16CnvDteMmdd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe16CnvDteMmdd with another Field
	 *	@param value
	 */
   public void setSf31IsoDe16CnvDteMmdd(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe16CnvDteMmdd,SF_31_ISO_DE_16_CNV_DTE_MMDD_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe16CnvDteMmdd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe16CnvDteMmdd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe16CnvDteMmdd,SF_31_ISO_DE_16_CNV_DTE_MMDD_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe16CnvDteMmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe16CnvDteMmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe16CnvDteMmdd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf31IsoCnvDteCcyymmddFieldLength() {
			return SF_31_ISO_CNV_DTE_CCYYMMDD_LENGTH;
		}

}
  
