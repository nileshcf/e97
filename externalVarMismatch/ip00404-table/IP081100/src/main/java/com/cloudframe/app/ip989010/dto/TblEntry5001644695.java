package com.cloudframe.app.ip989010.dto;

/**
*  The class TblEntry5001644695 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TblEntry5001644695 extends TblEntry5001644695Serialized { 
   
				private TagKey5001644695 tagKey5001644695 = new TagKey5001644695();
				private TagData5001644695 tagData5001644695 = new TagData5001644695();
	
	/**
	* Constructor for TblEntry5001644695
	**/
    public TblEntry5001644695() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TblEntry5001644695. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblEntry5001644695(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			tagKey5001644695.setParent(this,getStartOffset() + 0);
	       			tagData5001644695.setParent(this,getStartOffset() + 13);
    } 

	/**
	 *	Returns the value of tagKey5001644695
	 *	@return tagKey5001644695
	 */   
	 public TagKey5001644695 getTagKey5001644695() {
   	return tagKey5001644695;
   }
   /**
	* 	Update TagKey5001644695 with the passed value
	*   Corresponding COBOL Variable is 500-1644695-TAG-KEY
	*	@param value
	*/
   public void setTagKey5001644695(char[] value) {
      tagKey5001644695.setString(value); 
   }   
    
     /**
	 * 	Update TagKey5001644695 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTagKey5001644695(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644695.begin,tagKey5001644695.length());
   }
   
     /**
	 * 	Update TagKey5001644695 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagKey5001644695(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644695.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TagKey5001644695 with another Field
	 *	@param value
	 */
   public void setTagKey5001644695(Field source) {
   	replace(source,0,source.length(),tagKey5001644695.begin,tagKey5001644695.length());
   }  
   
     /**
	 * 	Update TagKey5001644695 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTagKey5001644695(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644695.begin,tagKey5001644695.length());
   }
   
     /**
	 * 	Update TagKey5001644695 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagKey5001644695(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagKey5001644695.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tagData5001644695
	 *	@return tagData5001644695
	 */   
	 public TagData5001644695 getTagData5001644695() {
   	return tagData5001644695;
   }
   /**
	* 	Update TagData5001644695 with the passed value
	*   Corresponding COBOL Variable is 500-1644695-TAG-DATA
	*	@param value
	*/
   public void setTagData5001644695(char[] value) {
      tagData5001644695.setString(value); 
   }   
    
     /**
	 * 	Update TagData5001644695 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTagData5001644695(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644695.begin,tagData5001644695.length());
   }
   
     /**
	 * 	Update TagData5001644695 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagData5001644695(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644695.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TagData5001644695 with another Field
	 *	@param value
	 */
   public void setTagData5001644695(Field source) {
   	replace(source,0,source.length(),tagData5001644695.begin,tagData5001644695.length());
   }  
   
     /**
	 * 	Update TagData5001644695 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTagData5001644695(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644695.begin,tagData5001644695.length());
   }
   
     /**
	 * 	Update TagData5001644695 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagData5001644695(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tagData5001644695.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTblEntry5001644695FieldLength() {
			return TBL_ENTRY_5001644695_LENGTH;
		}

}
  
