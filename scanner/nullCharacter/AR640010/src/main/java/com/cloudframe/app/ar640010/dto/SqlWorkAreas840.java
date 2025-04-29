package com.cloudframe.app.ar640010.dto;

/**
*  The class SqlWorkAreas840 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlWorkAreas840 extends SqlWorkAreas840Serialized {
   

						private char[] currentTs840 = new char[26];
				private CurrentTs840Redefined currentTs840Redefined = new CurrentTs840Redefined();

								private int filesAvail840;

						private char[] oldStatCd840 = new char[1];

						private char[] oldLstUpdtTs840 = new char[26];
	
	/**
	* Constructor for SqlWorkAreas840
	**/
    public SqlWorkAreas840() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			currentTs840Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setCurrentTs840(fillSpace(26));
								setFilesAvail840(0);
								setOldStatCd840(fillSpace(1));
								setOldLstUpdtTs840(fillSpace(26));
    }


 

	/**
	 *	Returns the value of currentTs840
	 *	@return currentTs840
	 */
   public char[] getCurrentTs840() throws CFException{
     if (isCurrentTs840Modified()) { 
        currentTs840 = refreshCurrentTs840();
     }
   		return currentTs840;
   }

  
	/**
	*  set variable currentTs840
	*  Corresponding COBOL Variable is 840-CURRENT-TS
	*  @param value
	**/
   public void setCurrentTs840(char[] value) {
      currentTs840 = checkCurrentTs840Constraints(value);
      serializeCurrentTs840(currentTs840);
   } 

     /**
	 * 	Update CurrentTs840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentTs840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentTs840,currentTs840.length);
   	
   }
   
   public void setCurrentTs840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTs840,currentTs840.length);
   	
   }
   
     /**
	 * 	Update CurrentTs840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTs840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTs840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentTs840 with another Field
	 *	@param value
	 */
   public void setCurrentTs840(Field source) {
       replace(source,0,source.length(),beginCurrentTs840,CURRENT_TS_840_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentTs840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentTs840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentTs840,CURRENT_TS_840_LEN);
   	
   }
   
     /**
	 * 	Update CurrentTs840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTs840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTs840+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentTs840Redefined
	 *	@return currentTs840Redefined
	 */   
	 public CurrentTs840Redefined getCurrentTs840Redefined() {
   	return currentTs840Redefined;
   }
   /**
	* 	Update CurrentTs840Redefined with the passed value
	*   Corresponding COBOL Variable is 840-CURRENT-TS-REDEFINED
	*	@param value
	*/
   public void setCurrentTs840Redefined(char[] value) {
      currentTs840Redefined.setString(value); 
   }   
    
     /**
	 * 	Update CurrentTs840Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentTs840Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentTs840Redefined.begin,currentTs840Redefined.length());
   }
   
     /**
	 * 	Update CurrentTs840Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTs840Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentTs840Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrentTs840Redefined with another Field
	 *	@param value
	 */
   public void setCurrentTs840Redefined(Field source) {
   	replace(source,0,source.length(),currentTs840Redefined.begin,currentTs840Redefined.length());
   }  
   
     /**
	 * 	Update CurrentTs840Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentTs840Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentTs840Redefined.begin,currentTs840Redefined.length());
   }
   
     /**
	 * 	Update CurrentTs840Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTs840Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentTs840Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of filesAvail840
	 *	@return filesAvail840
	 */
	public int getFilesAvail840() throws CFException {
        if (isFilesAvail840Modified()) { 
           filesAvail840 = refreshFilesAvail840();
        }
   		return filesAvail840;
	}
	
	/**
	 * 	Update FilesAvail840 with the passed value
	 *  Corresponding COBOL Variable is 840-FILES-AVAIL
	 *	@param number
	 */
	public void setFilesAvail840(int number) {
	     // Truncate if the number is beyond +/- Max range
	    filesAvail840 = checkFilesAvail840MaxLimit(number); 
		serializeFilesAvail840(filesAvail840);
	}


	public void setFilesAvail840(long number) {
	    number = checkFilesAvail840MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFilesAvail840((int)number);
	}
	
	/**
	 *	Returns the value of oldStatCd840
	 *	@return oldStatCd840
	 */
   public char[] getOldStatCd840() throws CFException{
     if (isOldStatCd840Modified()) { 
        oldStatCd840 = refreshOldStatCd840();
     }
   		return oldStatCd840;
   }

  
	/**
	*  set variable oldStatCd840
	*  Corresponding COBOL Variable is 840-OLD-STAT-CD
	*  @param value
	**/
   public void setOldStatCd840(char[] value) {
      oldStatCd840 = checkOldStatCd840Constraints(value);
      serializeOldStatCd840(oldStatCd840);
   } 

     /**
	 * 	Update OldStatCd840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldStatCd840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldStatCd840,oldStatCd840.length);
   	
   }
   
   public void setOldStatCd840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldStatCd840,oldStatCd840.length);
   	
   }
   
     /**
	 * 	Update OldStatCd840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldStatCd840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldStatCd840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldStatCd840 with another Field
	 *	@param value
	 */
   public void setOldStatCd840(Field source) {
       replace(source,0,source.length(),beginOldStatCd840,OLD_STAT_CD_840_LEN);
   	
   }  
   
     /**
	 * 	Update OldStatCd840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldStatCd840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldStatCd840,OLD_STAT_CD_840_LEN);
   	
   }
   
     /**
	 * 	Update OldStatCd840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldStatCd840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldStatCd840+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of oldLstUpdtTs840
	 *	@return oldLstUpdtTs840
	 */
   public char[] getOldLstUpdtTs840() throws CFException{
     if (isOldLstUpdtTs840Modified()) { 
        oldLstUpdtTs840 = refreshOldLstUpdtTs840();
     }
   		return oldLstUpdtTs840;
   }

  
	/**
	*  set variable oldLstUpdtTs840
	*  Corresponding COBOL Variable is 840-OLD-LST-UPDT-TS
	*  @param value
	**/
   public void setOldLstUpdtTs840(char[] value) {
      oldLstUpdtTs840 = checkOldLstUpdtTs840Constraints(value);
      serializeOldLstUpdtTs840(oldLstUpdtTs840);
   } 

     /**
	 * 	Update OldLstUpdtTs840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldLstUpdtTs840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldLstUpdtTs840,oldLstUpdtTs840.length);
   	
   }
   
   public void setOldLstUpdtTs840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldLstUpdtTs840,oldLstUpdtTs840.length);
   	
   }
   
     /**
	 * 	Update OldLstUpdtTs840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldLstUpdtTs840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldLstUpdtTs840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldLstUpdtTs840 with another Field
	 *	@param value
	 */
   public void setOldLstUpdtTs840(Field source) {
       replace(source,0,source.length(),beginOldLstUpdtTs840,OLD_LST_UPDT_TS_840_LEN);
   	
   }  
   
     /**
	 * 	Update OldLstUpdtTs840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldLstUpdtTs840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldLstUpdtTs840,OLD_LST_UPDT_TS_840_LEN);
   	
   }
   
     /**
	 * 	Update OldLstUpdtTs840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldLstUpdtTs840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldLstUpdtTs840+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlWorkAreas840FieldLength() {
			return SQL_WORK_AREAS_840_LENGTH;
		}

}
  
