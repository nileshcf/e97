package com.cloudframe.app.ip989010.dto;

/**
*  The class TblEntry5001644697 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TblEntry5001644697 extends TblEntry5001644697Serialized { 
   
				private TagKey5001644697 tagKey5001644697 = new TagKey5001644697();
				private TagData5001644697 tagData5001644697 = new TagData5001644697();
	
	/**
	* Constructor for TblEntry5001644697
	**/
    public TblEntry5001644697() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TblEntry5001644697. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblEntry5001644697(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			tagKey5001644697.setParent(this,getStartOffset() + 0);
	       			tagData5001644697.setParent(this,getStartOffset() + 13);
    } 

	/**
	 *	Returns the value of tagKey5001644697
	 *	@return tagKey5001644697
	 */   
	 public TagKey5001644697 getTagKey5001644697() {
   	return tagKey5001644697;
   }
   /**
	* 	Update TagKey5001644697 with the passed value
	*   Corresponding COBOL Variable is 500-1644697-TAG-KEY
	*	@param value
	*/
   public void setTagKey5001644697(char[] value) {
      tagKey5001644697.setString(value); 
   }   
    
     /**
	 * 	Update TagKey5001644697 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTagKey5001644697(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644697.begin,tagKey5001644697.length());
   }
   
     /**
	 * 	Update TagKey5001644697 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagKey5001644697(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644697.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TagKey5001644697 with another Field
	 *	@param value
	 */
   public void setTagKey5001644697(Field source) {
   	replace(source,0,source.length(),tagKey5001644697.begin,tagKey5001644697.length());
   }  
   
     /**
	 * 	Update TagKey5001644697 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTagKey5001644697(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644697.begin,tagKey5001644697.length());
   }
   
     /**
	 * 	Update TagKey5001644697 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagKey5001644697(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644697.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tagData5001644697
	 *	@return tagData5001644697
	 */   
	 public TagData5001644697 getTagData5001644697() {
   	return tagData5001644697;
   }
   /**
	* 	Update TagData5001644697 with the passed value
	*   Corresponding COBOL Variable is 500-1644697-TAG-DATA
	*	@param value
	*/
   public void setTagData5001644697(char[] value) {
      tagData5001644697.setString(value); 
   }   
    
     /**
	 * 	Update TagData5001644697 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTagData5001644697(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644697.begin,tagData5001644697.length());
   }
   
     /**
	 * 	Update TagData5001644697 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagData5001644697(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644697.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TagData5001644697 with another Field
	 *	@param value
	 */
   public void setTagData5001644697(Field source) {
   	replace(source,0,source.length(),tagData5001644697.begin,tagData5001644697.length());
   }  
   
     /**
	 * 	Update TagData5001644697 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTagData5001644697(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644697.begin,tagData5001644697.length());
   }
   
     /**
	 * 	Update TagData5001644697 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagData5001644697(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644697.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTblEntry5001644697FieldLength() {
			return TBL_ENTRY_5001644697_LENGTH;
		}

}
  
