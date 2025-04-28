package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecFile530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SpecFile530 extends SpecFile530Serialized { 
   

						private char[] specDsn530 = new char[44];

						private char[] specExt530 = new char[8];
				private SpecExt530Redefined specExt530Redefined = new SpecExt530Redefined();
	
	/**
	* Constructor for SpecFile530
	**/
    public SpecFile530() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SpecFile530. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecFile530(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			specExt530Redefined.setParent(this,getStartOffset() + 44);
								setSpecDsn530(fillSpace(44));
								setSpecExt530(fillSpace(8));
								specExt530Redefined.setString(fillSpace(8));
    } 

	/**
	 *	Returns the value of specDsn530
	 *	@return specDsn530
	 */
   public char[] getSpecDsn530() throws CFException{
     if (isSpecDsn530Modified()) { 
        specDsn530 = refreshSpecDsn530();
     }
   		return specDsn530;
   }

  
	/**
	*  set variable specDsn530
	*  Corresponding COBOL Variable is 530-SPEC-DSN
	*  @param value
	**/
   public void setSpecDsn530(char[] value) {
      specDsn530 = checkSpecDsn530Constraints(value);
      serializeSpecDsn530(specDsn530);
   } 

     /**
	 * 	Update SpecDsn530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecDsn530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecDsn530,specDsn530.length);
   	
   }
   
   public void setSpecDsn530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecDsn530,specDsn530.length);
   	
   }
   
     /**
	 * 	Update SpecDsn530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecDsn530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecDsn530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecDsn530 with another Field
	 *	@param value
	 */
   public void setSpecDsn530(Field source) {
       replace(source,0,source.length(),beginSpecDsn530,SPEC_DSN_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecDsn530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecDsn530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecDsn530,SPEC_DSN_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecDsn530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecDsn530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecDsn530+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of specExt530
	 *	@return specExt530
	 */
   public char[] getSpecExt530() throws CFException{
     if (isSpecExt530Modified()) { 
        specExt530 = refreshSpecExt530();
     }
   		return specExt530;
   }

  
	/**
	*  set variable specExt530
	*  Corresponding COBOL Variable is 530-SPEC-EXT
	*  @param value
	**/
   public void setSpecExt530(char[] value) {
      specExt530 = checkSpecExt530Constraints(value);
      serializeSpecExt530(specExt530);
   } 

     /**
	 * 	Update SpecExt530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecExt530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecExt530,specExt530.length);
   	
   }
   
   public void setSpecExt530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecExt530,specExt530.length);
   	
   }
   
     /**
	 * 	Update SpecExt530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecExt530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecExt530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecExt530 with another Field
	 *	@param value
	 */
   public void setSpecExt530(Field source) {
       replace(source,0,source.length(),beginSpecExt530,SPEC_EXT_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecExt530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecExt530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecExt530,SPEC_EXT_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecExt530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecExt530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecExt530+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of specExt530Redefined
	 *	@return specExt530Redefined
	 */   
	 public SpecExt530Redefined getSpecExt530Redefined() {
   	return specExt530Redefined;
   }
   /**
	* 	Update SpecExt530Redefined with the passed value
	*   Corresponding COBOL Variable is 530-SPEC-EXT-REDEFINED
	*	@param value
	*/
   public void setSpecExt530Redefined(char[] value) {
      specExt530Redefined.setString(value); 
   }   
    
     /**
	 * 	Update SpecExt530Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSpecExt530Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,specExt530Redefined.begin,specExt530Redefined.length());
   }
   
     /**
	 * 	Update SpecExt530Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecExt530Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,specExt530Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SpecExt530Redefined with another Field
	 *	@param value
	 */
   public void setSpecExt530Redefined(Field source) {
   	replace(source,0,source.length(),specExt530Redefined.begin,specExt530Redefined.length());
   }  
   
     /**
	 * 	Update SpecExt530Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSpecExt530Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,specExt530Redefined.begin,specExt530Redefined.length());
   }
   
     /**
	 * 	Update SpecExt530Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecExt530Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,specExt530Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSpecFile530FieldLength() {
			return SPEC_FILE_530_LENGTH;
		}

}
  
