package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar649UserParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar649UserParms extends Ar649UserParmsSerialized { 
   

						private char[] ar649UserBulkId = new char[4];

						private char[] ar649UserEndptId = new char[7];

						private char[] ar649UserCyclNum = new char[3];
	
	/**
	* Constructor for Ar649UserParms
	**/
    public Ar649UserParms() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ar649UserParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar649UserParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr649UserBulkId(fillSpace(4));
								setAr649UserEndptId(fillSpace(7));
								setAr649UserCyclNum(fillSpace(3));
    } 

	/**
	 *	Returns the value of ar649UserBulkId
	 *	@return ar649UserBulkId
	 */
   public char[] getAr649UserBulkId() throws CFException{
     if (isAr649UserBulkIdModified()) { 
        ar649UserBulkId = refreshAr649UserBulkId();
     }
   		return ar649UserBulkId;
   }

  
	/**
	*  set variable ar649UserBulkId
	*  Corresponding COBOL Variable is AR649-USER-BULK-ID
	*  @param value
	**/
   public void setAr649UserBulkId(char[] value) {
      ar649UserBulkId = checkAr649UserBulkIdConstraints(value);
      serializeAr649UserBulkId(ar649UserBulkId);
   } 

     /**
	 * 	Update Ar649UserBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr649UserBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr649UserBulkId,ar649UserBulkId.length);
   	
   }
   
   public void setAr649UserBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserBulkId,ar649UserBulkId.length);
   	
   }
   
     /**
	 * 	Update Ar649UserBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar649UserBulkId with another Field
	 *	@param value
	 */
   public void setAr649UserBulkId(Field source) {
       replace(source,0,source.length(),beginAr649UserBulkId,AR_649_USER_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ar649UserBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr649UserBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr649UserBulkId,AR_649_USER_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ar649UserBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar649UserEndptId
	 *	@return ar649UserEndptId
	 */
   public char[] getAr649UserEndptId() throws CFException{
     if (isAr649UserEndptIdModified()) { 
        ar649UserEndptId = refreshAr649UserEndptId();
     }
   		return ar649UserEndptId;
   }

  
	/**
	*  set variable ar649UserEndptId
	*  Corresponding COBOL Variable is AR649-USER-ENDPT-ID
	*  @param value
	**/
   public void setAr649UserEndptId(char[] value) {
      ar649UserEndptId = checkAr649UserEndptIdConstraints(value);
      serializeAr649UserEndptId(ar649UserEndptId);
   } 

     /**
	 * 	Update Ar649UserEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr649UserEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr649UserEndptId,ar649UserEndptId.length);
   	
   }
   
   public void setAr649UserEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserEndptId,ar649UserEndptId.length);
   	
   }
   
     /**
	 * 	Update Ar649UserEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar649UserEndptId with another Field
	 *	@param value
	 */
   public void setAr649UserEndptId(Field source) {
       replace(source,0,source.length(),beginAr649UserEndptId,AR_649_USER_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ar649UserEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr649UserEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr649UserEndptId,AR_649_USER_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ar649UserEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar649UserCyclNum
	 *	@return ar649UserCyclNum
	 */
   public char[] getAr649UserCyclNum() throws CFException{
     if (isAr649UserCyclNumModified()) { 
        ar649UserCyclNum = refreshAr649UserCyclNum();
     }
   		return ar649UserCyclNum;
   }

  
	/**
	*  set variable ar649UserCyclNum
	*  Corresponding COBOL Variable is AR649-USER-CYCL-NUM
	*  @param value
	**/
   public void setAr649UserCyclNum(char[] value) {
      ar649UserCyclNum = checkAr649UserCyclNumConstraints(value);
      serializeAr649UserCyclNum(ar649UserCyclNum);
   } 

     /**
	 * 	Update Ar649UserCyclNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr649UserCyclNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr649UserCyclNum,ar649UserCyclNum.length);
   	
   }
   
   public void setAr649UserCyclNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserCyclNum,ar649UserCyclNum.length);
   	
   }
   
     /**
	 * 	Update Ar649UserCyclNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserCyclNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserCyclNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar649UserCyclNum with another Field
	 *	@param value
	 */
   public void setAr649UserCyclNum(Field source) {
       replace(source,0,source.length(),beginAr649UserCyclNum,AR_649_USER_CYCL_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ar649UserCyclNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr649UserCyclNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr649UserCyclNum,AR_649_USER_CYCL_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ar649UserCyclNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserCyclNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649UserCyclNum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAr649UserParmsFieldLength() {
			return AR_649_USER_PARMS_LENGTH;
		}

}
  
