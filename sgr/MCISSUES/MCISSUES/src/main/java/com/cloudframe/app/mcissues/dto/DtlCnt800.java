package com.cloudframe.app.mcissues.dto;

/**
*  The class DtlCnt800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtlCnt800 extends DtlCnt800Serialized {
   

						private char[] dtlCntA800 = Field.fillLowValue(10);
				private DtlCntZ800 dtlCntZ800 = new DtlCntZ800();
	
	/**
	* Constructor for DtlCnt800
	**/
    public DtlCnt800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dtlCntZ800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dtlCntA800
	 *	@return dtlCntA800
	 */
   public char[] getDtlCntA800() throws CFException{
     if (isDtlCntA800Modified()) { 
        dtlCntA800 = refreshDtlCntA800();
     }
   		return dtlCntA800;
   }

  
	/**
	*  set variable dtlCntA800
	*  Corresponding COBOL Variable is 800-DTL-CNT-A
	*  @param value
	**/
   public void setDtlCntA800(char[] value) {
      dtlCntA800 = checkDtlCntA800Constraints(value);
      serializeDtlCntA800(dtlCntA800);
   } 

     /**
	 * 	Update DtlCntA800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDtlCntA800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDtlCntA800,dtlCntA800.length);
   	
   }
   
   public void setDtlCntA800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDtlCntA800,dtlCntA800.length);
   	
   }
   
     /**
	 * 	Update DtlCntA800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntA800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDtlCntA800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DtlCntA800 with another Field
	 *	@param value
	 */
   public void setDtlCntA800(Field source) {
       replace(source,0,source.length(),beginDtlCntA800,DTL_CNT_A_800_LEN);
   	
   }  
   
     /**
	 * 	Update DtlCntA800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDtlCntA800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDtlCntA800,DTL_CNT_A_800_LEN);
   	
   }
   
     /**
	 * 	Update DtlCntA800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntA800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDtlCntA800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dtlCntZ800
	 *	@return dtlCntZ800
	 */   
	 public DtlCntZ800 getDtlCntZ800() {
   	return dtlCntZ800;
   }
   /**
	* 	Update DtlCntZ800 with the passed value
	*   Corresponding COBOL Variable is 800-DTL-CNT-Z
	*	@param value
	*/
   public void setDtlCntZ800(char[] value) {
      dtlCntZ800.setString(value); 
   }   
    
     /**
	 * 	Update DtlCntZ800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDtlCntZ800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dtlCntZ800.begin,dtlCntZ800.length());
   }
   
     /**
	 * 	Update DtlCntZ800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntZ800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dtlCntZ800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DtlCntZ800 with another Field
	 *	@param value
	 */
   public void setDtlCntZ800(Field source) {
   	replace(source,0,source.length(),dtlCntZ800.begin,dtlCntZ800.length());
   }  
   
     /**
	 * 	Update DtlCntZ800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDtlCntZ800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dtlCntZ800.begin,dtlCntZ800.length());
   }
   
     /**
	 * 	Update DtlCntZ800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntZ800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dtlCntZ800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDtlCnt800FieldLength() {
			return DTL_CNT_800_LENGTH;
		}

}
  
