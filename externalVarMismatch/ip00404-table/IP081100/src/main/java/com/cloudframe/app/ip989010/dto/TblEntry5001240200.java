package com.cloudframe.app.ip989010.dto;

/**
*  The class TblEntry5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TblEntry5001240200 extends TblEntry5001240200Serialized { 
   
				private TagKey5001240200 tagKey5001240200 = new TagKey5001240200();
				private TagData5001240200 tagData5001240200 = new TagData5001240200();
	
	/**
	* Constructor for TblEntry5001240200
	**/
    public TblEntry5001240200() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TblEntry5001240200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblEntry5001240200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			tagKey5001240200.setParent(this,getStartOffset() + 0);
	       			tagData5001240200.setParent(this,getStartOffset() + 13);
    } 

	/**
	 *	Returns the value of tagKey5001240200
	 *	@return tagKey5001240200
	 */   
	 public TagKey5001240200 getTagKey5001240200() {
   	return tagKey5001240200;
   }
   /**
	* 	Update TagKey5001240200 with the passed value
	*   Corresponding COBOL Variable is 500-1240200-TAG-KEY
	*	@param value
	*/
   public void setTagKey5001240200(char[] value) {
      tagKey5001240200.setString(value); 
   }   
    
     /**
	 * 	Update TagKey5001240200 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTagKey5001240200(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001240200.begin,tagKey5001240200.length());
   }
   
     /**
	 * 	Update TagKey5001240200 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagKey5001240200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001240200.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TagKey5001240200 with another Field
	 *	@param value
	 */
   public void setTagKey5001240200(Field source) {
   	replace(source,0,source.length(),tagKey5001240200.begin,tagKey5001240200.length());
   }  
   
     /**
	 * 	Update TagKey5001240200 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTagKey5001240200(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001240200.begin,tagKey5001240200.length());
   }
   
     /**
	 * 	Update TagKey5001240200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagKey5001240200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001240200.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tagData5001240200
	 *	@return tagData5001240200
	 */   
	 public TagData5001240200 getTagData5001240200() {
   	return tagData5001240200;
   }
   /**
	* 	Update TagData5001240200 with the passed value
	*   Corresponding COBOL Variable is 500-1240200-TAG-DATA
	*	@param value
	*/
   public void setTagData5001240200(char[] value) {
      tagData5001240200.setString(value); 
   }   
    
     /**
	 * 	Update TagData5001240200 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTagData5001240200(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001240200.begin,tagData5001240200.length());
   }
   
     /**
	 * 	Update TagData5001240200 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagData5001240200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001240200.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TagData5001240200 with another Field
	 *	@param value
	 */
   public void setTagData5001240200(Field source) {
   	replace(source,0,source.length(),tagData5001240200.begin,tagData5001240200.length());
   }  
   
     /**
	 * 	Update TagData5001240200 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTagData5001240200(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001240200.begin,tagData5001240200.length());
   }
   
     /**
	 * 	Update TagData5001240200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagData5001240200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001240200.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTblEntry5001240200FieldLength() {
			return TBL_ENTRY_5001240200_LENGTH;
		}

}
  
