package com.cloudframe.app.ip224620.dto;

/**
*  The class Pds501Value800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/


import com.cloudframe.app.ip224620.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pds501Value800 extends Pds501Value800Serialized { 
   

						private char[] pds501s1Value800 = new char[2];

						private char[] pds501s2Value800 = new char[3];

						private char[] pds501s3Value800 = new char[3];

						private char[] pds501s4Value800 = new char[8];
	
	/**
	* Constructor for Pds501Value800
	**/
    public Pds501Value800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPds501s1Value800(fillSpace(2));
								setPds501s2Value800(fillSpace(3));
								setPds501s3Value800(fillSpace(3));
								setPds501s4Value800(fillSpace(8));
    }


 

	/**
	 *	Returns the value of pds501s1Value800
	 *	@return pds501s1Value800
	 */
   public char[] getPds501s1Value800() throws CFException{
     if (isPds501s1Value800Modified()) { 
        pds501s1Value800 = refreshPds501s1Value800();
     }
   		return pds501s1Value800;
   }

  
	/**
	*  set variable pds501s1Value800
	*  Corresponding COBOL Variable is 800-PDS501S1-VALUE
	*  @param value
	**/
   public void setPds501s1Value800(char[] value) {
      pds501s1Value800 = checkPds501s1Value800Constraints(value);
      serializePds501s1Value800(pds501s1Value800);
   } 

     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds501s1Value800,pds501s1Value800.length);
   	
   }
   
   public void setPds501s1Value800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s1Value800,pds501s1Value800.length);
   	
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s1Value800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds501s1Value800 with another Field
	 *	@param value
	 */
   public void setPds501s1Value800(Field source) {
       replace(source,0,source.length(),beginPds501s1Value800,PDS_501S_1_VALUE_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds501s1Value800,PDS_501S_1_VALUE_800_LEN);
   	
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s1Value800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pds501s2Value800
	 *	@return pds501s2Value800
	 */
   public char[] getPds501s2Value800() throws CFException{
     if (isPds501s2Value800Modified()) { 
        pds501s2Value800 = refreshPds501s2Value800();
     }
   		return pds501s2Value800;
   }

  
	/**
	*  set variable pds501s2Value800
	*  Corresponding COBOL Variable is 800-PDS501S2-VALUE
	*  @param value
	**/
   public void setPds501s2Value800(char[] value) {
      pds501s2Value800 = checkPds501s2Value800Constraints(value);
      serializePds501s2Value800(pds501s2Value800);
   } 

     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds501s2Value800,pds501s2Value800.length);
   	
   }
   
   public void setPds501s2Value800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s2Value800,pds501s2Value800.length);
   	
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s2Value800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds501s2Value800 with another Field
	 *	@param value
	 */
   public void setPds501s2Value800(Field source) {
       replace(source,0,source.length(),beginPds501s2Value800,PDS_501S_2_VALUE_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds501s2Value800,PDS_501S_2_VALUE_800_LEN);
   	
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s2Value800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pds501s3Value800
	 *	@return pds501s3Value800
	 */
   public char[] getPds501s3Value800() throws CFException{
     if (isPds501s3Value800Modified()) { 
        pds501s3Value800 = refreshPds501s3Value800();
     }
   		return pds501s3Value800;
   }

  
	/**
	*  set variable pds501s3Value800
	*  Corresponding COBOL Variable is 800-PDS501S3-VALUE
	*  @param value
	**/
   public void setPds501s3Value800(char[] value) {
      pds501s3Value800 = checkPds501s3Value800Constraints(value);
      serializePds501s3Value800(pds501s3Value800);
   } 

     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds501s3Value800,pds501s3Value800.length);
   	
   }
   
   public void setPds501s3Value800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s3Value800,pds501s3Value800.length);
   	
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s3Value800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds501s3Value800 with another Field
	 *	@param value
	 */
   public void setPds501s3Value800(Field source) {
       replace(source,0,source.length(),beginPds501s3Value800,PDS_501S_3_VALUE_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds501s3Value800,PDS_501S_3_VALUE_800_LEN);
   	
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s3Value800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pds501s4Value800
	 *	@return pds501s4Value800
	 */
   public char[] getPds501s4Value800() throws CFException{
     if (isPds501s4Value800Modified()) { 
        pds501s4Value800 = refreshPds501s4Value800();
     }
   		return pds501s4Value800;
   }

  
	/**
	*  set variable pds501s4Value800
	*  Corresponding COBOL Variable is 800-PDS501S4-VALUE
	*  @param value
	**/
   public void setPds501s4Value800(char[] value) {
      pds501s4Value800 = checkPds501s4Value800Constraints(value);
      serializePds501s4Value800(pds501s4Value800);
   } 

     /**
	 * 	Update Pds501s4Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s4Value800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds501s4Value800,pds501s4Value800.length);
   	
   }
   
   public void setPds501s4Value800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s4Value800,pds501s4Value800.length);
   	
   }
   
     /**
	 * 	Update Pds501s4Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s4Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s4Value800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds501s4Value800 with another Field
	 *	@param value
	 */
   public void setPds501s4Value800(Field source) {
       replace(source,0,source.length(),beginPds501s4Value800,PDS_501S_4_VALUE_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds501s4Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s4Value800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds501s4Value800,PDS_501S_4_VALUE_800_LEN);
   	
   }
   
     /**
	 * 	Update Pds501s4Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s4Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds501s4Value800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPds501Value800FieldLength() {
			return PDS_501_VALUE_800_LENGTH;
		}

}
  
