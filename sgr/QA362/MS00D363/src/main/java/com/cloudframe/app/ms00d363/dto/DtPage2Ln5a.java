package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln5a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln5a extends DtPage2Ln5aSerialized {
   

						private char[] dt25aCc = new char[1];




						private char[] dt25aR09DbAmt = Field.fillLowValue(18);



						private char[] dt25aR09CrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln5a
	**/
    public DtPage2Ln5a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt25aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("SAME DAY (CODE 09)      ").toCharArray()
             , getStartOffset() + 4
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 28
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 66
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 70
             ,17
             );
       replaceValue( // serialize and save the value
             fillSpace(31)
             , getStartOffset() + 105
             ,31
             );
    }


 

	/**
	 *	Returns the value of dt25aCc
	 *	@return dt25aCc
	 */
   public char[] getDt25aCc() throws CFException{
     if (isDt25aCcModified()) { 
        dt25aCc = refreshDt25aCc();
     }
   		return dt25aCc;
   }

  
	/**
	*  set variable dt25aCc
	*  Corresponding COBOL Variable is DT2-5A-CC
	*  @param value
	**/
   public void setDt25aCc(char[] value) {
      dt25aCc = checkDt25aCcConstraints(value);
      serializeDt25aCc(dt25aCc);
   } 

     /**
	 * 	Update Dt25aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25aCc,dt25aCc.length);
   	
   }
   
   public void setDt25aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aCc,dt25aCc.length);
   	
   }
   
     /**
	 * 	Update Dt25aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25aCc with another Field
	 *	@param value
	 */
   public void setDt25aCc(Field source) {
       replace(source,0,source.length(),beginDt25aCc,DT_25A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25aCc,DT_25A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt25aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt25aR09DbAmt
	 *	@return dt25aR09DbAmt
	 */
   public char[] getDt25aR09DbAmt() throws CFException{
     if (isDt25aR09DbAmtModified()) { 
        dt25aR09DbAmt = refreshDt25aR09DbAmt();
     }
   		return dt25aR09DbAmt;
   }

  
	/**
	*  set variable dt25aR09DbAmt
	*  Corresponding COBOL Variable is DT2-5A-R09-DB-AMT
	*  @param value
	**/
   public void setDt25aR09DbAmt(char[] value) {
      dt25aR09DbAmt = checkDt25aR09DbAmtConstraints(value);
      serializeDt25aR09DbAmt(dt25aR09DbAmt);
   } 

     /**
	 * 	Update Dt25aR09DbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25aR09DbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25aR09DbAmt,dt25aR09DbAmt.length);
   	
   }
   
   public void setDt25aR09DbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aR09DbAmt,dt25aR09DbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt25aR09DbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25aR09DbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aR09DbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25aR09DbAmt with another Field
	 *	@param value
	 */
   public void setDt25aR09DbAmt(Field source) {
       replace(source,0,source.length(),beginDt25aR09DbAmt,DT_25A_R_09_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25aR09DbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25aR09DbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25aR09DbAmt,DT_25A_R_09_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt25aR09DbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25aR09DbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aR09DbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt25aR09CrAmt
	 *	@return dt25aR09CrAmt
	 */
   public char[] getDt25aR09CrAmt() throws CFException{
     if (isDt25aR09CrAmtModified()) { 
        dt25aR09CrAmt = refreshDt25aR09CrAmt();
     }
   		return dt25aR09CrAmt;
   }

  
	/**
	*  set variable dt25aR09CrAmt
	*  Corresponding COBOL Variable is DT2-5A-R09-CR-AMT
	*  @param value
	**/
   public void setDt25aR09CrAmt(char[] value) {
      dt25aR09CrAmt = checkDt25aR09CrAmtConstraints(value);
      serializeDt25aR09CrAmt(dt25aR09CrAmt);
   } 

     /**
	 * 	Update Dt25aR09CrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25aR09CrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25aR09CrAmt,dt25aR09CrAmt.length);
   	
   }
   
   public void setDt25aR09CrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aR09CrAmt,dt25aR09CrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt25aR09CrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25aR09CrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aR09CrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25aR09CrAmt with another Field
	 *	@param value
	 */
   public void setDt25aR09CrAmt(Field source) {
       replace(source,0,source.length(),beginDt25aR09CrAmt,DT_25A_R_09_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25aR09CrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25aR09CrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25aR09CrAmt,DT_25A_R_09_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt25aR09CrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25aR09CrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25aR09CrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln5aFieldLength() {
			return DT_PAGE_2_LN_5A_LENGTH;
		}

}
  
