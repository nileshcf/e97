package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar629ParmArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar629ParmArea extends Ar629ParmAreaSerialized { 
   

						private char[] ar629ProgramId = new char[8];
				private Ar629MsgTypeGroup ar629MsgTypeGroup = new Ar629MsgTypeGroup();
				private Ar629MsgTextGroup ar629MsgTextGroup = new Ar629MsgTextGroup();
	
	/**
	* Constructor for Ar629ParmArea
	**/
    public Ar629ParmArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ar629MsgTypeGroup.setParent(this,getStartOffset() + 8);
	       			ar629MsgTextGroup.setParent(this,getStartOffset() + 9);
	   	/*  end of offset */
								setAr629ProgramId(("AR629010").toCharArray());
    }


 

	/**
	 *	Returns the value of ar629ProgramId
	 *	@return ar629ProgramId
	 */
   public char[] getAr629ProgramId() throws CFException{
     if (isAr629ProgramIdModified()) { 
        ar629ProgramId = refreshAr629ProgramId();
     }
   		return ar629ProgramId;
   }

  
	/**
	*  set variable ar629ProgramId
	*  Corresponding COBOL Variable is AR629-PROGRAM-ID
	*  @param value
	**/
   public void setAr629ProgramId(char[] value) {
      ar629ProgramId = checkAr629ProgramIdConstraints(value);
      serializeAr629ProgramId(ar629ProgramId);
   } 

     /**
	 * 	Update Ar629ProgramId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr629ProgramId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr629ProgramId,ar629ProgramId.length);
   	
   }
   
   public void setAr629ProgramId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr629ProgramId,ar629ProgramId.length);
   	
   }
   
     /**
	 * 	Update Ar629ProgramId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr629ProgramId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr629ProgramId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar629ProgramId with another Field
	 *	@param value
	 */
   public void setAr629ProgramId(Field source) {
       replace(source,0,source.length(),beginAr629ProgramId,AR_629_PROGRAM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ar629ProgramId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr629ProgramId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr629ProgramId,AR_629_PROGRAM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ar629ProgramId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr629ProgramId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr629ProgramId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar629MsgTypeGroup
	 *	@return ar629MsgTypeGroup
	 */   
	 public Ar629MsgTypeGroup getAr629MsgTypeGroup() {
   	return ar629MsgTypeGroup;
   }
   /**
	* 	Update Ar629MsgTypeGroup with the passed value
	*   Corresponding COBOL Variable is AR629-MSG-TYPE-GROUP
	*	@param value
	*/
   public void setAr629MsgTypeGroup(char[] value) {
      ar629MsgTypeGroup.setString(value); 
   }   
    
     /**
	 * 	Update Ar629MsgTypeGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAr629MsgTypeGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTypeGroup.begin,ar629MsgTypeGroup.length());
   }
   
     /**
	 * 	Update Ar629MsgTypeGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgTypeGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTypeGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ar629MsgTypeGroup with another Field
	 *	@param value
	 */
   public void setAr629MsgTypeGroup(Field source) {
   	replace(source,0,source.length(),ar629MsgTypeGroup.begin,ar629MsgTypeGroup.length());
   }  
   
     /**
	 * 	Update Ar629MsgTypeGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAr629MsgTypeGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTypeGroup.begin,ar629MsgTypeGroup.length());
   }
   
     /**
	 * 	Update Ar629MsgTypeGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgTypeGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTypeGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ar629MsgTextGroup
	 *	@return ar629MsgTextGroup
	 */   
	 public Ar629MsgTextGroup getAr629MsgTextGroup() {
   	return ar629MsgTextGroup;
   }
   /**
	* 	Update Ar629MsgTextGroup with the passed value
	*   Corresponding COBOL Variable is AR629-MSG-TEXT-GROUP
	*	@param value
	*/
   public void setAr629MsgTextGroup(char[] value) {
      ar629MsgTextGroup.setString(value); 
   }   
    
     /**
	 * 	Update Ar629MsgTextGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAr629MsgTextGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTextGroup.begin,ar629MsgTextGroup.length());
   }
   
     /**
	 * 	Update Ar629MsgTextGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgTextGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTextGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ar629MsgTextGroup with another Field
	 *	@param value
	 */
   public void setAr629MsgTextGroup(Field source) {
   	replace(source,0,source.length(),ar629MsgTextGroup.begin,ar629MsgTextGroup.length());
   }  
   
     /**
	 * 	Update Ar629MsgTextGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAr629MsgTextGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTextGroup.begin,ar629MsgTextGroup.length());
   }
   
     /**
	 * 	Update Ar629MsgTextGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgTextGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar629MsgTextGroup.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAr629ParmAreaFieldLength() {
			return AR_629_PARM_AREA_LENGTH;
		}

}
  
