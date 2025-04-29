package com.cloudframe.app.db2funci.dto;

/**
*  The class ParmlstGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ParmlstGroup extends ParmlstGroupSerialized {
   
					private Parmlst parmlst = new Parmlst();
					private Parmbuf parmbuf = new Parmbuf();
	
	/**
	* Constructor for ParmlstGroup
	**/
    public ParmlstGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			parmlst.setParent(this,getStartOffset() + 0);
	       			parmbuf.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmlst
	 *	@return parmlst
	 */   
	 public Parmlst getParmlst() {
   	return parmlst;
   }
   /**
	* 	Update Parmlst with the passed value
	*   Corresponding COBOL Variable is PARMLST
	*	@param value
	*/
   public void setParmlst(char[] value) {
      parmlst.setString(value); 
   }   
    
     /**
	 * 	Update Parmlst 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParmlst(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parmlst.begin,parmlst.length());
   }
   
     /**
	 * 	Update Parmlst 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmlst(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parmlst.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parmlst with another Field
	 *	@param value
	 */
   public void setParmlst(Field source) {
   	replace(source,0,source.length(),parmlst.begin,parmlst.length());
   }  
   
     /**
	 * 	Update Parmlst 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParmlst(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parmlst.begin,parmlst.length());
   }
   
     /**
	 * 	Update Parmlst 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmlst(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parmlst.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of parmbuf
	 *	@return parmbuf
	 */   
	 public Parmbuf getParmbuf() {
   	return parmbuf;
   }
   /**
	* 	Update Parmbuf with the passed value
	*   Corresponding COBOL Variable is PARMBUF
	*	@param value
	*/
   public void setParmbuf(char[] value) {
      parmbuf.setString(value); 
   }   
    
     /**
	 * 	Update Parmbuf 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParmbuf(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parmbuf.begin,parmbuf.length());
   }
   
     /**
	 * 	Update Parmbuf 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmbuf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parmbuf.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parmbuf with another Field
	 *	@param value
	 */
   public void setParmbuf(Field source) {
   	replace(source,0,source.length(),parmbuf.begin,parmbuf.length());
   }  
   
     /**
	 * 	Update Parmbuf 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParmbuf(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parmbuf.begin,parmbuf.length());
   }
   
     /**
	 * 	Update Parmbuf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmbuf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parmbuf.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getParmlstGroupFieldLength() {
			return PARMLST_GROUP_LENGTH;
		}

}
  
