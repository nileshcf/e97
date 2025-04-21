package com.cloudframe.app.db2func.dto;

/**
*  The class MsdSecurityNoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdSecurityNoRedefined extends MsdSecurityNoRedefinedSerialized { 
   

						private char[] msdSecurityNo1 = Field.fillLowValue(1);

						private char[] msdSecurityNo27 = Field.fillLowValue(6);
	
	/**
	* Constructor for MsdSecurityNoRedefined
	**/
    public MsdSecurityNoRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdSecurityNoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecurityNoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdSecurityNo1
	 *	@return msdSecurityNo1
	 */
   public char[] getMsdSecurityNo1() throws CFException{
     if (isMsdSecurityNo1Modified()) { 
        msdSecurityNo1 = refreshMsdSecurityNo1();
     }
   		return msdSecurityNo1;
   }

  
	/**
	*  set variable msdSecurityNo1
	*  Corresponding COBOL Variable is MSD-SECURITY-NO-1
	*  @param value
	**/
   public void setMsdSecurityNo1(char[] value) {
      msdSecurityNo1 = checkMsdSecurityNo1Constraints(value);
      serializeMsdSecurityNo1(msdSecurityNo1);
   } 

     /**
	 * 	Update MsdSecurityNo1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityNo1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecurityNo1,msdSecurityNo1.length);
   	
   }
   
   public void setMsdSecurityNo1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo1,msdSecurityNo1.length);
   	
   }
   
     /**
	 * 	Update MsdSecurityNo1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNo1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecurityNo1 with another Field
	 *	@param value
	 */
   public void setMsdSecurityNo1(Field source) {
       replace(source,0,source.length(),beginMsdSecurityNo1,MSD_SECURITY_NO_1_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecurityNo1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecurityNo1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecurityNo1,MSD_SECURITY_NO_1_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecurityNo1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNo1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecurityNo27
	 *	@return msdSecurityNo27
	 */
   public char[] getMsdSecurityNo27() throws CFException{
     if (isMsdSecurityNo27Modified()) { 
        msdSecurityNo27 = refreshMsdSecurityNo27();
     }
   		return msdSecurityNo27;
   }

  
	/**
	*  set variable msdSecurityNo27
	*  Corresponding COBOL Variable is MSD-SECURITY-NO-2-7
	*  @param value
	**/
   public void setMsdSecurityNo27(char[] value) {
      msdSecurityNo27 = checkMsdSecurityNo27Constraints(value);
      serializeMsdSecurityNo27(msdSecurityNo27);
   } 

     /**
	 * 	Update MsdSecurityNo27 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityNo27(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecurityNo27,msdSecurityNo27.length);
   	
   }
   
   public void setMsdSecurityNo27(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo27,msdSecurityNo27.length);
   	
   }
   
     /**
	 * 	Update MsdSecurityNo27 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNo27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo27+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecurityNo27 with another Field
	 *	@param value
	 */
   public void setMsdSecurityNo27(Field source) {
       replace(source,0,source.length(),beginMsdSecurityNo27,MSD_SECURITY_NO_27_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecurityNo27 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecurityNo27(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecurityNo27,MSD_SECURITY_NO_27_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecurityNo27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNo27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo27+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsdSecurityNoRedefinedFieldLength() {
			return MSD_SECURITY_NO_REDEFINED_LENGTH;
		}

}
  
