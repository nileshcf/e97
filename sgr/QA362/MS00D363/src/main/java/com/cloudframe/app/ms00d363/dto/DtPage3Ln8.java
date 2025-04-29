package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln8 extends DtPage3Ln8Serialized {
   

						private char[] dt38Cc = new char[1];




						private char[] dt38IsstotDbAmt = Field.fillLowValue(24);


						private char[] dt38IsstotCrAmt = Field.fillLowValue(24);


						private char[] dt38IsstotNetAmt = Field.fillLowValue(24);


						private char[] dt38IsstotInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln8
	**/
    public DtPage3Ln8() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt38Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("TOTAL ISSUER    ").toCharArray()
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
								setDt38IsstotInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt38Cc
	 *	@return dt38Cc
	 */
   public char[] getDt38Cc() throws CFException{
     if (isDt38CcModified()) { 
        dt38Cc = refreshDt38Cc();
     }
   		return dt38Cc;
   }

  
	/**
	*  set variable dt38Cc
	*  Corresponding COBOL Variable is DT3-8-CC
	*  @param value
	**/
   public void setDt38Cc(char[] value) {
      dt38Cc = checkDt38CcConstraints(value);
      serializeDt38Cc(dt38Cc);
   } 

     /**
	 * 	Update Dt38Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt38Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt38Cc,dt38Cc.length);
   	
   }
   
   public void setDt38Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt38Cc,dt38Cc.length);
   	
   }
   
     /**
	 * 	Update Dt38Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt38Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt38Cc with another Field
	 *	@param value
	 */
   public void setDt38Cc(Field source) {
       replace(source,0,source.length(),beginDt38Cc,DT_38_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt38Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt38Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt38Cc,DT_38_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt38Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt38Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt38IsstotDbAmt
	 *	@return dt38IsstotDbAmt
	 */
   public char[] getDt38IsstotDbAmt() throws CFException{
     if (isDt38IsstotDbAmtModified()) { 
        dt38IsstotDbAmt = refreshDt38IsstotDbAmt();
     }
   		return dt38IsstotDbAmt;
   }

  
	/**
	*  set variable dt38IsstotDbAmt
	*  Corresponding COBOL Variable is DT3-8-ISSTOT-DB-AMT
	*  @param value
	**/
   public void setDt38IsstotDbAmt(char[] value) {
      dt38IsstotDbAmt = checkDt38IsstotDbAmtConstraints(value);
      serializeDt38IsstotDbAmt(dt38IsstotDbAmt);
   } 

     /**
	 * 	Update Dt38IsstotDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt38IsstotDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt38IsstotDbAmt,dt38IsstotDbAmt.length);
   	
   }
   
   public void setDt38IsstotDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotDbAmt,dt38IsstotDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt38IsstotDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt38IsstotDbAmt with another Field
	 *	@param value
	 */
   public void setDt38IsstotDbAmt(Field source) {
       replace(source,0,source.length(),beginDt38IsstotDbAmt,DT_38_ISSTOT_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt38IsstotDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt38IsstotDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt38IsstotDbAmt,DT_38_ISSTOT_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt38IsstotDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt38IsstotCrAmt
	 *	@return dt38IsstotCrAmt
	 */
   public char[] getDt38IsstotCrAmt() throws CFException{
     if (isDt38IsstotCrAmtModified()) { 
        dt38IsstotCrAmt = refreshDt38IsstotCrAmt();
     }
   		return dt38IsstotCrAmt;
   }

  
	/**
	*  set variable dt38IsstotCrAmt
	*  Corresponding COBOL Variable is DT3-8-ISSTOT-CR-AMT
	*  @param value
	**/
   public void setDt38IsstotCrAmt(char[] value) {
      dt38IsstotCrAmt = checkDt38IsstotCrAmtConstraints(value);
      serializeDt38IsstotCrAmt(dt38IsstotCrAmt);
   } 

     /**
	 * 	Update Dt38IsstotCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt38IsstotCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt38IsstotCrAmt,dt38IsstotCrAmt.length);
   	
   }
   
   public void setDt38IsstotCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotCrAmt,dt38IsstotCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt38IsstotCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt38IsstotCrAmt with another Field
	 *	@param value
	 */
   public void setDt38IsstotCrAmt(Field source) {
       replace(source,0,source.length(),beginDt38IsstotCrAmt,DT_38_ISSTOT_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt38IsstotCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt38IsstotCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt38IsstotCrAmt,DT_38_ISSTOT_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt38IsstotCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt38IsstotNetAmt
	 *	@return dt38IsstotNetAmt
	 */
   public char[] getDt38IsstotNetAmt() throws CFException{
     if (isDt38IsstotNetAmtModified()) { 
        dt38IsstotNetAmt = refreshDt38IsstotNetAmt();
     }
   		return dt38IsstotNetAmt;
   }

  
	/**
	*  set variable dt38IsstotNetAmt
	*  Corresponding COBOL Variable is DT3-8-ISSTOT-NET-AMT
	*  @param value
	**/
   public void setDt38IsstotNetAmt(char[] value) {
      dt38IsstotNetAmt = checkDt38IsstotNetAmtConstraints(value);
      serializeDt38IsstotNetAmt(dt38IsstotNetAmt);
   } 

     /**
	 * 	Update Dt38IsstotNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt38IsstotNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt38IsstotNetAmt,dt38IsstotNetAmt.length);
   	
   }
   
   public void setDt38IsstotNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotNetAmt,dt38IsstotNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt38IsstotNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt38IsstotNetAmt with another Field
	 *	@param value
	 */
   public void setDt38IsstotNetAmt(Field source) {
       replace(source,0,source.length(),beginDt38IsstotNetAmt,DT_38_ISSTOT_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt38IsstotNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt38IsstotNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt38IsstotNetAmt,DT_38_ISSTOT_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt38IsstotNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt38IsstotInd
	 *	@return dt38IsstotInd
	 */
   public char[] getDt38IsstotInd() throws CFException{
     if (isDt38IsstotIndModified()) { 
        dt38IsstotInd = refreshDt38IsstotInd();
     }
   		return dt38IsstotInd;
   }

  
	/**
	*  set variable dt38IsstotInd
	*  Corresponding COBOL Variable is DT3-8-ISSTOT-IND
	*  @param value
	**/
   public void setDt38IsstotInd(char[] value) {
      dt38IsstotInd = checkDt38IsstotIndConstraints(value);
      serializeDt38IsstotInd(dt38IsstotInd);
   } 

     /**
	 * 	Update Dt38IsstotInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt38IsstotInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt38IsstotInd,dt38IsstotInd.length);
   	
   }
   
   public void setDt38IsstotInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotInd,dt38IsstotInd.length);
   	
   }
   
     /**
	 * 	Update Dt38IsstotInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt38IsstotInd with another Field
	 *	@param value
	 */
   public void setDt38IsstotInd(Field source) {
       replace(source,0,source.length(),beginDt38IsstotInd,DT_38_ISSTOT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt38IsstotInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt38IsstotInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt38IsstotInd,DT_38_ISSTOT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt38IsstotInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt38IsstotInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt38IsstotInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln8FieldLength() {
			return DT_PAGE_3_LN_8_LENGTH;
		}

}
  
