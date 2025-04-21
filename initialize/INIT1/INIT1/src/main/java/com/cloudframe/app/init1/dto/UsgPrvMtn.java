package com.cloudframe.app.init1.dto;

/**
*  The class UsgPrvMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class UsgPrvMtn extends UsgPrvMtnSerialized { 
   

						private char[] usgPrvNpa = new char[3];

						private char[] usgPrvNxx = new char[3];

						private char[] usgPrvTln = new char[4];
	
	/**
	* Constructor for UsgPrvMtn
	**/
    public UsgPrvMtn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for UsgPrvMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UsgPrvMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setUsgPrvNpa(fillSpace(3));
								setUsgPrvNxx(fillSpace(3));
								setUsgPrvTln(fillSpace(4));
    } 

	/**
	 *	Returns the value of usgPrvNpa
	 *	@return usgPrvNpa
	 */
   public char[] getUsgPrvNpa() throws CFException{
     if (isUsgPrvNpaModified()) { 
        usgPrvNpa = refreshUsgPrvNpa();
     }
   		return usgPrvNpa;
   }

  
	/**
	*  set variable usgPrvNpa
	*  Corresponding COBOL Variable is WS-USG-PRV-NPA
	*  @param value
	**/
   public void setUsgPrvNpa(char[] value) {
      usgPrvNpa = checkUsgPrvNpaConstraints(value);
      serializeUsgPrvNpa(usgPrvNpa);
   } 

     /**
	 * 	Update UsgPrvNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvNpa,usgPrvNpa.length);
   	
   }
   
   public void setUsgPrvNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvNpa,usgPrvNpa.length);
   	
   }
   
     /**
	 * 	Update UsgPrvNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvNpa with another Field
	 *	@param value
	 */
   public void setUsgPrvNpa(Field source) {
       replace(source,0,source.length(),beginUsgPrvNpa,USG_PRV_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvNpa,USG_PRV_NPA_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgPrvNxx
	 *	@return usgPrvNxx
	 */
   public char[] getUsgPrvNxx() throws CFException{
     if (isUsgPrvNxxModified()) { 
        usgPrvNxx = refreshUsgPrvNxx();
     }
   		return usgPrvNxx;
   }

  
	/**
	*  set variable usgPrvNxx
	*  Corresponding COBOL Variable is WS-USG-PRV-NXX
	*  @param value
	**/
   public void setUsgPrvNxx(char[] value) {
      usgPrvNxx = checkUsgPrvNxxConstraints(value);
      serializeUsgPrvNxx(usgPrvNxx);
   } 

     /**
	 * 	Update UsgPrvNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvNxx,usgPrvNxx.length);
   	
   }
   
   public void setUsgPrvNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvNxx,usgPrvNxx.length);
   	
   }
   
     /**
	 * 	Update UsgPrvNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvNxx with another Field
	 *	@param value
	 */
   public void setUsgPrvNxx(Field source) {
       replace(source,0,source.length(),beginUsgPrvNxx,USG_PRV_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvNxx,USG_PRV_NXX_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgPrvTln
	 *	@return usgPrvTln
	 */
   public char[] getUsgPrvTln() throws CFException{
     if (isUsgPrvTlnModified()) { 
        usgPrvTln = refreshUsgPrvTln();
     }
   		return usgPrvTln;
   }

  
	/**
	*  set variable usgPrvTln
	*  Corresponding COBOL Variable is WS-USG-PRV-TLN
	*  @param value
	**/
   public void setUsgPrvTln(char[] value) {
      usgPrvTln = checkUsgPrvTlnConstraints(value);
      serializeUsgPrvTln(usgPrvTln);
   } 

     /**
	 * 	Update UsgPrvTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvTln,usgPrvTln.length);
   	
   }
   
   public void setUsgPrvTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvTln,usgPrvTln.length);
   	
   }
   
     /**
	 * 	Update UsgPrvTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvTln with another Field
	 *	@param value
	 */
   public void setUsgPrvTln(Field source) {
       replace(source,0,source.length(),beginUsgPrvTln,USG_PRV_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvTln,USG_PRV_TLN_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvTln+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes UsgPrvMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setUsgPrvNpa(CONSTANTS.SPACE_3);
         setUsgPrvNxx(CONSTANTS.SPACE_3);
         setUsgPrvTln(CONSTANTS.SPACE_4);
   }

		public static int getUsgPrvMtnFieldLength() {
			return USG_PRV_MTN_LENGTH;
		}

}
  
