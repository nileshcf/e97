package com.cloudframe.app.ip650010.dto;

/**
*  The class RecordsReadMessage640 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip650010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class RecordsReadMessage640 extends RecordsReadMessage640Serialized {
   


						private char[] tableId640 = new char[8];


						private char[] effDate640 = new char[10];


								private char[] recReadCnt640 = new char[5];
							

	
	/**
	* Constructor for RecordsReadMessage640
	**/
    public RecordsReadMessage640() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP650010-TABLE ").toCharArray()
             , getStartOffset() + 0
             ,15
             );
								setTableId640(fillSpace(8));
       replaceValue( // serialize and save the value
             (" FOR EFFECTIVE DATE ").toCharArray()
             , getStartOffset() + 23
             ,20
             );
								setEffDate640(fillSpace(10));
       replaceValue( // serialize and save the value
             (", RECORDS READ = ").toCharArray()
             , getStartOffset() + 53
             ,17
             );
								setRecReadCnt640(CFUtil.cobolNumberFormatter("ZZZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 75
             ,1
             );
    }


 

	/**
	 *	Returns the value of tableId640
	 *	@return tableId640
	 */
   public char[] getTableId640() throws CFException{
     if (isTableId640Modified()) { 
        tableId640 = refreshTableId640();
     }
   		return tableId640;
   }

  
	/**
	*  set variable tableId640
	*  Corresponding COBOL Variable is 640-TABLE-ID
	*  @param value
	**/
   public void setTableId640(char[] value) {
      tableId640 = checkTableId640Constraints(value);
      serializeTableId640(tableId640);
   } 

     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId640,tableId640.length);
   	
   }
   
   public void setTableId640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId640,tableId640.length);
   	
   }
   
     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId640 with another Field
	 *	@param value
	 */
   public void setTableId640(Field source) {
       replace(source,0,source.length(),beginTableId640,TABLE_ID_640_LEN);
   	
   }  
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId640,TABLE_ID_640_LEN);
   	
   }
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId640+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of effDate640
	 *	@return effDate640
	 */
   public char[] getEffDate640() throws CFException{
     if (isEffDate640Modified()) { 
        effDate640 = refreshEffDate640();
     }
   		return effDate640;
   }

  
	/**
	*  set variable effDate640
	*  Corresponding COBOL Variable is 640-EFF-DATE
	*  @param value
	**/
   public void setEffDate640(char[] value) {
      effDate640 = checkEffDate640Constraints(value);
      serializeEffDate640(effDate640);
   } 

     /**
	 * 	Update EffDate640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffDate640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEffDate640,effDate640.length);
   	
   }
   
   public void setEffDate640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEffDate640,effDate640.length);
   	
   }
   
     /**
	 * 	Update EffDate640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffDate640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffDate640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EffDate640 with another Field
	 *	@param value
	 */
   public void setEffDate640(Field source) {
       replace(source,0,source.length(),beginEffDate640,EFF_DATE_640_LEN);
   	
   }  
   
     /**
	 * 	Update EffDate640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffDate640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEffDate640,EFF_DATE_640_LEN);
   	
   }
   
     /**
	 * 	Update EffDate640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffDate640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffDate640+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recReadCnt640
	 *	@return recReadCnt640
	 */
   public char[] getRecReadCnt640() throws CFException{
     if (isRecReadCnt640Modified()) { 
        recReadCnt640 = refreshRecReadCnt640();
     }
   		return recReadCnt640;
   }

  
	/**
	*  set variable recReadCnt640
	*  Corresponding COBOL Variable is 640-REC-READ-CNT
	*  @param value
	**/
   public void setRecReadCnt640(char[] value) {
      recReadCnt640 = checkRecReadCnt640Constraints(value);
      serializeRecReadCnt640(recReadCnt640);
   } 

     /**
	 * 	Update RecReadCnt640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecReadCnt640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecReadCnt640,recReadCnt640.length);
   	
   }
   
   public void setRecReadCnt640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecReadCnt640,recReadCnt640.length);
   	
   }
   
     /**
	 * 	Update RecReadCnt640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecReadCnt640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecReadCnt640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecReadCnt640 with another Field
	 *	@param value
	 */
   public void setRecReadCnt640(Field source) {
       replace(source,0,source.length(),beginRecReadCnt640,REC_READ_CNT_640_LEN);
   	
   }  
   
     /**
	 * 	Update RecReadCnt640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecReadCnt640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecReadCnt640,REC_READ_CNT_640_LEN);
   	
   }
   
     /**
	 * 	Update RecReadCnt640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecReadCnt640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecReadCnt640+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRecordsReadMessage640FieldLength() {
			return RECORDS_READ_MESSAGE_640_LENGTH;
		}

}
  
