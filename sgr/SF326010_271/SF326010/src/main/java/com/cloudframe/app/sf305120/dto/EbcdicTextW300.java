package com.cloudframe.app.sf305120.dto;

/**
*  The class EbcdicTextW300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EbcdicTextW300 extends EbcdicTextW300Serialized { 
   
				private EbcdicTextWGroup300Group1 ebcdicTextWGroup300Group1 = new EbcdicTextWGroup300Group1();

				private EbcdicTextWGroup300Group5 ebcdicTextWGroup300Group5 = new EbcdicTextWGroup300Group5();
				private EbcdicTextWGroup300Group8 ebcdicTextWGroup300Group8 = new EbcdicTextWGroup300Group8();
	
	/**
	* Constructor for EbcdicTextW300
	**/
    public EbcdicTextW300() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EbcdicTextW300. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EbcdicTextW300(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ebcdicTextWGroup300Group1.setParent(this,getStartOffset() + 0);
	       			ebcdicTextWGroup300Group5.setParent(this,getStartOffset() + 34);
	       			ebcdicTextWGroup300Group8.setParent(this,getStartOffset() + 60);
       replaceValue( // serialize and save the value
             ("0123456789").toCharArray()
             , getStartOffset() + 24
             ,10
             );
    } 

	/**
	 *	Returns the value of ebcdicTextWGroup300Group1
	 *	@return ebcdicTextWGroup300Group1
	 */   
	 public EbcdicTextWGroup300Group1 getEbcdicTextWGroup300Group1() {
   	return ebcdicTextWGroup300Group1;
   }
   /**
	* 	Update EbcdicTextWGroup300Group1 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setEbcdicTextWGroup300Group1(char[] value) {
      ebcdicTextWGroup300Group1.setString(value); 
   }   
    
     /**
	 * 	Update EbcdicTextWGroup300Group1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group1.begin,ebcdicTextWGroup300Group1.length());
   }
   
     /**
	 * 	Update EbcdicTextWGroup300Group1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EbcdicTextWGroup300Group1 with another Field
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group1(Field source) {
   	replace(source,0,source.length(),ebcdicTextWGroup300Group1.begin,ebcdicTextWGroup300Group1.length());
   }  
   
     /**
	 * 	Update EbcdicTextWGroup300Group1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group1.begin,ebcdicTextWGroup300Group1.length());
   }
   
     /**
	 * 	Update EbcdicTextWGroup300Group1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ebcdicTextWGroup300Group5
	 *	@return ebcdicTextWGroup300Group5
	 */   
	 public EbcdicTextWGroup300Group5 getEbcdicTextWGroup300Group5() {
   	return ebcdicTextWGroup300Group5;
   }
   /**
	* 	Update EbcdicTextWGroup300Group5 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setEbcdicTextWGroup300Group5(char[] value) {
      ebcdicTextWGroup300Group5.setString(value); 
   }   
    
     /**
	 * 	Update EbcdicTextWGroup300Group5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group5.begin,ebcdicTextWGroup300Group5.length());
   }
   
     /**
	 * 	Update EbcdicTextWGroup300Group5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EbcdicTextWGroup300Group5 with another Field
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group5(Field source) {
   	replace(source,0,source.length(),ebcdicTextWGroup300Group5.begin,ebcdicTextWGroup300Group5.length());
   }  
   
     /**
	 * 	Update EbcdicTextWGroup300Group5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group5.begin,ebcdicTextWGroup300Group5.length());
   }
   
     /**
	 * 	Update EbcdicTextWGroup300Group5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group5.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ebcdicTextWGroup300Group8
	 *	@return ebcdicTextWGroup300Group8
	 */   
	 public EbcdicTextWGroup300Group8 getEbcdicTextWGroup300Group8() {
   	return ebcdicTextWGroup300Group8;
   }
   /**
	* 	Update EbcdicTextWGroup300Group8 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setEbcdicTextWGroup300Group8(char[] value) {
      ebcdicTextWGroup300Group8.setString(value); 
   }   
    
     /**
	 * 	Update EbcdicTextWGroup300Group8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group8.begin,ebcdicTextWGroup300Group8.length());
   }
   
     /**
	 * 	Update EbcdicTextWGroup300Group8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EbcdicTextWGroup300Group8 with another Field
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group8(Field source) {
   	replace(source,0,source.length(),ebcdicTextWGroup300Group8.begin,ebcdicTextWGroup300Group8.length());
   }  
   
     /**
	 * 	Update EbcdicTextWGroup300Group8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group8.begin,ebcdicTextWGroup300Group8.length());
   }
   
     /**
	 * 	Update EbcdicTextWGroup300Group8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicTextWGroup300Group8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicTextWGroup300Group8.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getEbcdicTextW300FieldLength() {
			return EBCDIC_TEXT_W_300_LENGTH;
		}

}
  
