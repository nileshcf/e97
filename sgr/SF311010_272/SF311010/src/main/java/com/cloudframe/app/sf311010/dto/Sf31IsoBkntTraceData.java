package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoBkntTraceData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf31IsoBkntTraceData extends Sf31IsoBkntTraceDataSerialized { 
   

						private char[] sf31IsoBkntProdDesc = new char[3];

						private char[] sf31IsoBkntRefNo = new char[6];
	
	/**
	* Constructor for Sf31IsoBkntTraceData
	**/
    public Sf31IsoBkntTraceData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf31IsoBkntTraceData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoBkntTraceData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoBkntProdDesc(fillSpace(3));
								setSf31IsoBkntRefNo(fillSpace(6));
    } 

	/**
	 *	Returns the value of sf31IsoBkntProdDesc
	 *	@return sf31IsoBkntProdDesc
	 */
   public char[] getSf31IsoBkntProdDesc() throws CFException{
     if (isSf31IsoBkntProdDescModified()) { 
        sf31IsoBkntProdDesc = refreshSf31IsoBkntProdDesc();
     }
   		return sf31IsoBkntProdDesc;
   }

  
	/**
	*  set variable sf31IsoBkntProdDesc
	*  Corresponding COBOL Variable is SF31-ISO-BKNT-PROD-DESC
	*  @param value
	**/
   public void setSf31IsoBkntProdDesc(char[] value) {
      sf31IsoBkntProdDesc = checkSf31IsoBkntProdDescConstraints(value);
      serializeSf31IsoBkntProdDesc(sf31IsoBkntProdDesc);
   } 

     /**
	 * 	Update Sf31IsoBkntProdDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoBkntProdDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoBkntProdDesc,sf31IsoBkntProdDesc.length);
   	
   }
   
   public void setSf31IsoBkntProdDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBkntProdDesc,sf31IsoBkntProdDesc.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoBkntProdDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntProdDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBkntProdDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoBkntProdDesc with another Field
	 *	@param value
	 */
   public void setSf31IsoBkntProdDesc(Field source) {
       replace(source,0,source.length(),beginSf31IsoBkntProdDesc,SF_31_ISO_BKNT_PROD_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoBkntProdDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoBkntProdDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoBkntProdDesc,SF_31_ISO_BKNT_PROD_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoBkntProdDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntProdDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBkntProdDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoBkntRefNo
	 *	@return sf31IsoBkntRefNo
	 */
   public char[] getSf31IsoBkntRefNo() throws CFException{
     if (isSf31IsoBkntRefNoModified()) { 
        sf31IsoBkntRefNo = refreshSf31IsoBkntRefNo();
     }
   		return sf31IsoBkntRefNo;
   }

  
	/**
	*  set variable sf31IsoBkntRefNo
	*  Corresponding COBOL Variable is SF31-ISO-BKNT-REF-NO
	*  @param value
	**/
   public void setSf31IsoBkntRefNo(char[] value) {
      sf31IsoBkntRefNo = checkSf31IsoBkntRefNoConstraints(value);
      serializeSf31IsoBkntRefNo(sf31IsoBkntRefNo);
   } 

     /**
	 * 	Update Sf31IsoBkntRefNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoBkntRefNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoBkntRefNo,sf31IsoBkntRefNo.length);
   	
   }
   
   public void setSf31IsoBkntRefNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBkntRefNo,sf31IsoBkntRefNo.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoBkntRefNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntRefNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBkntRefNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoBkntRefNo with another Field
	 *	@param value
	 */
   public void setSf31IsoBkntRefNo(Field source) {
       replace(source,0,source.length(),beginSf31IsoBkntRefNo,SF_31_ISO_BKNT_REF_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoBkntRefNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoBkntRefNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoBkntRefNo,SF_31_ISO_BKNT_REF_NO_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoBkntRefNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntRefNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBkntRefNo+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf31IsoBkntTraceDataFieldLength() {
			return SF_31_ISO_BKNT_TRACE_DATA_LENGTH;
		}

}
  
