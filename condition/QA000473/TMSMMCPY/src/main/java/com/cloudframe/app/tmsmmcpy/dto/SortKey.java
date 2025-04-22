package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class SortKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.tmsmmcpy.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortKey extends SortKeySerialized {
   

						private char[] sortDdrKey = new char[10];

						private char[] sortBatchKey = new char[10];

						private char[] sortExtCapXptId = new char[16];

						private char[] sortDsrvId = new char[4];

						private char[] sortField3 = new char[30];

						private char[] sortField1 = new char[30];
	
	/**
	* Constructor for SortKey
	**/
    public SortKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSortDdrKey(fillSpace(10));
								setSortBatchKey(fillSpace(10));
								setSortExtCapXptId(fillSpace(16));
								setSortDsrvId(fillSpace(4));
								setSortField3(fillSpace(30));
								setSortField1(fillSpace(30));
    }


 

	/**
	 *	Returns the value of sortDdrKey
	 *	@return sortDdrKey
	 */
   public char[] getSortDdrKey() throws CFException{
     if (isSortDdrKeyModified()) { 
        sortDdrKey = refreshSortDdrKey();
     }
   		return sortDdrKey;
   }

  
	/**
	*  set variable sortDdrKey
	*  Corresponding COBOL Variable is WS-SORT-DDR-KEY
	*  @param value
	**/
   public void setSortDdrKey(char[] value) {
      sortDdrKey = checkSortDdrKeyConstraints(value);
      serializeSortDdrKey(sortDdrKey);
   } 

     /**
	 * 	Update SortDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortDdrKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortDdrKey,sortDdrKey.length);
   	
   }
   
   public void setSortDdrKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortDdrKey,sortDdrKey.length);
   	
   }
   
     /**
	 * 	Update SortDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortDdrKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortDdrKey with another Field
	 *	@param value
	 */
   public void setSortDdrKey(Field source) {
       replace(source,0,source.length(),beginSortDdrKey,SORT_DDR_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update SortDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortDdrKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortDdrKey,SORT_DDR_KEY_LEN);
   	
   }
   
     /**
	 * 	Update SortDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortDdrKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sortBatchKey
	 *	@return sortBatchKey
	 */
   public char[] getSortBatchKey() throws CFException{
     if (isSortBatchKeyModified()) { 
        sortBatchKey = refreshSortBatchKey();
     }
   		return sortBatchKey;
   }

  
	/**
	*  set variable sortBatchKey
	*  Corresponding COBOL Variable is WS-SORT-BATCH-KEY
	*  @param value
	**/
   public void setSortBatchKey(char[] value) {
      sortBatchKey = checkSortBatchKeyConstraints(value);
      serializeSortBatchKey(sortBatchKey);
   } 

     /**
	 * 	Update SortBatchKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortBatchKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortBatchKey,sortBatchKey.length);
   	
   }
   
   public void setSortBatchKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortBatchKey,sortBatchKey.length);
   	
   }
   
     /**
	 * 	Update SortBatchKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortBatchKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortBatchKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortBatchKey with another Field
	 *	@param value
	 */
   public void setSortBatchKey(Field source) {
       replace(source,0,source.length(),beginSortBatchKey,SORT_BATCH_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update SortBatchKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortBatchKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortBatchKey,SORT_BATCH_KEY_LEN);
   	
   }
   
     /**
	 * 	Update SortBatchKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortBatchKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortBatchKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sortExtCapXptId
	 *	@return sortExtCapXptId
	 */
   public char[] getSortExtCapXptId() throws CFException{
     if (isSortExtCapXptIdModified()) { 
        sortExtCapXptId = refreshSortExtCapXptId();
     }
   		return sortExtCapXptId;
   }

  
	/**
	*  set variable sortExtCapXptId
	*  Corresponding COBOL Variable is WS-SORT-EXT-CAP-XPT-ID
	*  @param value
	**/
   public void setSortExtCapXptId(char[] value) {
      sortExtCapXptId = checkSortExtCapXptIdConstraints(value);
      serializeSortExtCapXptId(sortExtCapXptId);
   } 

     /**
	 * 	Update SortExtCapXptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortExtCapXptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortExtCapXptId,sortExtCapXptId.length);
   	
   }
   
   public void setSortExtCapXptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortExtCapXptId,sortExtCapXptId.length);
   	
   }
   
     /**
	 * 	Update SortExtCapXptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortExtCapXptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortExtCapXptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortExtCapXptId with another Field
	 *	@param value
	 */
   public void setSortExtCapXptId(Field source) {
       replace(source,0,source.length(),beginSortExtCapXptId,SORT_EXT_CAP_XPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SortExtCapXptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortExtCapXptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortExtCapXptId,SORT_EXT_CAP_XPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update SortExtCapXptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortExtCapXptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortExtCapXptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sortDsrvId
	 *	@return sortDsrvId
	 */
   public char[] getSortDsrvId() throws CFException{
     if (isSortDsrvIdModified()) { 
        sortDsrvId = refreshSortDsrvId();
     }
   		return sortDsrvId;
   }

  
	/**
	*  set variable sortDsrvId
	*  Corresponding COBOL Variable is WS-SORT-DSRV-ID
	*  @param value
	**/
   public void setSortDsrvId(char[] value) {
      sortDsrvId = checkSortDsrvIdConstraints(value);
      serializeSortDsrvId(sortDsrvId);
   } 

     /**
	 * 	Update SortDsrvId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortDsrvId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortDsrvId,sortDsrvId.length);
   	
   }
   
   public void setSortDsrvId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortDsrvId,sortDsrvId.length);
   	
   }
   
     /**
	 * 	Update SortDsrvId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortDsrvId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortDsrvId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortDsrvId with another Field
	 *	@param value
	 */
   public void setSortDsrvId(Field source) {
       replace(source,0,source.length(),beginSortDsrvId,SORT_DSRV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SortDsrvId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortDsrvId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortDsrvId,SORT_DSRV_ID_LEN);
   	
   }
   
     /**
	 * 	Update SortDsrvId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortDsrvId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortDsrvId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sortField3
	 *	@return sortField3
	 */
   public char[] getSortField3() throws CFException{
     if (isSortField3Modified()) { 
        sortField3 = refreshSortField3();
     }
   		return sortField3;
   }

  
	/**
	*  set variable sortField3
	*  Corresponding COBOL Variable is WS-SORT-FIELD3
	*  @param value
	**/
   public void setSortField3(char[] value) {
      sortField3 = checkSortField3Constraints(value);
      serializeSortField3(sortField3);
   } 

     /**
	 * 	Update SortField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortField3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortField3,sortField3.length);
   	
   }
   
   public void setSortField3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortField3,sortField3.length);
   	
   }
   
     /**
	 * 	Update SortField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortField3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortField3 with another Field
	 *	@param value
	 */
   public void setSortField3(Field source) {
       replace(source,0,source.length(),beginSortField3,SORT_FIELD_3_LEN);
   	
   }  
   
     /**
	 * 	Update SortField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortField3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortField3,SORT_FIELD_3_LEN);
   	
   }
   
     /**
	 * 	Update SortField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortField3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sortField1
	 *	@return sortField1
	 */
   public char[] getSortField1() throws CFException{
     if (isSortField1Modified()) { 
        sortField1 = refreshSortField1();
     }
   		return sortField1;
   }

  
	/**
	*  set variable sortField1
	*  Corresponding COBOL Variable is WS-SORT-FIELD1
	*  @param value
	**/
   public void setSortField1(char[] value) {
      sortField1 = checkSortField1Constraints(value);
      serializeSortField1(sortField1);
   } 

     /**
	 * 	Update SortField1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortField1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortField1,sortField1.length);
   	
   }
   
   public void setSortField1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortField1,sortField1.length);
   	
   }
   
     /**
	 * 	Update SortField1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortField1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortField1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortField1 with another Field
	 *	@param value
	 */
   public void setSortField1(Field source) {
       replace(source,0,source.length(),beginSortField1,SORT_FIELD_1_LEN);
   	
   }  
   
     /**
	 * 	Update SortField1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortField1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortField1,SORT_FIELD_1_LEN);
   	
   }
   
     /**
	 * 	Update SortField1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortField1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortField1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortKeyFieldLength() {
			return SORT_KEY_LENGTH;
		}

}
  
