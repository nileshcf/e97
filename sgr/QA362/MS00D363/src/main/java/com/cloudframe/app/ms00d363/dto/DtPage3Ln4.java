package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln4 extends DtPage3Ln4Serialized {
   

						private char[] dt34Cc = new char[1];




						private char[] dt34AcqtotDbAmt = Field.fillLowValue(24);


						private char[] dt34AcqtotCrAmt = Field.fillLowValue(24);


						private char[] dt34AcqtotNetAmt = Field.fillLowValue(24);


						private char[] dt34AcqtotInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln4
	**/
    public DtPage3Ln4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt34Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("TOTAL ACQUIRER  ").toCharArray()
             , getStartOffset() + 2
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 18
             ,14
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 56
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 87
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 115
             ,2
             );
								setDt34AcqtotInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt34Cc
	 *	@return dt34Cc
	 */
   public char[] getDt34Cc() throws CFException{
     if (isDt34CcModified()) { 
        dt34Cc = refreshDt34Cc();
     }
   		return dt34Cc;
   }

  
	/**
	*  set variable dt34Cc
	*  Corresponding COBOL Variable is DT3-4-CC
	*  @param value
	**/
   public void setDt34Cc(char[] value) {
      dt34Cc = checkDt34CcConstraints(value);
      serializeDt34Cc(dt34Cc);
   } 

     /**
	 * 	Update Dt34Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt34Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt34Cc,dt34Cc.length);
   	
   }
   
   public void setDt34Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt34Cc,dt34Cc.length);
   	
   }
   
     /**
	 * 	Update Dt34Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt34Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt34Cc with another Field
	 *	@param value
	 */
   public void setDt34Cc(Field source) {
       replace(source,0,source.length(),beginDt34Cc,DT_34_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt34Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt34Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt34Cc,DT_34_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt34Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt34Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt34AcqtotDbAmt
	 *	@return dt34AcqtotDbAmt
	 */
   public char[] getDt34AcqtotDbAmt() throws CFException{
     if (isDt34AcqtotDbAmtModified()) { 
        dt34AcqtotDbAmt = refreshDt34AcqtotDbAmt();
     }
   		return dt34AcqtotDbAmt;
   }

  
	/**
	*  set variable dt34AcqtotDbAmt
	*  Corresponding COBOL Variable is DT3-4-ACQTOT-DB-AMT
	*  @param value
	**/
   public void setDt34AcqtotDbAmt(char[] value) {
      dt34AcqtotDbAmt = checkDt34AcqtotDbAmtConstraints(value);
      serializeDt34AcqtotDbAmt(dt34AcqtotDbAmt);
   } 

     /**
	 * 	Update Dt34AcqtotDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt34AcqtotDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt34AcqtotDbAmt,dt34AcqtotDbAmt.length);
   	
   }
   
   public void setDt34AcqtotDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotDbAmt,dt34AcqtotDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt34AcqtotDbAmt with another Field
	 *	@param value
	 */
   public void setDt34AcqtotDbAmt(Field source) {
       replace(source,0,source.length(),beginDt34AcqtotDbAmt,DT_34_ACQTOT_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt34AcqtotDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt34AcqtotDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt34AcqtotDbAmt,DT_34_ACQTOT_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt34AcqtotCrAmt
	 *	@return dt34AcqtotCrAmt
	 */
   public char[] getDt34AcqtotCrAmt() throws CFException{
     if (isDt34AcqtotCrAmtModified()) { 
        dt34AcqtotCrAmt = refreshDt34AcqtotCrAmt();
     }
   		return dt34AcqtotCrAmt;
   }

  
	/**
	*  set variable dt34AcqtotCrAmt
	*  Corresponding COBOL Variable is DT3-4-ACQTOT-CR-AMT
	*  @param value
	**/
   public void setDt34AcqtotCrAmt(char[] value) {
      dt34AcqtotCrAmt = checkDt34AcqtotCrAmtConstraints(value);
      serializeDt34AcqtotCrAmt(dt34AcqtotCrAmt);
   } 

     /**
	 * 	Update Dt34AcqtotCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt34AcqtotCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt34AcqtotCrAmt,dt34AcqtotCrAmt.length);
   	
   }
   
   public void setDt34AcqtotCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotCrAmt,dt34AcqtotCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt34AcqtotCrAmt with another Field
	 *	@param value
	 */
   public void setDt34AcqtotCrAmt(Field source) {
       replace(source,0,source.length(),beginDt34AcqtotCrAmt,DT_34_ACQTOT_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt34AcqtotCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt34AcqtotCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt34AcqtotCrAmt,DT_34_ACQTOT_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt34AcqtotNetAmt
	 *	@return dt34AcqtotNetAmt
	 */
   public char[] getDt34AcqtotNetAmt() throws CFException{
     if (isDt34AcqtotNetAmtModified()) { 
        dt34AcqtotNetAmt = refreshDt34AcqtotNetAmt();
     }
   		return dt34AcqtotNetAmt;
   }

  
	/**
	*  set variable dt34AcqtotNetAmt
	*  Corresponding COBOL Variable is DT3-4-ACQTOT-NET-AMT
	*  @param value
	**/
   public void setDt34AcqtotNetAmt(char[] value) {
      dt34AcqtotNetAmt = checkDt34AcqtotNetAmtConstraints(value);
      serializeDt34AcqtotNetAmt(dt34AcqtotNetAmt);
   } 

     /**
	 * 	Update Dt34AcqtotNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt34AcqtotNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt34AcqtotNetAmt,dt34AcqtotNetAmt.length);
   	
   }
   
   public void setDt34AcqtotNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotNetAmt,dt34AcqtotNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt34AcqtotNetAmt with another Field
	 *	@param value
	 */
   public void setDt34AcqtotNetAmt(Field source) {
       replace(source,0,source.length(),beginDt34AcqtotNetAmt,DT_34_ACQTOT_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt34AcqtotNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt34AcqtotNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt34AcqtotNetAmt,DT_34_ACQTOT_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt34AcqtotInd
	 *	@return dt34AcqtotInd
	 */
   public char[] getDt34AcqtotInd() throws CFException{
     if (isDt34AcqtotIndModified()) { 
        dt34AcqtotInd = refreshDt34AcqtotInd();
     }
   		return dt34AcqtotInd;
   }

  
	/**
	*  set variable dt34AcqtotInd
	*  Corresponding COBOL Variable is DT3-4-ACQTOT-IND
	*  @param value
	**/
   public void setDt34AcqtotInd(char[] value) {
      dt34AcqtotInd = checkDt34AcqtotIndConstraints(value);
      serializeDt34AcqtotInd(dt34AcqtotInd);
   } 

     /**
	 * 	Update Dt34AcqtotInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt34AcqtotInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt34AcqtotInd,dt34AcqtotInd.length);
   	
   }
   
   public void setDt34AcqtotInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotInd,dt34AcqtotInd.length);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt34AcqtotInd with another Field
	 *	@param value
	 */
   public void setDt34AcqtotInd(Field source) {
       replace(source,0,source.length(),beginDt34AcqtotInd,DT_34_ACQTOT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt34AcqtotInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt34AcqtotInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt34AcqtotInd,DT_34_ACQTOT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt34AcqtotInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt34AcqtotInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt34AcqtotInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln4FieldLength() {
			return DT_PAGE_3_LN_4_LENGTH;
		}

}
  
