package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdSecurityDesc1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MsdSecurityDesc1 extends MsdSecurityDesc1Serialized { 
   

						private char[] msdFiller = Field.fillLowValue(3);

						private char[] msdFiller2 = Field.fillLowValue(27);
	
	/**
	* Constructor for MsdSecurityDesc1
	**/
    public MsdSecurityDesc1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdSecurityDesc1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecurityDesc1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdFiller
	 *	@return msdFiller
	 */
   public char[] getMsdFiller() throws CFException{
     if (isMsdFillerModified()) { 
        msdFiller = refreshMsdFiller();
     }
   		return msdFiller;
   }

  
	/**
	*  set variable msdFiller
	*  Corresponding COBOL Variable is MSD-FILLER
	*  @param value
	**/
   public void setMsdFiller(char[] value) {
      msdFiller = checkMsdFillerConstraints(value);
      serializeMsdFiller(msdFiller);
   } 

     /**
	 * 	Update MsdFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFiller,msdFiller.length);
   	
   }
   
   public void setMsdFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFiller,msdFiller.length);
   	
   }
   
     /**
	 * 	Update MsdFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFiller with another Field
	 *	@param value
	 */
   public void setMsdFiller(Field source) {
       replace(source,0,source.length(),beginMsdFiller,MSD_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFiller,MSD_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update MsdFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFiller+targetIndex,targetLen);
    
   }
	char[] msdIntSecurity88Value = "***".toCharArray();
	/**
	 *	Test condition "***" for isMsdIntSecurity()
	 *	@return  Returns true if isMsdIntSecurity() is "***"
	 */
   public boolean isMsdIntSecurity() throws CFException {
      return (  compareChars( getMsdFiller() , msdIntSecurity88Value)  == 0  );
   }


	/**
	*  set values "***"
	*/
   	public void setMsdIntSecurityTrue() {  			
    	setMsdFiller( msdIntSecurity88Value);
   	}
	/**
	 *	Returns the value of msdFiller2
	 *	@return msdFiller2
	 */
   public char[] getMsdFiller2() throws CFException{
     if (isMsdFiller2Modified()) { 
        msdFiller2 = refreshMsdFiller2();
     }
   		return msdFiller2;
   }

  
	/**
	*  set variable msdFiller2
	*  Corresponding COBOL Variable is MSD-FILLER2
	*  @param value
	**/
   public void setMsdFiller2(char[] value) {
      msdFiller2 = checkMsdFiller2Constraints(value);
      serializeMsdFiller2(msdFiller2);
   } 

     /**
	 * 	Update MsdFiller2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFiller2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFiller2,msdFiller2.length);
   	
   }
   
   public void setMsdFiller2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFiller2,msdFiller2.length);
   	
   }
   
     /**
	 * 	Update MsdFiller2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFiller2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFiller2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFiller2 with another Field
	 *	@param value
	 */
   public void setMsdFiller2(Field source) {
       replace(source,0,source.length(),beginMsdFiller2,MSD_FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFiller2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFiller2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFiller2,MSD_FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update MsdFiller2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFiller2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFiller2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MsdSecurityDesc1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdFiller(CONSTANTS.SPACE_3);
         setMsdFiller2(CONSTANTS.SPACE_27);
   }

		public static int getMsdSecurityDesc1FieldLength() {
			return MSD_SECURITY_DESC_1_LENGTH;
		}

}
  
