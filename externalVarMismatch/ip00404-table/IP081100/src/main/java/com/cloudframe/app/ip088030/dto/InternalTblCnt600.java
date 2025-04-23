package com.cloudframe.app.ip088030.dto;

/**
*  The class InternalTblCnt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InternalTblCnt600 extends InternalTblCnt600Serialized {
   


								private char[] ichgFeeCnt600 = Field.fillLowValue(11);
	
	/**
	* Constructor for InternalTblCnt600
	**/
    public InternalTblCnt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP088030-ICHG. FEE RECS LOAD =  ").toCharArray()
             , getStartOffset() + 0
             ,32
             );
    }


 

	/**
	 *	Returns the value of ichgFeeCnt600
	 *	@return ichgFeeCnt600
	 */
   public char[] getIchgFeeCnt600() throws CFException{
     if (isIchgFeeCnt600Modified()) { 
        ichgFeeCnt600 = refreshIchgFeeCnt600();
     }
   		return ichgFeeCnt600;
   }

  
	/**
	*  set variable ichgFeeCnt600
	*  Corresponding COBOL Variable is 600-ICHG-FEE-CNT
	*  @param value
	**/
   public void setIchgFeeCnt600(char[] value) {
      ichgFeeCnt600 = checkIchgFeeCnt600Constraints(value);
      serializeIchgFeeCnt600(ichgFeeCnt600);
   } 

     /**
	 * 	Update IchgFeeCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIchgFeeCnt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIchgFeeCnt600,ichgFeeCnt600.length);
   	
   }
   
   public void setIchgFeeCnt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIchgFeeCnt600,ichgFeeCnt600.length);
   	
   }
   
     /**
	 * 	Update IchgFeeCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIchgFeeCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIchgFeeCnt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IchgFeeCnt600 with another Field
	 *	@param value
	 */
   public void setIchgFeeCnt600(Field source) {
       replace(source,0,source.length(),beginIchgFeeCnt600,ICHG_FEE_CNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update IchgFeeCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIchgFeeCnt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIchgFeeCnt600,ICHG_FEE_CNT_600_LEN);
   	
   }
   
     /**
	 * 	Update IchgFeeCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIchgFeeCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIchgFeeCnt600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInternalTblCnt600FieldLength() {
			return INTERNAL_TBL_CNT_600_LENGTH;
		}

}
  
