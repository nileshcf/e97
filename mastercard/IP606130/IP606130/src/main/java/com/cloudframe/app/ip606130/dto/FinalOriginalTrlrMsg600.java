package com.cloudframe.app.ip606130.dto;

/**
*  The class FinalOriginalTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class FinalOriginalTrlrMsg600 extends FinalOriginalTrlrMsg600Serialized {
   


								private char[] finalTrlrOriginalCnt600 = new char[10];
							
	
	/**
	* Constructor for FinalOriginalTrlrMsg600
	**/
    public FinalOriginalTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ORIGINAL FINAL   TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setFinalTrlrOriginalCnt600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of finalTrlrOriginalCnt600
	 *	@return finalTrlrOriginalCnt600
	 */
   public char[] getFinalTrlrOriginalCnt600() throws CFException{
     if (isFinalTrlrOriginalCnt600Modified()) { 
        finalTrlrOriginalCnt600 = refreshFinalTrlrOriginalCnt600();
     }
   		return finalTrlrOriginalCnt600;
   }

  
	/**
	*  set variable finalTrlrOriginalCnt600
	*  Corresponding COBOL Variable is 600-FINAL-TRLR-ORIGINAL-CNT
	*  @param value
	**/
   public void setFinalTrlrOriginalCnt600(char[] value) {
      finalTrlrOriginalCnt600 = checkFinalTrlrOriginalCnt600Constraints(value);
      serializeFinalTrlrOriginalCnt600(finalTrlrOriginalCnt600);
   } 

     /**
	 * 	Update FinalTrlrOriginalCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFinalTrlrOriginalCnt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFinalTrlrOriginalCnt600,finalTrlrOriginalCnt600.length);
   	
   }
   
   public void setFinalTrlrOriginalCnt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFinalTrlrOriginalCnt600,finalTrlrOriginalCnt600.length);
   	
   }
   
     /**
	 * 	Update FinalTrlrOriginalCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFinalTrlrOriginalCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinalTrlrOriginalCnt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FinalTrlrOriginalCnt600 with another Field
	 *	@param value
	 */
   public void setFinalTrlrOriginalCnt600(Field source) {
       replace(source,0,source.length(),beginFinalTrlrOriginalCnt600,FINAL_TRLR_ORIGINAL_CNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update FinalTrlrOriginalCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFinalTrlrOriginalCnt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFinalTrlrOriginalCnt600,FINAL_TRLR_ORIGINAL_CNT_600_LEN);
   	
   }
   
     /**
	 * 	Update FinalTrlrOriginalCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFinalTrlrOriginalCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFinalTrlrOriginalCnt600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFinalOriginalTrlrMsg600FieldLength() {
			return FINAL_ORIGINAL_TRLR_MSG_600_LENGTH;
		}

}
  
