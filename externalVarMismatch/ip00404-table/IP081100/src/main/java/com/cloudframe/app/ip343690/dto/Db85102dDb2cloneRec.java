package com.cloudframe.app.ip343690.dto;

/**
*  The class Db85102dDb2cloneRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Db85102dDb2cloneRec extends Db85102dDb2cloneRecSerialized { 
   

						private char[] db85102dDb2CloneNum = Field.fillLowValue(3);
	
	/**
	* Constructor for Db85102dDb2cloneRec
	**/
    public Db85102dDb2cloneRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of db85102dDb2CloneNum
	 *	@return db85102dDb2CloneNum
	 */
   public char[] getDb85102dDb2CloneNum() throws CFException{
     if (isDb85102dDb2CloneNumModified()) { 
        db85102dDb2CloneNum = refreshDb85102dDb2CloneNum();
     }
   		return db85102dDb2CloneNum;
   }

  
	/**
	*  set variable db85102dDb2CloneNum
	*  Corresponding COBOL Variable is DB85102D-DB2-CLONE-NUM
	*  @param value
	**/
   public void setDb85102dDb2CloneNum(char[] value) {
      db85102dDb2CloneNum = checkDb85102dDb2CloneNumConstraints(value);
      serializeDb85102dDb2CloneNum(db85102dDb2CloneNum);
   } 

     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dDb2CloneNum,db85102dDb2CloneNum.length);
   	
   }
   
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CloneNum,db85102dDb2CloneNum.length);
   	
   }
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CloneNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dDb2CloneNum with another Field
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source) {
       replace(source,0,source.length(),beginDb85102dDb2CloneNum,DB_85102D_DB_2_CLONE_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dDb2CloneNum,DB_85102D_DB_2_CLONE_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CloneNum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDb85102dDb2cloneRecFieldLength() {
			return DB_85102D_DB_2CLONE_REC_LENGTH;
		}

}
  
