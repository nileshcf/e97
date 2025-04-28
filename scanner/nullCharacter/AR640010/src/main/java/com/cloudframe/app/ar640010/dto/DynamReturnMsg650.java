package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamReturnMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class DynamReturnMsg650 extends DynamReturnMsg650Serialized {
   


								private char[] dynamSvc99Rc650 = new char[9];
							


								private char[] dynamSvc99Err650 = new char[9];
							


								private char[] dynamSvc99Inf650 = new char[9];
							
	
	/**
	* Constructor for DynamReturnMsg650
	**/
    public DynamReturnMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("5001-MCDYNAM - SVC99 RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,34
             );
								setDynamSvc99Rc650(fillSpace(9));
       replaceValue( // serialize and save the value
             (", ERROR-CODE: ").toCharArray()
             , getStartOffset() + 43
             ,14
             );
								setDynamSvc99Err650(fillSpace(9));
       replaceValue( // serialize and save the value
             (", INFO-CODE: ").toCharArray()
             , getStartOffset() + 66
             ,13
             );
								setDynamSvc99Inf650(fillSpace(9));
    }


 

	/**
	 *	Returns the value of dynamSvc99Rc650
	 *	@return dynamSvc99Rc650
	 */
   public char[] getDynamSvc99Rc650() throws CFException{
     if (isDynamSvc99Rc650Modified()) { 
        dynamSvc99Rc650 = refreshDynamSvc99Rc650();
     }
   		return dynamSvc99Rc650;
   }

  
	/**
	*  set variable dynamSvc99Rc650
	*  Corresponding COBOL Variable is 650-DYNAM-SVC99-RC
	*  @param value
	**/
   public void setDynamSvc99Rc650(char[] value) {
      dynamSvc99Rc650 = checkDynamSvc99Rc650Constraints(value);
      serializeDynamSvc99Rc650(dynamSvc99Rc650);
   } 

     /**
	 * 	Update DynamSvc99Rc650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamSvc99Rc650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamSvc99Rc650,dynamSvc99Rc650.length);
   	
   }
   
   public void setDynamSvc99Rc650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Rc650,dynamSvc99Rc650.length);
   	
   }
   
     /**
	 * 	Update DynamSvc99Rc650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamSvc99Rc650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Rc650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamSvc99Rc650 with another Field
	 *	@param value
	 */
   public void setDynamSvc99Rc650(Field source) {
       replace(source,0,source.length(),beginDynamSvc99Rc650,DYNAM_SVC_99_RC_650_LEN);
   	
   }  
   
     /**
	 * 	Update DynamSvc99Rc650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamSvc99Rc650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamSvc99Rc650,DYNAM_SVC_99_RC_650_LEN);
   	
   }
   
     /**
	 * 	Update DynamSvc99Rc650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamSvc99Rc650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Rc650+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamSvc99Err650
	 *	@return dynamSvc99Err650
	 */
   public char[] getDynamSvc99Err650() throws CFException{
     if (isDynamSvc99Err650Modified()) { 
        dynamSvc99Err650 = refreshDynamSvc99Err650();
     }
   		return dynamSvc99Err650;
   }

  
	/**
	*  set variable dynamSvc99Err650
	*  Corresponding COBOL Variable is 650-DYNAM-SVC99-ERR
	*  @param value
	**/
   public void setDynamSvc99Err650(char[] value) {
      dynamSvc99Err650 = checkDynamSvc99Err650Constraints(value);
      serializeDynamSvc99Err650(dynamSvc99Err650);
   } 

     /**
	 * 	Update DynamSvc99Err650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamSvc99Err650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamSvc99Err650,dynamSvc99Err650.length);
   	
   }
   
   public void setDynamSvc99Err650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Err650,dynamSvc99Err650.length);
   	
   }
   
     /**
	 * 	Update DynamSvc99Err650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamSvc99Err650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Err650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamSvc99Err650 with another Field
	 *	@param value
	 */
   public void setDynamSvc99Err650(Field source) {
       replace(source,0,source.length(),beginDynamSvc99Err650,DYNAM_SVC_99_ERR_650_LEN);
   	
   }  
   
     /**
	 * 	Update DynamSvc99Err650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamSvc99Err650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamSvc99Err650,DYNAM_SVC_99_ERR_650_LEN);
   	
   }
   
     /**
	 * 	Update DynamSvc99Err650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamSvc99Err650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Err650+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamSvc99Inf650
	 *	@return dynamSvc99Inf650
	 */
   public char[] getDynamSvc99Inf650() throws CFException{
     if (isDynamSvc99Inf650Modified()) { 
        dynamSvc99Inf650 = refreshDynamSvc99Inf650();
     }
   		return dynamSvc99Inf650;
   }

  
	/**
	*  set variable dynamSvc99Inf650
	*  Corresponding COBOL Variable is 650-DYNAM-SVC99-INF
	*  @param value
	**/
   public void setDynamSvc99Inf650(char[] value) {
      dynamSvc99Inf650 = checkDynamSvc99Inf650Constraints(value);
      serializeDynamSvc99Inf650(dynamSvc99Inf650);
   } 

     /**
	 * 	Update DynamSvc99Inf650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamSvc99Inf650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamSvc99Inf650,dynamSvc99Inf650.length);
   	
   }
   
   public void setDynamSvc99Inf650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Inf650,dynamSvc99Inf650.length);
   	
   }
   
     /**
	 * 	Update DynamSvc99Inf650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamSvc99Inf650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Inf650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamSvc99Inf650 with another Field
	 *	@param value
	 */
   public void setDynamSvc99Inf650(Field source) {
       replace(source,0,source.length(),beginDynamSvc99Inf650,DYNAM_SVC_99_INF_650_LEN);
   	
   }  
   
     /**
	 * 	Update DynamSvc99Inf650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamSvc99Inf650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamSvc99Inf650,DYNAM_SVC_99_INF_650_LEN);
   	
   }
   
     /**
	 * 	Update DynamSvc99Inf650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamSvc99Inf650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamSvc99Inf650+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDynamReturnMsg650FieldLength() {
			return DYNAM_RETURN_MSG_650_LENGTH;
		}

}
  
