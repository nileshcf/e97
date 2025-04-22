package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln5b is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln5b extends DtPage2Ln5bSerialized {
   

						private char[] dt25bCc = new char[1];




						private char[] dt25bRevDbAmt = Field.fillLowValue(18);



						private char[] dt25bRevCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln5b
	**/
    public DtPage2Ln5b() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt25bCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("NON-SAME DAY            ").toCharArray()
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
	 *	Returns the value of dt25bCc
	 *	@return dt25bCc
	 */
   public char[] getDt25bCc() throws CFException{
     if (isDt25bCcModified()) { 
        dt25bCc = refreshDt25bCc();
     }
   		return dt25bCc;
   }

  
	/**
	*  set variable dt25bCc
	*  Corresponding COBOL Variable is DT2-5B-CC
	*  @param value
	**/
   public void setDt25bCc(char[] value) {
      dt25bCc = checkDt25bCcConstraints(value);
      serializeDt25bCc(dt25bCc);
   } 

     /**
	 * 	Update Dt25bCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25bCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25bCc,dt25bCc.length);
   	
   }
   
   public void setDt25bCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bCc,dt25bCc.length);
   	
   }
   
     /**
	 * 	Update Dt25bCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25bCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25bCc with another Field
	 *	@param value
	 */
   public void setDt25bCc(Field source) {
       replace(source,0,source.length(),beginDt25bCc,DT_25B_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25bCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25bCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25bCc,DT_25B_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt25bCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25bCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt25bRevDbAmt
	 *	@return dt25bRevDbAmt
	 */
   public char[] getDt25bRevDbAmt() throws CFException{
     if (isDt25bRevDbAmtModified()) { 
        dt25bRevDbAmt = refreshDt25bRevDbAmt();
     }
   		return dt25bRevDbAmt;
   }

  
	/**
	*  set variable dt25bRevDbAmt
	*  Corresponding COBOL Variable is DT2-5B-REV-DB-AMT
	*  @param value
	**/
   public void setDt25bRevDbAmt(char[] value) {
      dt25bRevDbAmt = checkDt25bRevDbAmtConstraints(value);
      serializeDt25bRevDbAmt(dt25bRevDbAmt);
   } 

     /**
	 * 	Update Dt25bRevDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25bRevDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25bRevDbAmt,dt25bRevDbAmt.length);
   	
   }
   
   public void setDt25bRevDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bRevDbAmt,dt25bRevDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt25bRevDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25bRevDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bRevDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25bRevDbAmt with another Field
	 *	@param value
	 */
   public void setDt25bRevDbAmt(Field source) {
       replace(source,0,source.length(),beginDt25bRevDbAmt,DT_25B_REV_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25bRevDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25bRevDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25bRevDbAmt,DT_25B_REV_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt25bRevDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25bRevDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bRevDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt25bRevCrAmt
	 *	@return dt25bRevCrAmt
	 */
   public char[] getDt25bRevCrAmt() throws CFException{
     if (isDt25bRevCrAmtModified()) { 
        dt25bRevCrAmt = refreshDt25bRevCrAmt();
     }
   		return dt25bRevCrAmt;
   }

  
	/**
	*  set variable dt25bRevCrAmt
	*  Corresponding COBOL Variable is DT2-5B-REV-CR-AMT
	*  @param value
	**/
   public void setDt25bRevCrAmt(char[] value) {
      dt25bRevCrAmt = checkDt25bRevCrAmtConstraints(value);
      serializeDt25bRevCrAmt(dt25bRevCrAmt);
   } 

     /**
	 * 	Update Dt25bRevCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25bRevCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25bRevCrAmt,dt25bRevCrAmt.length);
   	
   }
   
   public void setDt25bRevCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bRevCrAmt,dt25bRevCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt25bRevCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25bRevCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bRevCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25bRevCrAmt with another Field
	 *	@param value
	 */
   public void setDt25bRevCrAmt(Field source) {
       replace(source,0,source.length(),beginDt25bRevCrAmt,DT_25B_REV_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25bRevCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25bRevCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25bRevCrAmt,DT_25B_REV_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt25bRevCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25bRevCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25bRevCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln5bFieldLength() {
			return DT_PAGE_2_LN_5B_LENGTH;
		}

}
  
