package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamErrorMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class DynamErrorMsg650 extends DynamErrorMsg650Serialized { 
   


								private char[] dynamErrorRc650 = new char[9];
							


						private char[] dynamFunction650 = new char[8];


							private char[] dynamErrorMsg650ConditionGroup4 = new char[12];
						
	
	/**
	* Constructor for DynamErrorMsg650
	**/
    public DynamErrorMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("5000-MCDYNAM ERROR - RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,34
             );
								setDynamErrorRc650(fillSpace(9));
       replaceValue( // serialize and save the value
             (", FUNCTION: ").toCharArray()
             , getStartOffset() + 43
             ,12
             );
								setDynamFunction650(fillSpace(8));
       replaceValue( // serialize and save the value
             (" = ").toCharArray()
             , getStartOffset() + 63
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(12)
             , getStartOffset() + 66
             ,12
             );
    }


 

	/**
	 *	Returns the value of dynamErrorRc650
	 *	@return dynamErrorRc650
	 */
   public char[] getDynamErrorRc650() throws CFException{
     if (isDynamErrorRc650Modified()) { 
        dynamErrorRc650 = refreshDynamErrorRc650();
     }
   		return dynamErrorRc650;
   }

  
	/**
	*  set variable dynamErrorRc650
	*  Corresponding COBOL Variable is 650-DYNAM-ERROR-RC
	*  @param value
	**/
   public void setDynamErrorRc650(char[] value) {
      dynamErrorRc650 = checkDynamErrorRc650Constraints(value);
      serializeDynamErrorRc650(dynamErrorRc650);
   } 

     /**
	 * 	Update DynamErrorRc650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamErrorRc650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamErrorRc650,dynamErrorRc650.length);
   	
   }
   
   public void setDynamErrorRc650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamErrorRc650,dynamErrorRc650.length);
   	
   }
   
     /**
	 * 	Update DynamErrorRc650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamErrorRc650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamErrorRc650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamErrorRc650 with another Field
	 *	@param value
	 */
   public void setDynamErrorRc650(Field source) {
       replace(source,0,source.length(),beginDynamErrorRc650,DYNAM_ERROR_RC_650_LEN);
   	
   }  
   
     /**
	 * 	Update DynamErrorRc650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamErrorRc650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamErrorRc650,DYNAM_ERROR_RC_650_LEN);
   	
   }
   
     /**
	 * 	Update DynamErrorRc650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamErrorRc650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamErrorRc650+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamFunction650
	 *	@return dynamFunction650
	 */
   public char[] getDynamFunction650() throws CFException{
     if (isDynamFunction650Modified()) { 
        dynamFunction650 = refreshDynamFunction650();
     }
   		return dynamFunction650;
   }

  
	/**
	*  set variable dynamFunction650
	*  Corresponding COBOL Variable is 650-DYNAM-FUNCTION
	*  @param value
	**/
   public void setDynamFunction650(char[] value) {
      dynamFunction650 = checkDynamFunction650Constraints(value);
      serializeDynamFunction650(dynamFunction650);
   } 

     /**
	 * 	Update DynamFunction650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamFunction650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamFunction650,dynamFunction650.length);
   	
   }
   
   public void setDynamFunction650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamFunction650,dynamFunction650.length);
   	
   }
   
     /**
	 * 	Update DynamFunction650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamFunction650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamFunction650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamFunction650 with another Field
	 *	@param value
	 */
   public void setDynamFunction650(Field source) {
       replace(source,0,source.length(),beginDynamFunction650,DYNAM_FUNCTION_650_LEN);
   	
   }  
   
     /**
	 * 	Update DynamFunction650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamFunction650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamFunction650,DYNAM_FUNCTION_650_LEN);
   	
   }
   
     /**
	 * 	Update DynamFunction650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamFunction650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamFunction650+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamErrorMsg650ConditionGroup4
	 *	@return dynamErrorMsg650ConditionGroup4
	 */
   public char[] getDynamErrorMsg650ConditionGroup4() throws CFException{
     if (isDynamErrorMsg650ConditionGroup4Modified()) { 
        dynamErrorMsg650ConditionGroup4 = refreshDynamErrorMsg650ConditionGroup4();
     }
   		return dynamErrorMsg650ConditionGroup4;
   }

  
	/**
	*  set variable dynamErrorMsg650ConditionGroup4
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setDynamErrorMsg650ConditionGroup4(char[] value) {
      dynamErrorMsg650ConditionGroup4 = checkDynamErrorMsg650ConditionGroup4Constraints(value);
      serializeDynamErrorMsg650ConditionGroup4(dynamErrorMsg650ConditionGroup4);
   } 

     /**
	 * 	Update DynamErrorMsg650ConditionGroup4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamErrorMsg650ConditionGroup4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamErrorMsg650ConditionGroup4,dynamErrorMsg650ConditionGroup4.length);
   	
   }
   
   public void setDynamErrorMsg650ConditionGroup4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamErrorMsg650ConditionGroup4,dynamErrorMsg650ConditionGroup4.length);
   	
   }
   
     /**
	 * 	Update DynamErrorMsg650ConditionGroup4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamErrorMsg650ConditionGroup4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamErrorMsg650ConditionGroup4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamErrorMsg650ConditionGroup4 with another Field
	 *	@param value
	 */
   public void setDynamErrorMsg650ConditionGroup4(Field source) {
       replace(source,0,source.length(),beginDynamErrorMsg650ConditionGroup4,DYNAM_ERROR_MSG_650_CONDITION_GROUP_4_LEN);
   	
   }  
   
     /**
	 * 	Update DynamErrorMsg650ConditionGroup4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamErrorMsg650ConditionGroup4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamErrorMsg650ConditionGroup4,DYNAM_ERROR_MSG_650_CONDITION_GROUP_4_LEN);
   	
   }
   
     /**
	 * 	Update DynamErrorMsg650ConditionGroup4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamErrorMsg650ConditionGroup4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamErrorMsg650ConditionGroup4+targetIndex,targetLen);
    
   }
	char[] dynamInitialize8865088Value = "INITIALIZE  ".toCharArray();
	/**
	 *	Test condition "INITIALIZE  " for isDynamInitialize88650()
	 *	@return  Returns true if isDynamInitialize88650() is "INITIALIZE  "
	 */
   public boolean isDynamInitialize88650() throws CFException {
      return (  compareChars( getDynamErrorMsg650ConditionGroup4() , dynamInitialize8865088Value)  == 0  );
   }


	/**
	*  set values "INITIALIZE  "
	*/
   	public void setDynamInitialize88650True() {  			
    	setDynamErrorMsg650ConditionGroup4( dynamInitialize8865088Value);
   	}
	char[] dynamInformation8865088Value = "INFO        ".toCharArray();
	/**
	 *	Test condition "INFO        " for isDynamInformation88650()
	 *	@return  Returns true if isDynamInformation88650() is "INFO        "
	 */
   public boolean isDynamInformation88650() throws CFException {
      return (  compareChars( getDynamErrorMsg650ConditionGroup4() , dynamInformation8865088Value)  == 0  );
   }


	/**
	*  set values "INFO        "
	*/
   	public void setDynamInformation88650True() {  			
    	setDynamErrorMsg650ConditionGroup4( dynamInformation8865088Value);
   	}
	char[] dynamAllocate8865088Value = "ALLOCATE    ".toCharArray();
	/**
	 *	Test condition "ALLOCATE    " for isDynamAllocate88650()
	 *	@return  Returns true if isDynamAllocate88650() is "ALLOCATE    "
	 */
   public boolean isDynamAllocate88650() throws CFException {
      return (  compareChars( getDynamErrorMsg650ConditionGroup4() , dynamAllocate8865088Value)  == 0  );
   }


	/**
	*  set values "ALLOCATE    "
	*/
   	public void setDynamAllocate88650True() {  			
    	setDynamErrorMsg650ConditionGroup4( dynamAllocate8865088Value);
   	}
	char[] dynamDeleteAlloc8865088Value = "DELETE-ALLOC".toCharArray();
	/**
	 *	Test condition "DELETE-ALLOC" for isDynamDeleteAlloc88650()
	 *	@return  Returns true if isDynamDeleteAlloc88650() is "DELETE-ALLOC"
	 */
   public boolean isDynamDeleteAlloc88650() throws CFException {
      return (  compareChars( getDynamErrorMsg650ConditionGroup4() , dynamDeleteAlloc8865088Value)  == 0  );
   }


	/**
	*  set values "DELETE-ALLOC"
	*/
   	public void setDynamDeleteAlloc88650True() {  			
    	setDynamErrorMsg650ConditionGroup4( dynamDeleteAlloc8865088Value);
   	}
	char[] dynamUnallocate8865088Value = "UNALLOCATE  ".toCharArray();
	/**
	 *	Test condition "UNALLOCATE  " for isDynamUnallocate88650()
	 *	@return  Returns true if isDynamUnallocate88650() is "UNALLOCATE  "
	 */
   public boolean isDynamUnallocate88650() throws CFException {
      return (  compareChars( getDynamErrorMsg650ConditionGroup4() , dynamUnallocate8865088Value)  == 0  );
   }


	/**
	*  set values "UNALLOCATE  "
	*/
   	public void setDynamUnallocate88650True() {  			
    	setDynamErrorMsg650ConditionGroup4( dynamUnallocate8865088Value);
   	}
	char[] dynamEnd8865088Value = "END         ".toCharArray();
	/**
	 *	Test condition "END         " for isDynamEnd88650()
	 *	@return  Returns true if isDynamEnd88650() is "END         "
	 */
   public boolean isDynamEnd88650() throws CFException {
      return (  compareChars( getDynamErrorMsg650ConditionGroup4() , dynamEnd8865088Value)  == 0  );
   }


	/**
	*  set values "END         "
	*/
   	public void setDynamEnd88650True() {  			
    	setDynamErrorMsg650ConditionGroup4( dynamEnd8865088Value);
   	}

	
	
	

		public static int getDynamErrorMsg650FieldLength() {
			return DYNAM_ERROR_MSG_650_LENGTH;
		}

}
  
