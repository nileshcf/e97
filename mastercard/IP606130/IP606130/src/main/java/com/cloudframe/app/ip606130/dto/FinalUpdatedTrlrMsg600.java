package com.cloudframe.app.ip606130.dto;

/**
*  The class FinalUpdatedTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class FinalUpdatedTrlrMsg600 extends FinalUpdatedTrlrMsg600Serialized {
   


								private char[] finalTrlrUpdatedCnt600 = new char[10];
							
	
	/**
	* Constructor for FinalUpdatedTrlrMsg600
	**/
    public FinalUpdatedTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("UPDATED  FINAL   TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setFinalTrlrUpdatedCnt600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of finalTrlrUpdatedCnt600
	 *	@return finalTrlrUpdatedCnt600
	 */
   public char[] getFinalTrlrUpdatedCnt600() throws CFException{
     if (isFinalTrlrUpdatedCnt600Modified()) { 
        finalTrlrUpdatedCnt600 = refreshFinalTrlrUpdatedCnt600();
     }
   		return finalTrlrUpdatedCnt600;
   }

  
	/**
	*  set variable finalTrlrUpdatedCnt600
	*  Corresponding COBOL Variable is 600-FINAL-TRLR-UPDATED-CNT
	*  @param value
	**/
   public void setFinalTrlrUpdatedCnt600(char[] value) {
      finalTrlrUpdatedCnt600 = checkFinalTrlrUpdatedCnt600Constraints(value);
      serializeFinalTrlrUpdatedCnt600(finalTrlrUpdatedCnt600);
   } 

     /**
	 * 	Update FinalTrlrUpdatedCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFinalTrlrUpdatedCnt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFinalTrlrUpdatedCnt600,finalTrlrUpdatedCnt600.length);
   	
   }
   
   public void setFinalTrlrUpdatedCnt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFinalTrlrUpdatedCnt600,finalTrlrUpdatedCnt600.length);
   	
   }
   
     /**
	 * 	Update FinalTrlrUpdatedCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFinalTrlrUpdatedCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinalTrlrUpdatedCnt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FinalTrlrUpdatedCnt600 with another Field
	 *	@param value
	 */
   public void setFinalTrlrUpdatedCnt600(Field source) {
       replace(source,0,source.length(),beginFinalTrlrUpdatedCnt600,FINAL_TRLR_UPDATED_CNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update FinalTrlrUpdatedCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFinalTrlrUpdatedCnt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFinalTrlrUpdatedCnt600,FINAL_TRLR_UPDATED_CNT_600_LEN);
   	
   }
   
     /**
	 * 	Update FinalTrlrUpdatedCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFinalTrlrUpdatedCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinalTrlrUpdatedCnt600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFinalUpdatedTrlrMsg600FieldLength() {
			return FINAL_UPDATED_TRLR_MSG_600_LENGTH;
		}

}
  
