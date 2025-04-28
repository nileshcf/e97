package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004Bs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Cf20004Bs extends Cf20004BsSerialized { 
   

						private char[] cf20004BsLevel = Field.fillLowValue(1);

						private char[] cf20004BsId = Field.fillLowValue(6);
	
	/**
	* Constructor for Cf20004Bs
	**/
    public Cf20004Bs() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Cf20004Bs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004Bs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cf20004BsLevel
	 *	@return cf20004BsLevel
	 */
   public char[] getCf20004BsLevel() throws CFException{
     if (isCf20004BsLevelModified()) { 
        cf20004BsLevel = refreshCf20004BsLevel();
     }
   		return cf20004BsLevel;
   }

  
	/**
	*  set variable cf20004BsLevel
	*  Corresponding COBOL Variable is CF20004-BS-LEVEL
	*  @param value
	**/
   public void setCf20004BsLevel(char[] value) {
      cf20004BsLevel = checkCf20004BsLevelConstraints(value);
      serializeCf20004BsLevel(cf20004BsLevel);
   } 

     /**
	 * 	Update Cf20004BsLevel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004BsLevel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf20004BsLevel,cf20004BsLevel.length);
   	
   }
   
   public void setCf20004BsLevel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsLevel,cf20004BsLevel.length);
   	
   }
   
     /**
	 * 	Update Cf20004BsLevel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004BsLevel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsLevel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf20004BsLevel with another Field
	 *	@param value
	 */
   public void setCf20004BsLevel(Field source) {
       replace(source,0,source.length(),beginCf20004BsLevel,CF_20004_BS_LEVEL_LEN);
   	
   }  
   
     /**
	 * 	Update Cf20004BsLevel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004BsLevel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf20004BsLevel,CF_20004_BS_LEVEL_LEN);
   	
   }
   
     /**
	 * 	Update Cf20004BsLevel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004BsLevel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsLevel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cf20004BsId
	 *	@return cf20004BsId
	 */
   public char[] getCf20004BsId() throws CFException{
     if (isCf20004BsIdModified()) { 
        cf20004BsId = refreshCf20004BsId();
     }
   		return cf20004BsId;
   }

  
	/**
	*  set variable cf20004BsId
	*  Corresponding COBOL Variable is CF20004-BS-ID
	*  @param value
	**/
   public void setCf20004BsId(char[] value) {
      cf20004BsId = checkCf20004BsIdConstraints(value);
      serializeCf20004BsId(cf20004BsId);
   } 

     /**
	 * 	Update Cf20004BsId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004BsId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf20004BsId,cf20004BsId.length);
   	
   }
   
   public void setCf20004BsId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsId,cf20004BsId.length);
   	
   }
   
     /**
	 * 	Update Cf20004BsId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004BsId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf20004BsId with another Field
	 *	@param value
	 */
   public void setCf20004BsId(Field source) {
       replace(source,0,source.length(),beginCf20004BsId,CF_20004_BS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Cf20004BsId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004BsId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf20004BsId,CF_20004_BS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Cf20004BsId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004BsId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Cf20004Bs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCf20004BsLevel(CONSTANTS.SPACE);
         setCf20004BsId(CONSTANTS.SPACE_6);
   }

		public static int getCf20004BsFieldLength() {
			return CF_20004_BS_LENGTH;
		}

}
  
