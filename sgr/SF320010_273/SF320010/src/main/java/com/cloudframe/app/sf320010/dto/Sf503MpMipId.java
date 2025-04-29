package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503MpMipId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503MpMipId extends Sf503MpMipIdSerialized { 
   

						private char[] sf503MpMid = Field.fillLowValue(3);
	
	/**
	* Constructor for Sf503MpMipId
	**/
    public Sf503MpMipId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503MpMipId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503MpMipId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503MpMid
	 *	@return sf503MpMid
	 */
   public char[] getSf503MpMid() throws CFException{
     if (isSf503MpMidModified()) { 
        sf503MpMid = refreshSf503MpMid();
     }
   		return sf503MpMid;
   }

  
	/**
	*  set variable sf503MpMid
	*  Corresponding COBOL Variable is SF503-MP-MID
	*  @param value
	**/
   public void setSf503MpMid(char[] value) {
      sf503MpMid = checkSf503MpMidConstraints(value);
      serializeSf503MpMid(sf503MpMid);
   } 

     /**
	 * 	Update Sf503MpMid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503MpMid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503MpMid,sf503MpMid.length);
   	
   }
   
   public void setSf503MpMid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpMid,sf503MpMid.length);
   	
   }
   
     /**
	 * 	Update Sf503MpMid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpMid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503MpMid with another Field
	 *	@param value
	 */
   public void setSf503MpMid(Field source) {
       replace(source,0,source.length(),beginSf503MpMid,SF_503_MP_MID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503MpMid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503MpMid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503MpMid,SF_503_MP_MID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503MpMid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpMid+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503MpMipIdFieldLength() {
			return SF_503_MP_MIP_ID_LENGTH;
		}

}
  
