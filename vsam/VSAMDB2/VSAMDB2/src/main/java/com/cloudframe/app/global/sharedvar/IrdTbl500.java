package com.cloudframe.app.global.sharedvar;

/**
*  The class IrdTbl500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IrdTbl500 extends IrdTbl500Serialized { 
   

						private char[] ird500 = Field.fillLowValue(2);

						private char[] irdResStatus500 = Field.fillLowValue(1);
	
	/**
	* Constructor for IrdTbl500
	**/
    public IrdTbl500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IrdTbl500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IrdTbl500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ird500
	 *	@return ird500
	 */
   public char[] getIrd500() throws CFException{
     if (isIrd500Modified()) { 
        ird500 = refreshIrd500();
     }
   		return ird500;
   }

  
	/**
	*  set variable ird500
	*  Corresponding COBOL Variable is 500-IRD
	*  @param value
	**/
   public void setIrd500(char[] value) {
      ird500 = checkIrd500Constraints(value);
      serializeIrd500(ird500);
   } 

     /**
	 * 	Update Ird500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIrd500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIrd500,ird500.length);
   	
   }
   
   public void setIrd500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIrd500,ird500.length);
   	
   }
   
     /**
	 * 	Update Ird500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIrd500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIrd500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ird500 with another Field
	 *	@param value
	 */
   public void setIrd500(Field source) {
       replace(source,0,source.length(),beginIrd500,IRD_500_LEN);
   	
   }  
   
     /**
	 * 	Update Ird500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIrd500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIrd500,IRD_500_LEN);
   	
   }
   
     /**
	 * 	Update Ird500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIrd500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIrd500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of irdResStatus500
	 *	@return irdResStatus500
	 */
   public char[] getIrdResStatus500() throws CFException{
     if (isIrdResStatus500Modified()) { 
        irdResStatus500 = refreshIrdResStatus500();
     }
   		return irdResStatus500;
   }

  
	/**
	*  set variable irdResStatus500
	*  Corresponding COBOL Variable is 500-IRD-RES-STATUS
	*  @param value
	**/
   public void setIrdResStatus500(char[] value) {
      irdResStatus500 = checkIrdResStatus500Constraints(value);
      serializeIrdResStatus500(irdResStatus500);
   } 

     /**
	 * 	Update IrdResStatus500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIrdResStatus500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIrdResStatus500,irdResStatus500.length);
   	
   }
   
   public void setIrdResStatus500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIrdResStatus500,irdResStatus500.length);
   	
   }
   
     /**
	 * 	Update IrdResStatus500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIrdResStatus500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIrdResStatus500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IrdResStatus500 with another Field
	 *	@param value
	 */
   public void setIrdResStatus500(Field source) {
       replace(source,0,source.length(),beginIrdResStatus500,IRD_RES_STATUS_500_LEN);
   	
   }  
   
     /**
	 * 	Update IrdResStatus500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIrdResStatus500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIrdResStatus500,IRD_RES_STATUS_500_LEN);
   	
   }
   
     /**
	 * 	Update IrdResStatus500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIrdResStatus500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIrdResStatus500+targetIndex,targetLen);
    
   }
	char[] irdResPass8850088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIrdResPass88500()
	 *	@return  Returns true if isIrdResPass88500() is "Y"
	 */
   public boolean isIrdResPass88500() throws CFException {
      return (  compareChars( getIrdResStatus500() , irdResPass8850088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIrdResPass88500True() {  			
    	setIrdResStatus500( irdResPass8850088Value);
   	}
	char[] irdResFail8850088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIrdResFail88500()
	 *	@return  Returns true if isIrdResFail88500() is "N"
	 */
   public boolean isIrdResFail88500() throws CFException {
      return (  compareChars( getIrdResStatus500() , irdResFail8850088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIrdResFail88500True() {  			
    	setIrdResStatus500( irdResFail8850088Value);
   	}

	
	
	
	/**
	 * 	initializes IrdTbl500
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIrd500(CONSTANTS.SPACE_2);
         setIrdResStatus500(CONSTANTS.SPACE);
   }

		public static int getIrdTbl500FieldLength() {
			return IRD_TBL_500_LENGTH;
		}

}
  
