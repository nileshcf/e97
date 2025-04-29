package com.cloudframe.app.ip299010.dto;

/**
*  The class RecordsLoadedMessage630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip299010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class RecordsLoadedMessage630 extends RecordsLoadedMessage630Serialized {
   




								private char[] recLoadedCnt630 = new char[4];
							

	
	/**
	* Constructor for RecordsLoadedMessage630
	**/
    public RecordsLoadedMessage630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP299010").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
       replaceValue( // serialize and save the value
             ("IP0005T1 RECORDS LOADED =  ").toCharArray()
             , getStartOffset() + 9
             ,27
             );
								setRecLoadedCnt630(CFUtil.cobolNumberFormatter("ZZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 40
             ,29
             );
    }


 

	/**
	 *	Returns the value of recLoadedCnt630
	 *	@return recLoadedCnt630
	 */
   public char[] getRecLoadedCnt630() throws CFException{
     if (isRecLoadedCnt630Modified()) { 
        recLoadedCnt630 = refreshRecLoadedCnt630();
     }
   		return recLoadedCnt630;
   }

  
	/**
	*  set variable recLoadedCnt630
	*  Corresponding COBOL Variable is 630-REC-LOADED-CNT
	*  @param value
	**/
   public void setRecLoadedCnt630(char[] value) {
      recLoadedCnt630 = checkRecLoadedCnt630Constraints(value);
      serializeRecLoadedCnt630(recLoadedCnt630);
   } 

     /**
	 * 	Update RecLoadedCnt630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecLoadedCnt630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecLoadedCnt630,recLoadedCnt630.length);
   	
   }
   
   public void setRecLoadedCnt630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecLoadedCnt630,recLoadedCnt630.length);
   	
   }
   
     /**
	 * 	Update RecLoadedCnt630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecLoadedCnt630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecLoadedCnt630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecLoadedCnt630 with another Field
	 *	@param value
	 */
   public void setRecLoadedCnt630(Field source) {
       replace(source,0,source.length(),beginRecLoadedCnt630,REC_LOADED_CNT_630_LEN);
   	
   }  
   
     /**
	 * 	Update RecLoadedCnt630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecLoadedCnt630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecLoadedCnt630,REC_LOADED_CNT_630_LEN);
   	
   }
   
     /**
	 * 	Update RecLoadedCnt630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecLoadedCnt630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecLoadedCnt630+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRecordsLoadedMessage630FieldLength() {
			return RECORDS_LOADED_MESSAGE_630_LENGTH;
		}

}
  
