package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln2 extends DtPage2Ln2Serialized {
   

						private char[] dt22Cc = new char[1];



								private char[] dt22R09DbNbr = Field.fillLowValue(15);


						private char[] dt22R09DbAmt = Field.fillLowValue(18);


								private char[] dt22R09CrNbr = Field.fillLowValue(15);


						private char[] dt22R09CrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln2
	**/
    public DtPage2Ln2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt22Cc(fillSpace(1));
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
             fillSpace(2)
             , getStartOffset() + 43
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 63
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 82
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(31)
             , getStartOffset() + 102
             ,31
             );
    }


 

	/**
	 *	Returns the value of dt22Cc
	 *	@return dt22Cc
	 */
   public char[] getDt22Cc() throws CFException{
     if (isDt22CcModified()) { 
        dt22Cc = refreshDt22Cc();
     }
   		return dt22Cc;
   }

  
	/**
	*  set variable dt22Cc
	*  Corresponding COBOL Variable is DT2-2-CC
	*  @param value
	**/
   public void setDt22Cc(char[] value) {
      dt22Cc = checkDt22CcConstraints(value);
      serializeDt22Cc(dt22Cc);
   } 

     /**
	 * 	Update Dt22Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt22Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt22Cc,dt22Cc.length);
   	
   }
   
   public void setDt22Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt22Cc,dt22Cc.length);
   	
   }
   
     /**
	 * 	Update Dt22Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt22Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt22Cc with another Field
	 *	@param value
	 */
   public void setDt22Cc(Field source) {
       replace(source,0,source.length(),beginDt22Cc,DT_22_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt22Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt22Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt22Cc,DT_22_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt22Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt22Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt22R09DbNbr
	 *	@return dt22R09DbNbr
	 */
   public char[] getDt22R09DbNbr() throws CFException{
     if (isDt22R09DbNbrModified()) { 
        dt22R09DbNbr = refreshDt22R09DbNbr();
     }
   		return dt22R09DbNbr;
   }

  
	/**
	*  set variable dt22R09DbNbr
	*  Corresponding COBOL Variable is DT2-2-R09-DB-NBR
	*  @param value
	**/
   public void setDt22R09DbNbr(char[] value) {
      dt22R09DbNbr = checkDt22R09DbNbrConstraints(value);
      serializeDt22R09DbNbr(dt22R09DbNbr);
   } 

     /**
	 * 	Update Dt22R09DbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt22R09DbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt22R09DbNbr,dt22R09DbNbr.length);
   	
   }
   
   public void setDt22R09DbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09DbNbr,dt22R09DbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt22R09DbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09DbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09DbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt22R09DbNbr with another Field
	 *	@param value
	 */
   public void setDt22R09DbNbr(Field source) {
       replace(source,0,source.length(),beginDt22R09DbNbr,DT_22_R_09_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt22R09DbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt22R09DbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt22R09DbNbr,DT_22_R_09_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt22R09DbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09DbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09DbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt22R09DbAmt
	 *	@return dt22R09DbAmt
	 */
   public char[] getDt22R09DbAmt() throws CFException{
     if (isDt22R09DbAmtModified()) { 
        dt22R09DbAmt = refreshDt22R09DbAmt();
     }
   		return dt22R09DbAmt;
   }

  
	/**
	*  set variable dt22R09DbAmt
	*  Corresponding COBOL Variable is DT2-2-R09-DB-AMT
	*  @param value
	**/
   public void setDt22R09DbAmt(char[] value) {
      dt22R09DbAmt = checkDt22R09DbAmtConstraints(value);
      serializeDt22R09DbAmt(dt22R09DbAmt);
   } 

     /**
	 * 	Update Dt22R09DbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt22R09DbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt22R09DbAmt,dt22R09DbAmt.length);
   	
   }
   
   public void setDt22R09DbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09DbAmt,dt22R09DbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt22R09DbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09DbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09DbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt22R09DbAmt with another Field
	 *	@param value
	 */
   public void setDt22R09DbAmt(Field source) {
       replace(source,0,source.length(),beginDt22R09DbAmt,DT_22_R_09_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt22R09DbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt22R09DbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt22R09DbAmt,DT_22_R_09_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt22R09DbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09DbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09DbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt22R09CrNbr
	 *	@return dt22R09CrNbr
	 */
   public char[] getDt22R09CrNbr() throws CFException{
     if (isDt22R09CrNbrModified()) { 
        dt22R09CrNbr = refreshDt22R09CrNbr();
     }
   		return dt22R09CrNbr;
   }

  
	/**
	*  set variable dt22R09CrNbr
	*  Corresponding COBOL Variable is DT2-2-R09-CR-NBR
	*  @param value
	**/
   public void setDt22R09CrNbr(char[] value) {
      dt22R09CrNbr = checkDt22R09CrNbrConstraints(value);
      serializeDt22R09CrNbr(dt22R09CrNbr);
   } 

     /**
	 * 	Update Dt22R09CrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt22R09CrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt22R09CrNbr,dt22R09CrNbr.length);
   	
   }
   
   public void setDt22R09CrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09CrNbr,dt22R09CrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt22R09CrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09CrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09CrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt22R09CrNbr with another Field
	 *	@param value
	 */
   public void setDt22R09CrNbr(Field source) {
       replace(source,0,source.length(),beginDt22R09CrNbr,DT_22_R_09_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt22R09CrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt22R09CrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt22R09CrNbr,DT_22_R_09_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt22R09CrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09CrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09CrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt22R09CrAmt
	 *	@return dt22R09CrAmt
	 */
   public char[] getDt22R09CrAmt() throws CFException{
     if (isDt22R09CrAmtModified()) { 
        dt22R09CrAmt = refreshDt22R09CrAmt();
     }
   		return dt22R09CrAmt;
   }

  
	/**
	*  set variable dt22R09CrAmt
	*  Corresponding COBOL Variable is DT2-2-R09-CR-AMT
	*  @param value
	**/
   public void setDt22R09CrAmt(char[] value) {
      dt22R09CrAmt = checkDt22R09CrAmtConstraints(value);
      serializeDt22R09CrAmt(dt22R09CrAmt);
   } 

     /**
	 * 	Update Dt22R09CrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt22R09CrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt22R09CrAmt,dt22R09CrAmt.length);
   	
   }
   
   public void setDt22R09CrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09CrAmt,dt22R09CrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt22R09CrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09CrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09CrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt22R09CrAmt with another Field
	 *	@param value
	 */
   public void setDt22R09CrAmt(Field source) {
       replace(source,0,source.length(),beginDt22R09CrAmt,DT_22_R_09_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt22R09CrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt22R09CrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt22R09CrAmt,DT_22_R_09_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt22R09CrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt22R09CrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt22R09CrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln2FieldLength() {
			return DT_PAGE_2_LN_2_LENGTH;
		}

}
  
