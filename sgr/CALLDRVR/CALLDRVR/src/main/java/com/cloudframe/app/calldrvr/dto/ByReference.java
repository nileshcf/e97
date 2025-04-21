package com.cloudframe.app.calldrvr.dto;

/**
*  The class ByReference is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:15. using version 5.0.0.256
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ByReference extends ByReferenceSerialized { 
   
				private Parm4Group parm4Group = new Parm4Group();
				private Parm5Group parm5Group = new Parm5Group();
				private Parm6Group parm6Group = new Parm6Group();
	
	/**
	* Constructor for ByReference
	**/
    public ByReference() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ByReference. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ByReference(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			parm4Group.setParent(this,getStartOffset() + 0);
	       			parm5Group.setParent(this,getStartOffset() + 8);
	       			parm6Group.setParent(this,getStartOffset() + 10);
    } 

	/**
	 *	Returns the value of parm4Group
	 *	@return parm4Group
	 */   
	 public Parm4Group getParm4Group() {
   	return parm4Group;
   }
   /**
	* 	Update Parm4Group with the passed value
	*   Corresponding COBOL Variable is WS-PARM4-GROUP
	*	@param value
	*/
   public void setParm4Group(char[] value) {
      parm4Group.setString(value); 
   }   
    
     /**
	 * 	Update Parm4Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParm4Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm4Group.begin,parm4Group.length());
   }
   
     /**
	 * 	Update Parm4Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm4Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm4Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parm4Group with another Field
	 *	@param value
	 */
   public void setParm4Group(Field source) {
   	replace(source,0,source.length(),parm4Group.begin,parm4Group.length());
   }  
   
     /**
	 * 	Update Parm4Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParm4Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm4Group.begin,parm4Group.length());
   }
   
     /**
	 * 	Update Parm4Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm4Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm4Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of parm5Group
	 *	@return parm5Group
	 */   
	 public Parm5Group getParm5Group() {
   	return parm5Group;
   }
   /**
	* 	Update Parm5Group with the passed value
	*   Corresponding COBOL Variable is WS-PARM5-GROUP
	*	@param value
	*/
   public void setParm5Group(char[] value) {
      parm5Group.setString(value); 
   }   
    
     /**
	 * 	Update Parm5Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParm5Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm5Group.begin,parm5Group.length());
   }
   
     /**
	 * 	Update Parm5Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm5Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm5Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parm5Group with another Field
	 *	@param value
	 */
   public void setParm5Group(Field source) {
   	replace(source,0,source.length(),parm5Group.begin,parm5Group.length());
   }  
   
     /**
	 * 	Update Parm5Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParm5Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm5Group.begin,parm5Group.length());
   }
   
     /**
	 * 	Update Parm5Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm5Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm5Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of parm6Group
	 *	@return parm6Group
	 */   
	 public Parm6Group getParm6Group() {
   	return parm6Group;
   }
   /**
	* 	Update Parm6Group with the passed value
	*   Corresponding COBOL Variable is WS-PARM6-GROUP
	*	@param value
	*/
   public void setParm6Group(char[] value) {
      parm6Group.setString(value); 
   }   
    
     /**
	 * 	Update Parm6Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParm6Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm6Group.begin,parm6Group.length());
   }
   
     /**
	 * 	Update Parm6Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm6Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm6Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parm6Group with another Field
	 *	@param value
	 */
   public void setParm6Group(Field source) {
   	replace(source,0,source.length(),parm6Group.begin,parm6Group.length());
   }  
   
     /**
	 * 	Update Parm6Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParm6Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm6Group.begin,parm6Group.length());
   }
   
     /**
	 * 	Update Parm6Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm6Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm6Group.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getByReferenceFieldLength() {
			return BY_REFERENCE_LENGTH;
		}

}
  
