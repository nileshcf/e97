package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln7 extends DtPage2Ln7Serialized {
   

						private char[] dt27Cc = new char[1];




						private char[] dt27IntDbAmt = Field.fillLowValue(24);



						private char[] dt27IntCrAmt = Field.fillLowValue(24);

	
	/**
	* Constructor for DtPage2Ln7
	**/
    public DtPage2Ln7() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt27Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("SETTLEMENT              ").toCharArray()
             , getStartOffset() + 4
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 28
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 67
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 71
             ,11
             );
       replaceValue( // serialize and save the value
             fillSpace(27)
             , getStartOffset() + 106
             ,27
             );
    }


 

	/**
	 *	Returns the value of dt27Cc
	 *	@return dt27Cc
	 */
   public char[] getDt27Cc() throws CFException{
     if (isDt27CcModified()) { 
        dt27Cc = refreshDt27Cc();
     }
   		return dt27Cc;
   }

  
	/**
	*  set variable dt27Cc
	*  Corresponding COBOL Variable is DT2-7-CC
	*  @param value
	**/
   public void setDt27Cc(char[] value) {
      dt27Cc = checkDt27CcConstraints(value);
      serializeDt27Cc(dt27Cc);
   } 

     /**
	 * 	Update Dt27Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt27Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt27Cc,dt27Cc.length);
   	
   }
   
   public void setDt27Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt27Cc,dt27Cc.length);
   	
   }
   
     /**
	 * 	Update Dt27Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt27Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt27Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt27Cc with another Field
	 *	@param value
	 */
   public void setDt27Cc(Field source) {
       replace(source,0,source.length(),beginDt27Cc,DT_27_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt27Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt27Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt27Cc,DT_27_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt27Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt27Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt27Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt27IntDbAmt
	 *	@return dt27IntDbAmt
	 */
   public char[] getDt27IntDbAmt() throws CFException{
     if (isDt27IntDbAmtModified()) { 
        dt27IntDbAmt = refreshDt27IntDbAmt();
     }
   		return dt27IntDbAmt;
   }

  
	/**
	*  set variable dt27IntDbAmt
	*  Corresponding COBOL Variable is DT2-7-INT-DB-AMT
	*  @param value
	**/
   public void setDt27IntDbAmt(char[] value) {
      dt27IntDbAmt = checkDt27IntDbAmtConstraints(value);
      serializeDt27IntDbAmt(dt27IntDbAmt);
   } 

     /**
	 * 	Update Dt27IntDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt27IntDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt27IntDbAmt,dt27IntDbAmt.length);
   	
   }
   
   public void setDt27IntDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt27IntDbAmt,dt27IntDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt27IntDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt27IntDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt27IntDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt27IntDbAmt with another Field
	 *	@param value
	 */
   public void setDt27IntDbAmt(Field source) {
       replace(source,0,source.length(),beginDt27IntDbAmt,DT_27_INT_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt27IntDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt27IntDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt27IntDbAmt,DT_27_INT_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt27IntDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt27IntDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt27IntDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt27IntCrAmt
	 *	@return dt27IntCrAmt
	 */
   public char[] getDt27IntCrAmt() throws CFException{
     if (isDt27IntCrAmtModified()) { 
        dt27IntCrAmt = refreshDt27IntCrAmt();
     }
   		return dt27IntCrAmt;
   }

  
	/**
	*  set variable dt27IntCrAmt
	*  Corresponding COBOL Variable is DT2-7-INT-CR-AMT
	*  @param value
	**/
   public void setDt27IntCrAmt(char[] value) {
      dt27IntCrAmt = checkDt27IntCrAmtConstraints(value);
      serializeDt27IntCrAmt(dt27IntCrAmt);
   } 

     /**
	 * 	Update Dt27IntCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt27IntCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt27IntCrAmt,dt27IntCrAmt.length);
   	
   }
   
   public void setDt27IntCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt27IntCrAmt,dt27IntCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt27IntCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt27IntCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt27IntCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt27IntCrAmt with another Field
	 *	@param value
	 */
   public void setDt27IntCrAmt(Field source) {
       replace(source,0,source.length(),beginDt27IntCrAmt,DT_27_INT_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt27IntCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt27IntCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt27IntCrAmt,DT_27_INT_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt27IntCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt27IntCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt27IntCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln7FieldLength() {
			return DT_PAGE_2_LN_7_LENGTH;
		}

}
  
