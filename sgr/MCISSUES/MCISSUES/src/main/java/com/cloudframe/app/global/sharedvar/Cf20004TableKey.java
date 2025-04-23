package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Cf20004TableKey extends Cf20004TableKeySerialized { 
   
				private Cf20004TableId cf20004TableId = new Cf20004TableId();

						private char[] cf20004EffectiveDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Cf20004TableKey
	**/
    public Cf20004TableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Cf20004TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cf20004TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of cf20004TableId
	 *	@return cf20004TableId
	 */   
	 public Cf20004TableId getCf20004TableId() {
   	return cf20004TableId;
   }
   /**
	* 	Update Cf20004TableId with the passed value
	*   Corresponding COBOL Variable is CF20004-TABLE-ID
	*	@param value
	*/
   public void setCf20004TableId(char[] value) {
      cf20004TableId.setString(value); 
   }   
    
     /**
	 * 	Update Cf20004TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCf20004TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableId.begin,cf20004TableId.length());
   }
   
     /**
	 * 	Update Cf20004TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Cf20004TableId with another Field
	 *	@param value
	 */
   public void setCf20004TableId(Field source) {
   	replace(source,0,source.length(),cf20004TableId.begin,cf20004TableId.length());
   }  
   
     /**
	 * 	Update Cf20004TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCf20004TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableId.begin,cf20004TableId.length());
   }
   
     /**
	 * 	Update Cf20004TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cf20004EffectiveDate
	 *	@return cf20004EffectiveDate
	 */
   public char[] getCf20004EffectiveDate() throws CFException{
     if (isCf20004EffectiveDateModified()) { 
        cf20004EffectiveDate = refreshCf20004EffectiveDate();
     }
   		return cf20004EffectiveDate;
   }

  
	/**
	*  set variable cf20004EffectiveDate
	*  Corresponding COBOL Variable is CF20004-EFFECTIVE-DATE
	*  @param value
	**/
   public void setCf20004EffectiveDate(char[] value) {
      cf20004EffectiveDate = checkCf20004EffectiveDateConstraints(value);
      serializeCf20004EffectiveDate(cf20004EffectiveDate);
   } 

     /**
	 * 	Update Cf20004EffectiveDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004EffectiveDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf20004EffectiveDate,cf20004EffectiveDate.length);
   	
   }
   
   public void setCf20004EffectiveDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004EffectiveDate,cf20004EffectiveDate.length);
   	
   }
   
     /**
	 * 	Update Cf20004EffectiveDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004EffectiveDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004EffectiveDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf20004EffectiveDate with another Field
	 *	@param value
	 */
   public void setCf20004EffectiveDate(Field source) {
       replace(source,0,source.length(),beginCf20004EffectiveDate,CF_20004_EFFECTIVE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Cf20004EffectiveDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004EffectiveDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf20004EffectiveDate,CF_20004_EFFECTIVE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Cf20004EffectiveDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004EffectiveDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004EffectiveDate+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Cf20004TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          cf20004TableId.initialize();
     
         setCf20004EffectiveDate(CONSTANTS.SPACE_10);
   }

		public static int getCf20004TableKeyFieldLength() {
			return CF_20004_TABLE_KEY_LENGTH;
		}

}
  
